/*
Master collected with Slave through Adapter
when Master rotates, Slave will be rotated too
 */

public class Main {
    public static void main(String[] args) {
        Slave slave = new Slave();
        Master master = new Master(slave);

        master.rotate();
    }
}
