package observer;
import java.util.ArrayList;
import java.util.List;
//观察者模式
class Child{
    String name;
    String message="null";
    public void setMessage(String message) {
        this.message = message;
    }
    public String toString(){
        return name+"接收到妈妈的消息有："+message;
    }
};
class A extends Child{public A(){name="孩子A";}};
class B extends Child{public B(){name="孩子B";}};
class C extends Child{public C(){name="孩子C";}};
public class Observer {
    public static void main(String[] args) {
        List<Child> list= new ArrayList<Child>(){{  //孩子A、孩子B在List集合里注册
            add(new A());
            add(new B());
        }};
        for(Child child:list){
            child.setMessage("吃饭了");   //妈妈有新消息，即可通过遍历List集合，确保在在List集合里注册过的孩子都会接收到通知
        }
        C c = new C();
        list.add(c);//孩子C在妈妈通知后再注册，先前的消息接收不到
        System.out.println(list);
    }
}
