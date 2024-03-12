public class Circle extends Shape{

    public Circle(Color c){
        super(c);
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawing");
        c.fill();
    }
}
