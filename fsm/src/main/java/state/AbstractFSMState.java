public abstract class AbstractFSMState {
    
    public abstract void onEnter();

    public abstract void onExecute();

    public abstract void onException(Throwable e);

}