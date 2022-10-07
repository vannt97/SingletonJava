public class Singleton {
    private static Singleton instance;
    private Singleton(){
    }
    public static Singleton getInstance(){
        System.out.println("create instance....");
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
