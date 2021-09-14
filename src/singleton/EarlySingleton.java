package singleton;

public class EarlySingleton {
    private static EarlySingleton earlySingleton;
    private EarlySingleton(){
    }
    public static EarlySingleton getSingleton(){//线程不安全
        if(earlySingleton==null)
            earlySingleton=new EarlySingleton();
        return earlySingleton;
    }
    /*public static synchronized EarlySingleton getSingleton(){//线程安全
        if(earlySingleton==null)
            earlySingleton=new EarlySingleton();
        return earlySingleton;
    }*/
    public static void main(String[] args) {
        System.out.println("取到该单例为："+EarlySingleton.getSingleton());
    }
}
