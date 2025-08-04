package disco.base;

import lombok.Getter;
import lombok.Setter;

public class AINode {
    @Getter @Setter
    String modelId;
    @Getter @Setter
    String modelAuthor;
    @Getter @Setter
    String modelVersion;
    @Getter @Setter
    ModelType modelType;
    @Getter @Setter
    APIType apiType;
    @Getter @Setter
    long publishedDate;
    @Getter @Setter
    String modelUrl;

}
