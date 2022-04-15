import java.util.ArrayList;
import java.util.Scanner;
public class App {

    static int Manastone;
    static int Magical = 0;
    static ArrayList<String> NamaBenda = new ArrayList<String>();
    static ArrayList<String> ManaBenda = new ArrayList<String>();
    static ArrayList<String> UkuranBenda = new ArrayList<String>();

    Scanner Magic = new Scanner(System.in);

    public static void MagicSpell(int input1, int input2) {
        if (input1 == input2 || input1 > input2) {
            System.out.println(" ~~~~~~ Abracadabra Cling Cling ~~~~~~  ");
        }

        else if (input1 < input2) {
            System.out.println(" Spell is Wrong ");
        }
    }

    public static void main(String[] args) throws Exception {
        int ManaofMana;
        int choose = 0;
        Scanner Magic = new Scanner(System.in);


        while (choose != 8) {
            System.out.println(" _____________________________________________________________");
            System.out.println(" ===============  One stick to summon them all  ==============");
            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Dashboard : ");
            System.out.println(" 1. Set Mana of Wand ");
            System.out.println(" 2. Summon Creature ");
            System.out.println(" 3. Move Object ");
            System.out.println(" 4. Undo ");
            System.out.println(" 5. Seal Again ");
            System.out.println(" 6. Last Condition of Wand ");
            System.out.println(" 7. Log out ");
            System.out.println(" _____________________________________________________________");
            System.out.println(" \n ");
            System.out.print(" Please Input Here : ");
            choose = Magic.nextInt();
            Magic.nextLine();

            ContractSeal Castspell = new ContractSeal();
            Magicwand Wand = new Magicwand();

            if (choose == 1) {
                System.out.println(" ===============  Set Mana  ==============");
                System.out.println(" 1. Maximun ");
                System.out.println(" 2. Medium ");
                System.out.println(" 3. Minimum ");
                System.out.print(" Please Input Here : ");

                ManaofMana = Magic.nextInt();
                Magic.nextLine();

                if (ManaofMana == 1) {
                    Manastone = 100;
                } else if (ManaofMana == 2) {
                    Manastone = 50;
                } else if (ManaofMana == 3) {
                    Manastone = 20;
                }
            } else if (choose == 2) {
                String Checkpoint;

                int Manaofcreature = 0;

                if (NamaBenda.isEmpty()) {
                    Castspell.SummonLivingCreature(NamaBenda, UkuranBenda, ManaBenda);
                    if (UkuranBenda.get(Magical) == " Large ") {
                        Manaofcreature = 100;
                    } else if (UkuranBenda.get(Magical) == " Middle ") {
                        Manaofcreature = 50;
                    } else if (UkuranBenda.get(Magical) == " Slight ") {
                        Manaofcreature = 20;
                    }

                    MagicSpell(Manastone, Manaofcreature);
                    System.out.println(" ===============  Summon Creature  ==============");
                    System.out.println(" Input Name of the Creature : ");
                    System.out.println(" Creature Name : " + NamaBenda.get(Magical));
                    System.out.println(" Level of size : " + UkuranBenda.get(Magical));

                    Magical++;
                } else {
                    System.out.println(NamaBenda.size());
                    Castspell.SummonLivingCreature(NamaBenda, UkuranBenda, ManaBenda);
                    System.out.println(Castspell.Checkpoint);
                    if (Castspell.Again(NamaBenda) && Castspell.gohere) {
                        System.out.println(" Welcome Back ");
                    } else {
                        if (UkuranBenda.get(Magical) == " Large ") {
                            Manaofcreature = 100;
                        } else if (UkuranBenda.get(Magical) == " Middle ") {
                            Manaofcreature = 50;
                        } else if (UkuranBenda.get(Magical) == " Slight ") {
                            Manaofcreature = 20;
                        }

                        MagicSpell(Manastone, Manaofcreature);
                        System.out.println(" ===============  Summon Creature  ==============");
                        System.out.println(" Input Name of the Creature : ");
                        System.out.println(" Creature Name : " + NamaBenda.get(Magical));
                        System.out.println(" Level of size : " + UkuranBenda.get(Magical));

                        Magical++;

                    }
                }
            }

            else if (choose == 3) {
                Castspell.Creaturemove(NamaBenda, UkuranBenda, ManaBenda);
                int Manaofcreature = 0;
                if (UkuranBenda.get(Magical) == " Large ") {
                    Manaofcreature = 100;
                } else if (UkuranBenda.get(Magical) == " Middle ") {
                    Manaofcreature = 50;
                } else if (UkuranBenda.get(Magical) == " Slight ") {
                    Manaofcreature = 20;
                }

                MagicSpell(Manastone, Manaofcreature);
                System.out.println(" ===============  Move Object  ==============");
                System.out.println(" Input Name of the Object : ");
                System.out.println(" Objetc Name : " + NamaBenda.get(Magical));
                System.out.println(" Level of size : " + UkuranBenda.get(Magical));

                Magical++;

            }

            else if (choose == 4) {
                System.out.println(" ===============  Undo  ==============");
                if (ManaBenda.get (Magical - 1) == " Maximum ") {
                    Manastone = 100;
                    System.out.println (" Mana has Been Upgrade into Maximum "); 
                }

                else if (ManaBenda.get(Magical - 1) == " Medium ") {
                    Manastone = 50;
                    System.out.println (" Mana has Been Upgrade into Medium ");
                }

                else if (ManaBenda.get(Magical - 1) == " Minimum ") {
                    Manastone = 20;
                    System.out.println (" Mana has Been Upgrade into Minimum ");
                }
                Wand.Undo(NamaBenda, UkuranBenda, ManaBenda, Magical);

                Magical--;
            }

            else if (choose == 5) {
                Wand.Re_seal(NamaBenda, UkuranBenda, ManaBenda, Magical);

                Magical--;
            }

            else if (choose == 6) {
                System.out.println(" =============== Lat Condition of Wand ==============");
                System.out.println (" Level of Mana = " + Manastone);
            }

            else {
                System.out.println(" ========================================");
                System.out.println(" ========== Hope It Will Work ===========");
                System.out.println(" ====== because coding is fun ^_^  ======");
                System.out.println(" ========================================");
                break;
            }
        
        }
                
    }
}
