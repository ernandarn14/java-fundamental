package InheritancePolimorfism.src;

public class App {
    public static void main(String[] args) throws Exception {
        // Textbox textbox = new Textbox(false, "ini text");
        //  Textbox textbox = new Textbox();

        Input input = new Input();
        // Input input2 = new Input();

        // System.out.println(input.equals(input2));
        show(input);

        // textbox.setText("halo");
        // textbox.clear();

        // input.disable();

        // System.out.println(textbox.toString());

        // Point poin = new Point(1, 2);
        // Point poin2 = new Point(1, 2);

        // System.out.println(poin.equals(poin2));
        // System.out.println(poin.hashCode());
        // System.out.println(poin2.hashCode());

        // Input[] inputs = { new Textbox(), new Checkbox()};

        // for (var input : inputs) {
        //     input.render();
        // }

        // for (int i=0; i < inputs.length; i++){
        //     inputs[i].render();
        // }

    }
    public static void show(Input input) {
        if (input instanceof Textbox) {
            Textbox textBox = (Textbox) input;
            textBox.setText("Text sudah diganti");
        }

        System.out.println(input);
    }
}
