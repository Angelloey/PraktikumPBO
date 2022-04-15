import java.util.Scanner;
import java.util.ArrayList;

public class ContractSeal {

    String Checkpoint;
    boolean gohere = false;
    Scanner Magic = new Scanner(System.in);
    int choose;

    ArrayList<String> NamaBenda = new ArrayList<String>();
    ArrayList<String> ManaBenda = new ArrayList<String>();
    ArrayList<String> UkuranBenda = new ArrayList<String>();

    public boolean Again(ArrayList<String> NamaBenda) {
        if (NamaBenda.contains(Checkpoint)) {
            return true;
        }
        gohere = false;
        return false;
    }

    public void SummonLivingCreature(ArrayList<String> NamaBenda, ArrayList<String> UkuranBenda, ArrayList<String> ManaBenda) {
        System.out.print(" Input Name of the Creature : ");
        Checkpoint = Magic.nextLine();

        if (Again(NamaBenda)) {
            System.out.println(" Spell Failed, Creature already exist ");
            gohere = true;
        } else {
            gohere = false;
            NamaBenda.add(Checkpoint);
            System.out.println(" Input Size of the Creature : ");
            System.out.println(" 1. Large ");
            System.out.println(" 2. Middle ");
            System.out.println(" 3. Slight ");
            System.out.print(" Please Input Here : ");
            choose = Magic.nextInt();

            if (choose == 1) {
                UkuranBenda.add(" Large ");
                ManaBenda.add(" Mana Large ");
            } else if (choose == 2) {
                UkuranBenda.add(" Middle ");
                ManaBenda.add(" Mana Medium ");

            } else if (choose == 3) {
                UkuranBenda.add(" Slight ");
                ManaBenda.add(" Mana Minimum ");
            }
        }
    }

    public void Creaturemove(ArrayList<String> NamaBenda, ArrayList<String> UkuranBenda, ArrayList<String> ManaBenda) {
        System.out.print(" Input Name of the Object : ");
        NamaBenda.add(Magic.nextLine());
        System.out.println(" Input Size of the Object : ");
        System.out.println(" 1. Large ");
        System.out.println(" 2. Middle ");
        System.out.println(" 3. Slight ");
        System.out.print(" Please Input Here : ");
        choose = Magic.nextInt();

        if (choose == 1) {
            UkuranBenda.add(" Large ");
            ManaBenda.add(" Mana Large ");
        } 
        else if (choose == 2) {
            UkuranBenda.add(" Middle ");
            ManaBenda.add(" Mana Medium ");

        } 
        else if (choose == 3) {
            UkuranBenda.add(" Slight ");
            ManaBenda.add(" Mana Minimum ");
        }
    }
}
