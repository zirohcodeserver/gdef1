package transformer;

import transformer.base.InputComponent;
import transformer.base.OutputComponent;
import transformer.base.TransformerComponent;

public class Transformer extends TransformerComponent {

    String weightFilePath;

    public InputComponent getInputComponent() {
        return inputComponent;
    }

    public void setInputComponent(InputComponent inputComponent) {
        this.inputComponent = inputComponent;
    }

    InputComponent inputComponent;

    public OutputComponent getOutputComponent() {
        return outputComponent;
    }

    public void setOutputComponent(OutputComponent outputComponent) {
        this.outputComponent = outputComponent;
    }

    OutputComponent outputComponent;

    @Override
    public void execute() {

    }

    @Override
    public void init() {

    }

    public void setWeightFilePath(String weightFilePath) {
        this.weightFilePath = weightFilePath;
    }

    public String getWeightFilePath() {
        return weightFilePath;
    }
}
