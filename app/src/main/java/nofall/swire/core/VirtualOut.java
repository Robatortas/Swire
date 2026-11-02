package nofall.swire.core;
/**
 * <b>VirtualOut</b> is a class that represents a virtual output component in the Swire framework.
 * <br>
 * This class is designed to handle the output of audio data to a virtual destination.
 * This virtual destination can be used for various purposes, such as routing audio to different applications or devices.
 */
public class VirtualOut {
    
    private String outputName;

    public void VirtualOut() {

    }

    public void Start() {
        // Logic to start the virtual output
    }

    public void setOutputName(String name) {
        this.outputName = name;
    }

    public String getOutputName() {
        return this.outputName;
    }
}
