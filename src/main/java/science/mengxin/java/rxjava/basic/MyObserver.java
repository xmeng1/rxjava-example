package science.mengxin.java.rxjava.basic;

import java.util.Observable;
import java.util.Observer;

/**
 * User:    mengxin
 * Date:    07/08/2017
 * Project: rxjava-example
 * Package: science.mengxin.java.rxjava.basic
 * Description: MyObserver.
 *
 * @author mengxin
 * @version 1.0
 */
public class MyObserver implements Observer {

    public MyObserver(MyObservable myObservable) {
        //监听
        myObservable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.print("data is changed:" + ((MyObservable)o).getData() + "\n");
    }
}
