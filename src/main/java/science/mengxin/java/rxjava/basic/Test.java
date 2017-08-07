package science.mengxin.java.rxjava.basic;

/**
 * User:    mengxin
 * Date:    07/08/2017
 * Project: rxjava-example
 * Package: science.mengxin.java.rxjava.basic
 * Description: Test.
 *
 * @author mengxin
 * @version 1.0
 */
public class Test {

    public static void main(String [] args){
        //被观察者
        MyObservable myObservable = new MyObservable();
        //观察者
        MyObserver observerTest = new MyObserver(myObservable);

        myObservable.setData(1);
        myObservable.setData(2);
        myObservable.setData(2);
        myObservable.setData(3);

    }
}