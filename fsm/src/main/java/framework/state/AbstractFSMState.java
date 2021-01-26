package state;

public interface AbstractFSMState {

    void onEnter();

    void onExecute();

    void onException(Throwable e);
}