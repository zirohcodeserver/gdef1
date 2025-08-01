package disco;

public interface Discovery {
    Result register();
    Result deregister();
    Result find(String query);
}
