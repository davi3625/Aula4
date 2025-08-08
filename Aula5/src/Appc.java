import br.com.carro.Carro;

public class Appc {
    public static void main(String[] args) {
        Carro Carro1 = new Carro();
        Carro Carro2 = new Carro();
        Carro Carro3 = new Carro();


        Carro1.Marca = " porsche ";
        Carro1.Modelo = " carrera ";
        Carro1.ano = 2019;

        Carro2.Marca = " porsche ";
        Carro2.Modelo = " carrera ";
        Carro2.ano = 2019;

        Carro3.Marca = " porsche ";
        Carro3.Modelo = " carrera ";
        Carro3.ano = 2019;







        System.out.println("A marca do meu Carro é: " +Carro1.Marca );
        System.out.println("\n");
        System.out.println("Modelo do meu carro é: " + Carro1.Modelo);
        System.out.println("\n");
        System.out.println(" Ano do meu carro é: " + Carro1.ano);

        System.out.println("A marca do meu Carro é: " +Carro2.Marca );
        System.out.println("\n");
        System.out.println("Modelo do meu carro é: " + Carro2.Modelo);
        System.out.println("\n");
        System.out.println(" Ano do meu carro é: " + Carro2.ano);

        System.out.println("A marca do meu Carro é: " +Carro3.Marca );
        System.out.println("\n");
        System.out.println("Modelo do meu carro é: " + Carro3.Modelo);
        System.out.println("\n");
        System.out.println(" Ano do meu carro é: " + Carro3.ano);


    }
}
