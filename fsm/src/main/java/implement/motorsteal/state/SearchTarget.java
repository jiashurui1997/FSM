package implement.motorsteal.state;

import framework.state.FSMChainState;

public class SearchTarget extends FSMChainState {

    public void onEnter() {
        System.out.println("寻找电瓶车");
    }

    public void onExecute() {
        System.out.println("找到电瓶车了");
    }

    public void onException(Throwable e) {
        System.out.println("没找到电瓶车");
    }
}