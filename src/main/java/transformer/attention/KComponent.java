        package transformer.attention;

        import transformer.base.Size;
        import transformer.base.TransformerComponent;

        public class KComponent extends TransformerComponent {
            int kCount;
            public static KComponent create(int vectorDimension, int numberOfHeads, int numberOfKey ) {
                KComponent kComponent=new KComponent();
                kComponent.kCount =numberOfKey;
                kComponent.size = new Size(vectorDimension,
                        Math.ceilDiv(vectorDimension, numberOfHeads));
                return kComponent;
            }

            public Size getSize() {
                return size;
            }

            int head;
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
