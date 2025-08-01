package transformer.attention;

import transformer.base.TransformerComponent;

public class AttentionHeadComponent extends TransformerComponent {

    public QComponent getqComponent() {
        return qComponent;
    }

    public void setqComponent(QComponent qComponent) {
        this.qComponent = qComponent;
    }

    public VComponent getvComponent() {
        return vComponent;
    }

    public void setvComponent(VComponent vComponent) {
        this.vComponent = vComponent;
    }

    public KComponent getkComponent() {
        return kComponent;
    }

    public void setkComponent(KComponent kComponent) {
        this.kComponent = kComponent;
    }

    public WOComponent getWoComponent() {
        return woComponent;
    }

    public void setWoComponent(WOComponent woComponent) {
        this.woComponent = woComponent;
    }

    QComponent qComponent;
    VComponent vComponent;
    KComponent kComponent;
    WOComponent woComponent;

    public static AttentionHeadComponent create(QComponent qComponent,
                                                KComponent kComponent, VComponent vComponent,
                                                WOComponent woComponent) {
        AttentionHeadComponent attentionHeadComponent =new AttentionHeadComponent();
        attentionHeadComponent.setkComponent(kComponent);
        attentionHeadComponent.setvComponent(vComponent);
        attentionHeadComponent.setqComponent(qComponent);
        attentionHeadComponent.setWoComponent(woComponent);
        return attentionHeadComponent;
    }

    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }
}
