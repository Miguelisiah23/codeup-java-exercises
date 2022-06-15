import java.util.Random;
import java.util.Scanner;

public class ConsoleAdventureGame {

    public static int miniGame(int attackPoints) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice1 = random.nextInt((6 + 1) - 1) + 1;
        int dice2 = random.nextInt((6 + 1) - 1) + 1;
        int total = dice1 + dice2;
        System.out.println("Guess a number between 1 and 12 fella");
        int guess = scanner.nextInt();
        System.out.println("Roll? [Y/N]");
        String roll = scanner.next().toLowerCase();
        if (roll.equals("y")) {
            System.out.printf("You rolled a %d!%n", total);
        }

        if ((dice1 + dice2) == guess) {
            System.out.println("We got a winner!");
            attackPoints += 10;
            System.out.println("*Attack points +10*");
            System.out.println(attackPoints);
        } else {
            System.out.println("You are garbage...");
        }

        System.out.println("wanna go again ? [Y/N]");
        roll = scanner.next().toLowerCase();
        if (roll.equals("y")) {
            miniGame(attackPoints);
        }
        return attackPoints;
    }

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

    public static int attack(int attackPoints, int enemyHealth) {
        enemyHealth -= attackPoints;
        System.out.println("You attacked !");
        return enemyHealth;
    }

    public static int heal(int health, int potion) {
        if (health <= 80) {
            health += 20;
        } else if (health > 80) {
            System.out.println("No affect, health full.");
        }
        return health;
    }

    public static int enemyAttack(int health, int enemyAttack) {
        health -= enemyAttack;
        System.out.println("You've been attacked !");
        return health;
    }

    public static void beginQuest(String type, String name) {
        if (type.equalsIgnoreCase("mage")) {
            System.out.println("""
                            /|   | |
                          _/_\\_  >_<
                         .-\\-/.   |
                        /  | | \\_ |
                        \\ \\| |\\__(/
                        /(`---')  |
                       / /     \\  |
                    _.'  \\'-'  /  |
                    `----'`=-='   '\s
                              """);
            System.out.printf("%s, The %s! Your journey has started!%n*****%n", name, type);
            System.out.println("You begin to travel west as your destination is at the end of a 100 mile walk through the DARK FOREST to the Mage's Temple\nYou encounter a hidden cave on your way.\n******\n");
            System.err.println("Do you wish to enter? [Y/N]");


        } else if (type.equalsIgnoreCase("knight")) {
            System.out.print("""
                       _   _   _   _+       |
                      /_`-'_`-'_`-'_|  \\+/  |
                      \\_`M'_`I'_`R'_| _<=>_ |
                        `-' `-' `-' 0/ \\ / o=o
                                    \\/\\ ^ /`0
                                    | /_^_\\
                                    | || ||
                      ______________|_d|_|b____
                    """);
            System.out.printf("%s, The %s! Your journey has started!%n*****%n", name, type);
            System.out.println("You begin to travel west as your destination is at the end of a 100 mile walk through the DARK FOREST to the Knight's Fortress!\nYou encounter a hidden ruin on your way.\n******\n");

            System.err.println("Do you wish to enter? [Y/N]");
        } else {
            type = characterType();
            beginQuest(type, name);
        }
    }

    public static void RpgDialog() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.err.print("YOU HAVE ENTERED THE UNDERWORLD THROUGH A HIDDEN GATE!\n******\n");
        String name = addName();
        String type = characterType();
        int health = 100;
        int attackPoints = 15;
        int potion = 3;
        int enemyHealth = 100;
        int enemyAttack = 15;
        System.out.println("You can gamble real quick if you fancy a good time![Gamble]/[Continue]");
        String read = scanner.next();
        if (read.equalsIgnoreCase("gamble")) {
            attackPoints = miniGame(attackPoints);
        }
        beginQuest(type, name);
        String enterOrNot = scanner.next();
        if (enterOrNot.equalsIgnoreCase("y")) {
            if (type.equalsIgnoreCase("mage")) {
                System.out.println("""
                                   (                 ,&&&.
                                    )                .,.&&
                                   (  (              \\=__/
                                       )             ,'-'.
                                 (    (  ,,      _.__|/ /|
                                  ) /\\ -((      ((_|___/ |
                                (  // | (`'      ((  `'--|
                              _ -.;_/ \\\\--._      \\\\ \\-._/.
                             (_;-// | \\ \\-'.\\    <_,\\_\\`--'|
                             ( `.__ _  ___,')      <_,-'__,'
                              `'(_ )_)(_)_)'
                        """);
                System.out.println("You enter the cave and encounter a stranger\n Stranger: hello ? who's there? Do you have any water for a poor old man ?\n******\n");
                System.err.println("Give water ? [Y/N]");
                String giveWater = scanner.next();
                if (giveWater.equalsIgnoreCase("y")) {
                    System.out.println("Stranger: Thank you! this is all i have to repay you i hope it helps.\n");
                    System.out.println("""
                                ~^~
                              {=;O;=}
                            {~~~~I~~~~}
                                |I|
                                |I|
                                |I|
                                |I|
                                 v
                                 """);
                    System.out.println("*You were rewarded The mages staff*");
                    attackPoints += 10;
                    System.out.printf("Attack power increased to %d%n", attackPoints);
                } else if (giveWater.equalsIgnoreCase("n")) {
                    System.out.println("Stranger: THEN GET OUT !\n*You have exited the cave*");
                }
            } else if (type.equalsIgnoreCase("knight")) {
                System.out.println("""
                                   (                 ,&&&.
                                    )                .,.&&
                                   (  (              \\=__/
                                       )             ,'-'.
                                 (    (  ,,      _.__|/ /|
                                  ) /\\ -((      ((_|___/ |
                                (  // | (`'      ((  `'--|
                              _ -.;_/ \\\\--._      \\\\ \\-._/.
                             (_;-// | \\ \\-'.\\    <_,\\_\\`--'|
                             ( `.__ _  ___,')      <_,-'__,'
                              `'(_ )_)(_)_)'
                        """);
                System.out.println("******\nYou enter the ruin and encounter a stranger\n Stranger: hello ? who's there? Do you have any water for a poor old man ?\n******\n");
                System.err.println("Give water ? [Y/N]");
                String giveWater = scanner.next();
                if (giveWater.equalsIgnoreCase("y")) {
                    System.out.println("Stranger: Thank you! this is all i have to repay you i hope it helps.\n\n");
                    System.out.println("""
                                          />
                             (           //-------------------------------------(
                            (*)OXOXOXOXO(*>======================================\\
                             (           \\\\---------------------------------------)
                                          \\>""");
                    System.out.println("*You were rewarded The Excalibur*");
                    attackPoints += 15;
                    System.out.printf("Attack power increased to %d%n", attackPoints);
                } else if (giveWater.equalsIgnoreCase("n")) {
                    System.out.println("Stranger: THEN GET OUT !\n*You have exited the cave*");
                }
            }
        } else if (enterOrNot.equalsIgnoreCase("n")) {
            System.out.println("You ignore the cave and continue to your destination");
            System.out.println("""
                         _    .  ,   .           .
                        *  / \\_ *  / \\_      _  *        *   /\\'__        *
                          /    \\  /    \\,   ((        .    _/  /  \\  *'.
                     .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.
                        /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *
                      /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\
                     /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-
                    /        `.  / /       `.~-^=-=~=^=.-'      '-._ `._
                    """);

        }
        System.out.println("Press 'c' to continue journey");
        read = scanner.next();
        if (read.equalsIgnoreCase("c")) {
            System.out.printf("""
                    ******
                    You finally arrive at your destination but they are under attack by DRAGONS!
                    %s, The %s! TAKE THEM OUT!
                    ******
                    """, name, type);
            System.out.println("""
                                                ==(W{==========-      /===-                       \s
                                                  ||  (.--.)         /===-_---~~~~~~~~~------____ \s
                                                  | \\_,|**|,__      |===-~___                _,-' `
                                     -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~     \s
                                 ______-==|        /`\\_. .__/\\ \\    | |  \\\\           _-~`        \s
                           __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'            \s
                        _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /              \s
                      .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'               \s
                     /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'                 \s
                    /-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                  \s
                                      \\_|      /        _) | ;  ),   __--~~                       \s
                                        '~~--_/      _-~/- |/ \\   '-~ \\                           \s
                                       {\\__--_/}    / \\\\_>-|)<__\\      \\                          \s
                                       /'   (_/  _-~  | |__>--<__|      |                         \s
                                      |   _/) )-~     | |__>--<__|      |                         \s
                                      / /~ ,_/       / /__>---<__/      |                         \s
                                     o-o _//        /-~_>---<__-~      /                          \s
                                     (^(~          /~_>---<__-      _-~                           \s
                                    ,/|           /__>--<__/     _-~                              \s
                                 ,//('(          |__>--<__|     /                  .----_         \s
                                ( ( '))          |__>--<__|    |                 /' _---_~\\       \s
                             `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\     \s
                            ,/,'//( (             \\__>--<__\\    \\            /'  //        ||     \s
                          ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'      \s
                        `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                 \s
                      ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                   \s
                       ;'( ')/ ,)(                              ~~~~~~~~~~                        \s
                      ' ') '( (/                                                                  \s
                        '   '  `""");
        }
        System.out.println("press 'B' to battle ");
        read = scanner.next();
        if (read.equalsIgnoreCase("B")) {
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
            System.out.println("[ATTACK 'A'/HEAL 'H']");
            String attackOrHeal = scanner.next();
            if (attackOrHeal.equalsIgnoreCase("a")) {
                enemyHealth = attack(attackPoints, enemyHealth);
                System.out.printf("""
                                             o    o
                        Health-%-3d    O      |\\O/|
                        Elixur-%d     (Y==o--- \\Y/
                                     /_\\      /_\\   Enemy
                                     / >      <<    Health-%d
                                                      
                              """, health, potion, enemyHealth);
            } else if (attackOrHeal.equalsIgnoreCase("h")) {
                health = heal(health, potion);
                potion--;
                System.out.printf("Health- %d Elixur- %d\nEnemy Health- %d%n******%n", health, potion, enemyHealth);
            }
            if (enemyHealth > 0) {
                health = enemyAttack(health, enemyAttack);
                System.out.printf("""
                                             o    o
                        Health-%d     O ((   |\\O/|
                        Elixur-%d     (Y(o---  \\Y/
                                     /_\\((    /_\\   Enemy
                                     / >      <<    Health-%d
                                                      
                              """, health, potion, enemyHealth);
            }
        }
        if (health > 0 && enemyHealth <= 0) {
            System.out.printf("ALL HAIL OUR NEW KING! SIR %s THE %s!%n", name, type);
            System.out.println("""   
                    ******
                    You have been awarded *Gold Armor*
                    You have been awarded *King*
                    You have been awarded *HellFire Excalibur*
                    *Elixur +3*
                    *Attack points +30*""");

            System.out.println("""                    
                    █▄█ █▀█ █░█   ▄▀█ █▀█ █▀▀   █▄▀ █ █▄░█ █▀▀   █
                    ░█░ █▄█ █▄█   █▀█ █▀▄ ██▄   █░█ █ █░▀█ █▄█   ▄
                    """);

        } else if (enemyHealth >= 0 && health <= 0) {
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
            } else {
                RpgDialog();
            }

        }
        health = 150;
        attackPoints += 30;
        potion += 3;
        System.out.printf("******\nYou've trained hard king,%s!%nHealth- %d Elixur- %d Attack- %d%n", name, health, potion, attackPoints);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n         TYPE 'GO' TO START");
        String yesOrNo = sc.next();
        if (yesOrNo.equalsIgnoreCase("go")) {
            RpgDialog();
        }
    }
}
