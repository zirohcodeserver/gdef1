package disco;

public interface Discovery {
    Result register(AINode node);
    Result deregister(String ainode);
    SearchResult find(String query);
}
