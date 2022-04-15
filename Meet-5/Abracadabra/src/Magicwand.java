
import java.util.ArrayList;
import java.util.Scanner;

public class Magicwand {

    ArrayList<String> NamaBenda = new ArrayList<String>();
    ArrayList<String> ManaBenda = new ArrayList<String>();
    ArrayList<String> UkuranBenda = new ArrayList<String>();
    Scanner Magic = new Scanner(System.in);

    ContractSeal passMagical = new ContractSeal();

    public void Re_seal ( ArrayList<String> NamaBenda, ArrayList<String> UkuranBenda, ArrayList<String> ManaBenda, int Magical ) {
        NamaBenda.remove(Magical - 1);
        UkuranBenda.remove(Magical - 1);
        ManaBenda.remove(Magical - 1);
        Magical--;
        System.out.println(" All Success!! ");
    }

    public void Undo ( ArrayList<String> NamaBenda, ArrayList<String> UkuranBenda, ArrayList<String> ManaBenda, int Magical ) {
        NamaBenda.remove(Magical - 1);
        UkuranBenda.remove(Magical - 1);
        ManaBenda.remove(Magical - 1);
        System.out.println(" Undo Spell Success!! ");
    }

}
