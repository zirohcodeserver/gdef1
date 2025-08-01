package transformer.attention;

import transformer.base.Size;
import transformer.base.TransformerComponent;

public class QComponent extends TransformerComponent {

    int headCount;
    public static QComponent create(int vectorDimension, int numberOfHeads ) {
       QComponent qComponent=new QComponent();
        qComponent.headCount=numberOfHeads;
        qComponent.size = new Size(vectorDimension,
                Math.ceilDiv(vectorDimension, numberOfHeads));
        return qComponent;
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
