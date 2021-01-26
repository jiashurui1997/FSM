package framework;

import framework.state.AbstractFSMState;
import framework.state.FSMChainState;

/**
 * Define common strategy to select framework.FSM State
 * **/
public enum StateSelectStrategy {
    NONE{
        public AbstractFSMState select(FSMChainState state){
            return null;
        }
    },
    CHAIN{
        public AbstractFSMState select(FSMChainState currentState){
            return currentState.nextState;
        }
    };

    public AbstractFSMState select(AbstractFSMState currentState) {
        return null;
    }


}