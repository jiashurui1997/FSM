public class FSMFactory {

    private FSMFactory instance;

    private FSMFactory(){

    }

    public synchronized FSMFactory getInstance() {
        if(instance == null ){
            instance = new FSMFactory();
        }
        return instance;
    }

    public FSM createFSM(){
        return null;
    }
}