package transformer.attention;

import transformer.base.Size;
import transformer.base.TransformerComponent;

public class VComponent extends TransformerComponent {

    int vCount;
    public static VComponent create(int vectorDimension, int numberOfHeads, int numberOfV ) {
        VComponent vComponent=new VComponent();
        vComponent.vCount =numberOfV;
        vComponent.size = new Size(vectorDimension,
                Math.ceilDiv(vectorDimension, numberOfHeads));
        return vComponent;
    }
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    Size size;
    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }
}
