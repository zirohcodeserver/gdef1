package disco.db.common;

import disco.base.Result;
import disco.base.SearchResult;
import disco.base.AINode;

public interface Discovery {
    Result register(AINode node);
    Result deregister(String nodeId);
    SearchResult find(String query);
}
