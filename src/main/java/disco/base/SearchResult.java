package disco.base;

import java.util.Vector;

public class SearchResult extends Result {

    Vector<AINode> searchCollection;

    public SearchResult() {
        this.searchCollection = new Vector<>();
    }

    public AINode[] getResults() {
        return this.searchCollection.toArray(new AINode[this.searchCollection.size()]);
    }

    public void add(AINode node) {
        this.searchCollection.add(node);
    }

}
