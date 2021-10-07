package singleton;
//懒汉式
public class LazilySingleton {
    private static LazilySingleton lazilySingleton;
    private LazilySingleton(){//构造器必须是私有的，否则主程序可通过new LazilySingleton()创造出不同的实例
    }
    public static LazilySingleton getSingleton(){//线程不安全
        if(lazilySingleton==null)
            lazilySingleton=new LazilySingleton();
        return lazilySingleton;
    }
    /*public static synchronized LazilySingleton getSingleton(){//线程安全
        if(lazilySingleton==null)
            lazilySingleton=new LazilySingleton();
        return lazilySingleton;
    }*/
    public static void main(String[] args) {
        System.out.println("取到该单例为："+LazilySingleton.getSingleton());
    }
}
