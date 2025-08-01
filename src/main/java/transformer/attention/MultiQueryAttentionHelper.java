package transformer.attention;

public class MultiQueryAttentionHelper {
    public AttentionHeadComponent create(int vectorDimension, int numberOfQHeads) {
        QComponent qComponent = QComponent.create(vectorDimension,numberOfQHeads);
        KComponent kComponent = KComponent.create(vectorDimension,numberOfQHeads, 1);
        VComponent vComponent = VComponent.create(vectorDimension,numberOfQHeads,1);
        WOComponent woComponent = WOComponent.create(vectorDimension);
        return AttentionHeadComponent.create(qComponent, kComponent, vComponent, woComponent);
    }
}
