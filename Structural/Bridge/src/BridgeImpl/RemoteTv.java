package BridgeImpl;

import BridgeAbstract.AbstractRemoteController;
import BridgeAbstract.TvIFace;

public class RemoteTv extends AbstractRemoteController {

    public RemoteTv(TvIFace _tvIFace){
        super(_tvIFace);
    }

}
