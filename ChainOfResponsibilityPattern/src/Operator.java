public interface Operator {
    public void operation(Double x, Double y, String s);
    public void next(Operator op);
}
