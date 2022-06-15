import java.util.Scanner;

public class ConsoleAdventureGame {

    public static String addName() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.err.println("Name your character -");
        String userInput = scanner.next().toUpperCase();
        return userInput;
    }

    public static String characterType() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.err.println("Choose your type - [Mage/Knight]");
        String userInput = scanner.next().toUpperCase();
        return userInput;
    }

    public static int Attack(int attackPoints, int enemyHealth) {
        enemyHealth -= attackPoints;
        System.out.println("You attacked !");
        return enemyHealth;
    }

    public static int Heal(int health, int potion) {
        if (health <= 80) {
            health += 20;
        } else if (health > 80) {
            System.out.println("No affect, health full.");
        }
        return health;
    }

    public static int EnemyAttack(int health, int enemyAttack) {
        health -= enemyAttack;
        System.out.println("You've been attacked !");
        return health;
    }

    public static void RpgDialog() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.err.print("YOU HAVE ENTERED THE UNDERWORLD THROUGH A HIDDEN GATE!\n******\n");
        String read;
        String name = addName();
        String type = characterType();
        System.out.printf("%s, The %s! Your journey has started!%n*****%n", name, type);

        int health = 100;
        int attackPoints = 15;
        int potion = 3;
        int enemyHealth = 100;
        int enemyAttack = 15;
        if (type.equalsIgnoreCase("mage")) {
            System.out.println("You begin to travel west as your destination is at the end of a 100 mile walk through the DARK FOREST to the Mage's Temple\nYou encounter a hidden cave on your way.\n******\n");
            System.err.println("Do you wish to enter? [Y/N]");

        } else if (type.equalsIgnoreCase("knight")) {
            System.out.println("You begin to travel west as your destination is at the end of a 100 mile walk through the DARK FOREST to the Knight's Fortress!\nYou encounter a hidden ruin on your way.\n******\n");
            System.err.println("Do you wish to enter? [Y/N]");
        }
        String enterOrNot = scanner.next();
        if (enterOrNot.equalsIgnoreCase("y")) {
            if (type.equalsIgnoreCase("mage")) {
                System.out.println("You enter the cave and encounter a stranger\n Stranger: hello ? who's there? Do you have any water for a poor old man ?\n******\n");
                System.err.println("Give water ? [Y/N]");
                String giveWater = scanner.next();
                if (giveWater.equalsIgnoreCase("y")) {
                    System.out.println("Stranger: Thank you! this is all i have to repay you i hope it helps.\n\n");
                    System.err.println("*You were rewarded The mages staff*");
                    attackPoints = 20;
                    System.err.printf("Attack power increased +%d", attackPoints);
                } else if (giveWater.equalsIgnoreCase("n")) {
                    System.err.println("Stranger: THEN GET OUT !\n*You have exited the cave*");
                }
            } else if (type.equalsIgnoreCase("knight")) {
                System.out.println("******\nYou enter the cave and encounter a stranger\n Stranger: hello ? who's there? Do you have any water for a poor old man ?\n******\n");
                System.err.println("Give water ? [Y/N]");
                String giveWater = scanner.next();
                if (giveWater.equalsIgnoreCase("y")) {
                    System.out.println("Stranger: Thank you! this is all i have to repay you i hope it helps.\n\n");
                    System.err.println("*You were rewarded The Excalibur*");
                    attackPoints = 30;
                    System.err.printf("Attack power increased +%d%n", attackPoints);
                } else if (giveWater.equalsIgnoreCase("n")) {
                    System.out.println("Stranger: THEN GET OUT !\n*You have exited the cave*");
                }
            }
        } else if (enterOrNot.equalsIgnoreCase("n")) {
            System.out.println("You ignore the cave and continue to your destination");
        }
        read = scanner.next();
        if (read.equals("")) {
            System.out.printf("""
                    ******
                    You finally arrive at your destination but they are under attack by goblins!
                    %s, The %s! TAKE THEM OUT!
                    ******
                    """, name, type);
        }
        read = scanner.next();
        if (read.equals("")) {
            System.err.println("""
                                                                         
                    ██████╗░░█████╗░████████╗████████╗██╗░░░░░███████╗██╗
                    ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║░░░░░██╔════╝██║
                    ██████╦╝███████║░░░██║░░░░░░██║░░░██║░░░░░█████╗░░██║
                    ██╔══██╗██╔══██║░░░██║░░░░░░██║░░░██║░░░░░██╔══╝░░╚═╝
                    ██████╦╝██║░░██║░░░██║░░░░░░██║░░░███████╗███████╗██╗
                    ╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░░░░╚═╝░░░╚══════╝╚══════╝╚═╝""");
        }

        System.out.printf("Health- %d Elixur-%d\nEnemy Health- %d%n", health, potion, enemyHealth);

        //        BATTLE
        while (enemyHealth > 0 && health > 0) {
            System.out.println("[ATTACK/HEAL]");
            String attackOrHeal = scanner.next();
            if (attackOrHeal.equalsIgnoreCase("attack")) {
                enemyHealth = Attack(attackPoints, enemyHealth);
                System.out.printf("Health- %d Elixur- %d\nEnemy Health- %d%n******%n", health, potion, enemyHealth);
            } else if (attackOrHeal.equalsIgnoreCase("heal")) {
                health = Heal(health, potion);
                potion--;
                System.out.printf("Health- %d Elixur- %d\nEnemy Health- %d%n******%n", health, potion, enemyHealth);
            }
            health = EnemyAttack(health, enemyAttack);
            System.out.printf("Health- %d Elixur- %d\nEnemy Health- %d%n******%n", health, potion, enemyHealth);
        }
        if (health > 0 && enemyHealth <= 0) {
            System.out.printf("""
                        ALL HAIL OUR NEW KING! SIR %s THE %s!
                    ******
                    You have been awarded *Gold Armor*
                    You have been awarded *King*
                    You have been awarded *HellFire Excalibur*
                    *Elixur +3*
                    *Attack points +30*""",name,type);
            read = scanner.next();
            if (read.equals("")) {
                System.err.println("""                    
                        █▄█ █▀█ █░█   ▄▀█ █▀█ █▀▀   █▄▀ █ █▄░█ █▀▀   █
                        ░█░ █▄█ █▄█   █▀█ █▀▄ ██▄   █░█ █ █░▀█ █▄█   ▄
                        """);
            }
        } else if (enemyHealth > 0 && health <= 0) {
            System.out.println("""
                    WE ARE DOOMED! WHO WILL SAVE US NOW ?
                    ******
                                        
                    ██╗░░░██╗░█████╗░██╗░░░██╗  ██████╗░██╗███████╗██████╗░
                    ╚██╗░██╔╝██╔══██╗██║░░░██║  ██╔══██╗██║██╔════╝██╔══██╗
                    ░╚████╔╝░██║░░██║██║░░░██║  ██║░░██║██║█████╗░░██║░░██║
                    ░░╚██╔╝░░██║░░██║██║░░░██║  ██║░░██║██║██╔══╝░░██║░░██║
                    ░░░██║░░░╚█████╔╝╚██████╔╝  ██████╔╝██║███████╗██████╔╝
                    ░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚═════╝░╚═╝╚══════╝╚═════╝░""");
            System.out.println("Continue ? [Y/N]");
            String cont = scanner.next();
            if (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("n")) {
                RpgDialog();
            }

        }
        health = 150;
        attackPoints += 30;
        potion += 3;
        System.out.printf("******\nYou've trained hard king,%s!%nHealth- %d Elixur- %d Attack- %d", name, health, potion, attackPoints);

    }


    public static void main(String[] args) {
        RpgDialog();

    }
}
