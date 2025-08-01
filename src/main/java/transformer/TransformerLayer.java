package transformer;

import transformer.base.TransformerComponent;

public class TransformerLayer extends TransformerComponent {

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void setNumberOfLayers(int numberOfLayers) {
        this.numberOfLayers = numberOfLayers;
    }

    int numberOfLayers;

    public static TransformerLayer create() {
        return new TransformerLayer();
    }

    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }


}
