package framework;

import framework.selector.AbstractFSMStateSelector;
import framework.selector.DefaultSelector;
import framework.selector.StateSelectStrategy;
import framework.state.AbstractFSMState;

import java.util.HashMap;
import java.util.Queue;

public class FSM {

    AbstractFSMState currentState;

    AbstractFSMContext context;

    AbstractFSMStateSelector selector;

    Queue<String> signalQueue;

    StateSelectStrategy globalStrategy = StateSelectStrategy.CHAIN;

    HashMap<Class<? extends AbstractFSMState>, StateSelectStrategy> stateSelectMap;

    /**
     * Just overwrite it if you want a specific machine
     *
     * **/
    public void run(AbstractFSMState initState){
        selector = new DefaultSelector();
        currentState = initState ;

        while(currentState != null) {
            try {
                currentState.onEnter();
                currentState.onExecute();
            }catch (Exception e){
                currentState.onException(e);
            }finally {
                currentState = selector.selectNextState(currentState,globalStrategy);
            }
        }
    }
}
