public class multilevel {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.videocall();
        sp.voice_msg();
        cellphone cp = new cellphone();
        System.out.println("Cell Phone features");
        cp.message();
    }
}
