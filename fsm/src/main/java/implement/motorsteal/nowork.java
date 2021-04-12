package implement.motorsteal;

import framework.FSM;
import framework.FSMFactory;
import framework.state.FSMChainState;
import implement.motorsteal.state.Escape;
import implement.motorsteal.state.Prison;
import implement.motorsteal.state.SearchTarget;
import implement.motorsteal.state.StealMotor;

public class nowork {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        FSMFactory factory = FSMFactory.getInstance();
        FSM fsm= factory.createFSM();

        SearchTarget initState = new  SearchTarget();

        initState.andThen(SearchTarget.class)
                 .andThen(StealMotor.class)
                .andThen(Escape.class)
                .andThen(Prison.class);


        fsm.run(initState);
    }
}
