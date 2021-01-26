import state.AbstractFSMState;

import java.util.Queue;

public abstract class FSM {

    AbstractFSMState currentState;

    AbstractFSMContext context;

    AbstractFSMStateSelector selector;

    Queue<String> signalQueue;


    /**
     * Just overwrite it if you want a specific machine
     *
     * **/
    public void run(){

        while(currentState != null) {
            try {
                currentState.onEnter();
                currentState.onExecute();
            }catch (Exception e){
                currentState.onException(e);
            }finally {
                currentState = selector.selectNextState(currentState);
            }
        }
    }
}
