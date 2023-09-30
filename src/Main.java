// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] listaProfessores ={"Alana","Thiago","Samanta","Alexia","Ordilei"};
        for(int contador = 0;contador < listaProfessores.length;contador++){
            System.out.println("0 indice atual e *" +
                    "+contador");
            if(contador ==0) {
                System.out.println("O numero de indice do(a);professor(a)" + listaProfessores[contador] + "e zero");
            } else if (contador% 2 ==0){
                    System.out.println("O numero de indice do(a);professor(a)"+listaProfessores[contador]+"e par");

                }else{
                System.out.println("O numero de indice do(a);professor(a)"+listaProfessores[contador]+"e impar");
            }

        }
    }
}