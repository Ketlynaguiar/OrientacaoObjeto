
package programa;
import entites.Onibus;
import entites.Veiculo;

public class Aplicacao {
    public static void main(String[] args) {

        //instanciando objeto
        Veiculo carro = new Veiculo();

        carro.setMotor("V12"); //encapsulamento
        System.out.println(carro.getMotor());


        Veiculo carro1 = new Veiculo("V8", 80.0);
        System.out.println(carro1.getMotor());//polimorfismo

        Onibus onibus = new Onibus();
        onibus.setAssentos(46);
        onibus.setMotor("V12");

        System.out.println(onibus.getAssentos());
        System.out.println(onibus.getMotor());



    }
}
