package InheritancePolimorfism.src;

public abstract class Input {
    private boolean isEnabled;

    // public Input(boolean isEnabled){
    // System.out.println("ini class input");
    // this.isEnabled = isEnabled();
    // }

    public Input() {
        // System.out.println("ini class input");
    }

    public void render() {

    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public String toString() {
        return "Ini toString Input";
    }
}