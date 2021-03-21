public class Computer {
    private String HDD;
    private String RAM;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnable;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    //Computer is only initialized by Builder object
    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
        this.isBluetoothEnable = builder.isBluetoothEnable;
    }

    /*************************** Builder class ***********************/

    public static class ComputerBuilder{
        private String HDD;
        private String RAM;

        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnable;

        public ComputerBuilder(String HDD, String RAM){
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnabled){
             this.isGraphicCardEnabled = isGraphicCardEnabled;
             return this;
        }

        public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable){
            this.isBluetoothEnable =  isBluetoothEnable;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }


    /*********************************************************************/

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB","2GB")
                .setBluetoothEnable(true)
                .setBluetoothEnable(true)
                .build();
    }
}
