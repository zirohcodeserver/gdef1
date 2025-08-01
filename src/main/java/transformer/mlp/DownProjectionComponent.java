package transformer.mlp;

import transformer.base.Size;
import transformer.base.TransformerComponent;

public class DownProjectionComponent extends TransformerComponent {
    Size size;

    public static DownProjectionComponent create(int upSize, int vectorDimension)
    {
        return new DownProjectionComponent(upSize,vectorDimension);
    }


    public DownProjectionComponent(int upSize, int vectorDimension)
    {
        size=new Size(vectorDimension*upSize,vectorDimension);
    }
    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }
}
