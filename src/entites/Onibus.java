package entites;

public class Onibus extends Veiculo {//herança
    private Integer assentos;

   public Onibus(){

   };
    public Onibus(String motor) {
        super(motor);
    }

    public Onibus(Integer assentos) {
        this.assentos = assentos;
    }

    public Onibus(String motor, Integer assentos){
        super(motor);
        this.assentos = assentos;
    }

   public Onibus(String motor, String cor, String fabricante, Integer assentos){
        super(motor, cor, fabricante);
        this.assentos = assentos;
   }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }
}
