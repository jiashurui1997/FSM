package framework.state;

public class FSMChainState implements AbstractFSMState{

    public FSMChainState nextState;

    public void onEnter() {

    }

    public void onExecute() {

    }

    public void onException(Throwable e) {

    }

    public FSMChainState andThen(Class<? extends FSMChainState> nextStateClass) throws IllegalAccessException, InstantiationException {
        return this.nextState = nextStateClass.newInstance();
    }
}
