public class FcatoryProducer {
    private Button button;
    private Checkbox checkbox;

    public FcatoryProducer(GUIFactory gf) {
        button = gf.createButton();
        checkbox = gf.createCheckbox();
    }
    public void view(){
        button.view();
        checkbox.view();
    }
}
