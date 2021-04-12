package framework.selector;

import framework.state.AbstractFSMState;

public abstract class AbstractFSMStateSelector {

    protected AbstractFSMState currentState;
    /**
     *根据当前的状态去选择下一个状态(指定策略)
     *
     * **/
    public abstract AbstractFSMState selectNextState(AbstractFSMState currentState, StateSelectStrategy strategy);

    /**
     *根据当前的状态去选择下一个状态(全局策略)
     * **/
    AbstractFSMState selectNextState(AbstractFSMState currentState){
        return this.selectNextState(currentState,StateSelectStrategy.NONE);
    }
}
