package BridgeAbstract;

public abstract class AbstractRemoteController {
   private TvIFace tvIFace;

    public AbstractRemoteController(TvIFace _tvIFace){
        this.tvIFace = _tvIFace;
   }

    public void turnOn(){
        tvIFace.turnOn();
   }

   public void  turnOff(){
        tvIFace.turnOff();
   }

   public void setChannel(int channel){
        tvIFace.setChannel(channel);
   }

   public void showInfoTV(){
        tvIFace.showInfo();
   }


}
