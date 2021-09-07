package State;

public class ApproveState implements State{
    @Override
    public void handleState() {
        System.out.println("Approve data ... ");
    }
}
