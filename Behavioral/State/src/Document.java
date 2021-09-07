import State.State;

public class Document {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void processData(){
        state.handleState();
    }
}
