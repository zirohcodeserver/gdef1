package org.example;

import transformer.Transformer;
import transformer.TransformerLayer;
import transformer.attention.AttentionHeadComponent;
import transformer.attention.MultiQueryAttentionHelper;
import transformer.base.InputComponent;
import transformer.base.OutputComponent;
import transformer.head.TransformerHead;
import transformer.mlp.ActivatitionType;
import transformer.mlp.MLPComponent;
import transformer.normalisation.LayerNormComponent;
import transformer.residual.ResidueComponent;
import transformer.tokenizer.SentenceTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {

            //tokenizer
            SentenceTokenizer tokenizer=SentenceTokenizer.create();
            // layer def
            TransformerLayer layer= new TransformerLayer();
            layer.setNumberOfLayers(32);
            InputComponent inputComponent =new InputComponent(200,1536);

            LayerNormComponent layer_layerNormComponent= LayerNormComponent.create();

            AttentionHeadComponent attentionHeadComponentComponent = new
                    MultiQueryAttentionHelper().create(4544,71);

            MLPComponent mlpComponent = MLPComponent.create(4544,4, ActivatitionType.GELU);
            ResidueComponent residualComponent= ResidueComponent.create();
            //layer wiring up
            layer_layerNormComponent.to.add(attentionHeadComponentComponent);
            layer_layerNormComponent.to.add(mlpComponent);
            attentionHeadComponentComponent.to.add(residualComponent);
            mlpComponent.to.add(residualComponent);

            // head
            TransformerHead headComponent=TransformerHead.create();
            LayerNormComponent head_layerNormComponent= LayerNormComponent.create();
            headComponent.to.add(head_layerNormComponent);

            //wire up the complete transformer
            Transformer falcon7b=new Transformer();
            falcon7b.setInputComponent(inputComponent);
            OutputComponent outputComponent=new OutputComponent(1,1536);
            falcon7b.setOutputComponent(outputComponent);
            tokenizer.to.add(layer);
            layer.to.add(headComponent);
            falcon7b.to.add(tokenizer);

            String weightFilePath="";
            falcon7b.setWeightFilePath(weightFilePath);
            falcon7b.init();
            falcon7b.execute();
            }
        }
