package transformer.mlp;

import transformer.base.TransformerComponent;

public class MLPComponent extends TransformerComponent {

    UpProjectionComponent upProjectionComponent;
    DownProjectionComponent downProjectionComponent;
    public static MLPComponent create(int vectorDimension, int upsize, ActivatitionType activatitionType) {
        MLPComponent mlpComponent=new MLPComponent();
        mlpComponent.upProjectionComponent =new UpProjectionComponent(vectorDimension,upsize, activatitionType);
        mlpComponent.downProjectionComponent =new DownProjectionComponent(upsize,vectorDimension);
        return mlpComponent;
    }


    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }
}
