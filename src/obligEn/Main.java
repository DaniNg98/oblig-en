package obligEn;

public class Main{
    public static void main(String []args){

        int[] a = {1,2,3,20,-23,18,40,33,-40};
        char[] b = {'a','n','b','e','f'};
        String h = "HEIIIII";
        String k = "velkommenyess";
        //System.out.println("Verdien til det største tallet i listen er "+Oppg1.maks(a));
        //System.out.println("Antall ombyttinger er "+ Oppg1.ombyttinger(a));
        //System.out.println("Antall ulike sorter er "+Oppg2.antallUlikeSortert(a));
        //System.out.println("Antall ulike tall er "+Oppg3.antallUlikeSortert(a));
        Oppg4.delsortering(a);
        Oppg5.rotasjon(b);
        Oppg6.rotasjon(b,2);
        System.out.println(Oppg7.flett(h,k));


        }
}