package org.codeman.adapter;

import lombok.var;

/**
 * @author hdgaadd
 * Created on 2022/05/04
 *
 * Captain只能操作RowingBoat，要使Captain可操作FishingBoat，可以创建一个与RowingBoat相同类型的适配器，该适配器可操作
 * FishingBoat，故Captain可操作适配器来操作FishingBoat
 */
public final class App {
    /**
     * 外界不可以通过创建该对象，来使用该对象的非static方法
     */
    private App() {

    }

    public static void main(String[] args) {
        // lombok的var可以修饰方法中的局部变量，可不必设置具体类型，lombok会根据运行时的推断出类型
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
