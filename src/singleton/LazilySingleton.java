package singleton;
//懒汉式
public class LazilySingleton {
    private static LazilySingleton lazilySingleton=new LazilySingleton();
    private LazilySingleton(){
    }
    public static LazilySingleton getSingleton(){
        return lazilySingleton;
    }
    public static void main(String[] args) {
        System.out.println("取到该单例为："+LazilySingleton.getSingleton());
    }
}
