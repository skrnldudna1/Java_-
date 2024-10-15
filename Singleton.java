package 과제.교과서;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
