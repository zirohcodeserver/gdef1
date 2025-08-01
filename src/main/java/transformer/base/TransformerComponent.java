    package transformer.base;

    import java.util.Vector;

    public abstract class TransformerComponent {
        public Connections getConnections() {
            return connections;
        }

        public void setConnections(Connections connections) {
            this.connections = connections;
        }

        Connections connections;
        public Vector<TransformerComponent> from;
        public Vector<TransformerComponent> to;

        public TransformerComponent()
        {
            this.from=new Vector<>();
            this.to=new Vector<>();
            connections=new Connections() {{
                connectionType=ConnectionType.On_Device;
            }};
        }

        public abstract void execute();
        public abstract void init();
    }
