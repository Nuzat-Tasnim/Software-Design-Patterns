public class Square extends Shape{
    public Color C;
    public Square(Color c){
        super(c);
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawing");
        c.fill();
    }
}
