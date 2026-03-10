package org.Github.Dabson10.entidades;

public class ServicioLavado {
    private ServicioNormal serviNormal;
    private ServicioPremium serviPremium;

//    public ServicioLavado(ServicioNormal serviNormal, ServicioPremium serviPremium){
//        this.serviNormal = serviNormal;
//        this.serviPremium = serviPremium;
//    }


    public void setServiNormal(ServicioNormal serviNormal) {
        this.serviNormal = serviNormal;
    }

    public void setServiPremium(ServicioPremium serviPremium) {
        this.serviPremium = serviPremium;
    }
}
