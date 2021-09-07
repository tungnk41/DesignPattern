package Facade;

class CPU{
    public void processData(){}
}

class RAM{
    public void loadIntoRam(){}
}

class HardDrive{
    public void saveData(){}
}


/* Facade */
public class Computer {
    private RAM ram;
    private CPU cpu;
    private HardDrive hardDrive;

    public Computer(){
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDrive = new HardDrive();
    }

    public void calculateData(){
        cpu.processData();
        ram.loadIntoRam();
        hardDrive.saveData();
    }

}
