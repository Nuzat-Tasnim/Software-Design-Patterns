public class PC implements Computer{
    private String hdd;
    private String ram;
    private String cpu;

    public PC(String h,String r,String c){
        hdd=h;
        ram=r;
        cpu=c;
    }

    @Override
    public void view() {
        System.out.println("Call from PC");
        System.out.println(hdd+" "+ram+" "+cpu);
    }
}
