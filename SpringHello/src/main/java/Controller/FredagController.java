package Controller;

import Services.ErDetFredag;

public class FredagController {
    public String fredag () {
    if (ErDetFredag.test == 6){
        return "ja det er fredag";
    }else {
        return "det er ikke fredag";
    }
    }

}
