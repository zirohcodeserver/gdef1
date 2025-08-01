package transformer.attention;

public class MultiHeadAttentionHelper {
    public AttentionHeadComponent create(int vectorDimension, int numberOfQHeads) {
        QComponent qComponent = QComponent.create(vectorDimension,numberOfQHeads);
        KComponent kComponent = KComponent.create(vectorDimension,numberOfQHeads, numberOfQHeads);
        VComponent vComponent = VComponent.create(vectorDimension,numberOfQHeads,numberOfQHeads);
        WOComponent woComponent = WOComponent.create(vectorDimension);
        return AttentionHeadComponent.create(qComponent, kComponent, vComponent, woComponent);
    }
}
