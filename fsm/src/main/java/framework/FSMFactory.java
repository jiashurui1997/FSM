package framework;

public class FSMFactory {

    private static FSMFactory instance;

    private FSMFactory(){

    }

    public static synchronized FSMFactory getInstance() {
        if(instance == null ){
            instance = new FSMFactory();
        }
        return instance;
    }

    public FSM createFSM(){
        return new FSM();
    }
}