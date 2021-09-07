package State;

public class RejectState implements State{
    @Override
    public void handleState() {
        System.out.println("Reject data ... ");
    }
}
