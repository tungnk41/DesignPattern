import State.ApproveState;
import State.RejectState;
import State.SubmmitState;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.setState(new SubmmitState());
        document.processData();
        document.setState(new ApproveState());
        document.processData();
        document.setState(new RejectState());
        document.processData();
    }
}
