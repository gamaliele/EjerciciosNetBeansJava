package entidades;


public class razaArraylist {
    private String raza;

    public razaArraylist() {
    }

    public razaArraylist(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String toString() {
        return "Razas de perros :  " + raza ;
}
}