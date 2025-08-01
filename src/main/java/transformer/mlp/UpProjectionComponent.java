package transformer.mlp;

import transformer.base.Size;
import transformer.base.TransformerComponent;

public class UpProjectionComponent extends TransformerComponent {
    Size size;
    ActivatitionType activatitionType;
    public UpProjectionComponent(int vectorDimension, int upsize, ActivatitionType activatitionType)
    {
        size=new Size(vectorDimension,vectorDimension*upsize);
        this.activatitionType=activatitionType;
    }

    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }
}
