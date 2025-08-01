package transformer.attention;

import transformer.base.Size;
import transformer.base.TransformerComponent;

public class WOComponent extends TransformerComponent {
    Size size;

    int vCount;
    public static WOComponent create(int vectorDimension) {
        WOComponent woComponent=new WOComponent();
        woComponent.size = new Size(vectorDimension,
                vectorDimension);
        return woComponent;
    }

    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }
}
