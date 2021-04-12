package framework.selector;

import framework.state.AbstractFSMState;

public class DefaultSelector extends AbstractFSMStateSelector {

    public AbstractFSMState selectNextState(AbstractFSMState currentState, StateSelectStrategy strategy) {
        System.out.println("Default Selector");
        return strategy.select(currentState);
    }
}