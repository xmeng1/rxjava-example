package science.mengxin.java.rxjava.basic;

import java.util.Observable;

/**
 * User:    mengxin
 * Date:    07/08/2017
 * Project: rxjava-example
 * Package: science.mengxin.java.rxjava.basic
 * Description: MyObservable.
 *
 * @author mengxin
 * @version 1.0
 */
public class MyObservable extends Observable {
    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if(this.data != data){
            this.data = data;
            //发生改变，update方法调用
            setChanged();
            //通知观察者
            notifyObservers();
        }
    }
}
