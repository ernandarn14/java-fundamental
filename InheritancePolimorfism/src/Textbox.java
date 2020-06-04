package InheritancePolimorfism.src;

public class Textbox extends Input {
    private String text = "";

    // public Textbox(boolean isEnabled, String text){
    //     super(isEnabled());
    //     this.text = text;
    //     System.out.println("ini class textbox");
    // }

    public Textbox(){
        // super();
        System.out.println("ini class textbox");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }

    public void render() {
        System.out.println("render Textbox");
    }

    @Override
    public  String toString() {
        return this.text;
    }

    
}