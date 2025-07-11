import java.util.ArrayList;
import java.util.Scanner;

public class Guerreiro {
    private int hp;
    private int def;
    private String nome;
    private int nivel;
    private int xp;
    private int atk;
    private int pocoesUsadas;
    private int pocoesRestantes;
    private int cash;
    private int maxHp;
    private int maxDef;
    private int xpNecessario;
    ArrayList<String> armas = new ArrayList();
    Scanner teclado = new Scanner (System.in);
    ArrayList<Loja> lojas = new ArrayList();

    lojas.add(new Loja("Adaga", 10, 30));
    lojas.add(new Loja("Clava", 13, 45));
    lojas.add(new Loja("Espada Curta", 16, 60));
    lojas.add(new Loja("Maça de Ferro", 19, 78));
    lojas.add(new Loja("Lança Leve", 22, 95));
    lojas.add(new Loja("Espada Longa", 26, 115));
    lojas.add(new Loja("Machado de Mão", 30, 135));
    lojas.add(new Loja("Lança Média", 34, 158));
    lojas.add(new Loja("Martelo de Pedra", 38, 182));
    lojas.add(new Loja("Espada Bastarda", 43, 208));
    lojas.add(new Loja("Alabarda Simples", 48, 235));
    lojas.add(new Loja("Espada Rúnica", 54, 263));
    lojas.add(new Loja("Machado Pesado", 60, 292));
    lojas.add(new Loja("Lança Afiada", 66, 322));
    lojas.add(new Loja("Maça de Guerra", 73, 353));
    lojas.add(new Loja("Espada Flamejante", 80, 385));
    lojas.add(new Loja("Machado de Titânio", 88, 418));
    lojas.add(new Loja("Martelo de Guerra", 96, 452));
    lojas.add(new Loja("Lança de Elite", 104, 487));
    lojas.add(new Loja("Espada Negra", 113, 523));
    lojas.add(new Loja("Lâmina Sombria", 122, 560));
    lojas.add(new Loja("Clava Mística", 132, 598));
    lojas.add(new Loja("Machado Duplo", 142, 637));
    lojas.add(new Loja("Espada do Vento", 153, 677));
    lojas.add(new Loja("Maça Espiritual", 164, 718));
    lojas.add(new Loja("Lança do Caçador", 176, 760));
    lojas.add(new Loja("Espada de Prata", 188, 803));
    lojas.add(new Loja("Alabarda de Ferro", 201, 847));
    lojas.add(new Loja("Machado de Aço", 214, 892));
    lojas.add(new Loja("Espada Sagrada", 228, 938));
    lojas.add(new Loja("Lança do Trovão", 242, 985));
    lojas.add(new Loja("Martelo de Titã", 257, 1033));
    lojas.add(new Loja("Lâmina de Sangue", 272, 1082));
    lojas.add(new Loja("Espada Dracônica", 288, 1132));
    lojas.add(new Loja("Machado da Ira", 304, 1183));
    lojas.add(new Loja("Espada de Gelo", 321, 1235));
    lojas.add(new Loja("Maça de Luz", 338, 1288));
    lojas.add(new Loja("Lança da Morte", 356, 1342));
    lojas.add(new Loja("Espada de Cristal", 374, 1397));
    lojas.add(new Loja("Machado de Ossos", 393, 1453));
    lojas.add(new Loja("Espada das Sombras", 412, 1510));
    lojas.add(new Loja("Martelo Celestial", 432, 1568));
    lojas.add(new Loja("Lança Cósmica", 452, 1627));
    lojas.add(new Loja("Espada do Caos", 473, 1687));
    lojas.add(new Loja("Machado Flamejante", 494, 1748));
    lojas.add(new Loja("Lâmina Fantasma", 516, 1810));
    lojas.add(new Loja("Maça de Fogo", 538, 1873));
    lojas.add(new Loja("Espada Estelar", 561, 1937));
    lojas.add(new Loja("Lança Divina", 584, 2002));
    lojas.add(new Loja("Espada do Infinito", 608, 2068));
    lojas.add(new Loja("Machado Abissal", 633, 2135));
    lojas.add(new Loja("Espada Arcana", 658, 2203));
    lojas.add(new Loja("Lança do Eclipse", 684, 2272));
    lojas.add(new Loja("Martelo de Aço Negro", 710, 2342));
    lojas.add(new Loja("Espada do Dragão", 736, 2413));
    lojas.add(new Loja("Machado de Sangue", 763, 2485));
    lojas.add(new Loja("Lâmina da Noite", 790, 2558));
    lojas.add(new Loja("Maça do Juízo", 818, 2632));
    lojas.add(new Loja("Espada da Aurora", 846, 2707));
    lojas.add(new Loja("Lança da Tempestade", 874, 2783));
    lojas.add(new Loja("Machado Feral", 903, 2859));
    lojas.add(new Loja("Espada do Caçador", 932, 2936));
    lojas.add(new Loja("Martelo do Trovão", 961, 3014));
    lojas.add(new Loja("Lança de Gelo", 991, 3093));
    lojas.add(new Loja("Espada Sombria", 1021, 3173));
    lojas.add(new Loja("Machado de Fogo", 1051, 3254));
    lojas.add(new Loja("Lâmina de Cristal", 1082, 3335));
    lojas.add(new Loja("Maça do Dragão", 1113, 3417));
    lojas.add(new Loja("Espada Estígia", 1144, 3500));
    lojas.add(new Loja("Lança da Fúria", 1175, 3583));
    lojas.add(new Loja("Machado Glacial", 1207, 3667));
    lojas.add(new Loja("Espada do Vácuo", 1239, 3752));
    lojas.add(new Loja("Martelo Estelar", 1271, 3837));
    lojas.add(new Loja("Lança Espectral", 1303, 3923));
    lojas.add(new Loja("Espada do Abismo", 1335, 4009));
    lojas.add(new Loja("Machado Etéreo", 1367, 4096));
    lojas.add(new Loja("Lâmina Infernal", 1400, 4183));
    lojas.add(new Loja("Maça da Luz", 1433, 4271));
    lojas.add(new Loja("Espada do Eclipse", 1466, 4359));
    lojas.add(new Loja("Lança Celestial", 1499, 4448));
    lojas.add(new Loja("Machado do Caos", 1532, 4537));
    lojas.add(new Loja("Espada de Titânio", 1565, 4627));
    lojas.add(new Loja("Martelo de Prata", 1598, 4717));
    lojas.add(new Loja("Lança do Inverno", 1632, 4807));
    lojas.add(new Loja("Espada do Fênix", 1665, 4898));
    lojas.add(new Loja("Machado Sombrio", 1699, 4989));
    lojas.add(new Loja("Lâmina Radiante", 1733, 5081));
    lojas.add(new Loja("Maça das Estrelas", 1767, 5173));
    lojas.add(new Loja("Espada do Destino", 1801, 5265));
    lojas.add(new Loja("Lança do Vento", 1835, 5357));
    lojas.add(new Loja("Machado Celeste", 1869, 5450));
    lojas.add(new Loja("Espada da Tempestade", 1903, 5543));
    lojas.add(new Loja("Martelo Infernal", 1937, 5636));
    lojas.add(new Loja("Lança Sagrada", 1972, 5729));
    lojas.add(new Loja("Espada de Gelo", 2006, 5823));
    lojas.add(new Loja("Machado do Vácuo", 2041, 5917));
    lojas.add(new Loja("Lâmina do Dragão", 2075, 6011));
    lojas.add(new Loja("Maça da Morte", 2110, 6105));
    lojas.add(new Loja("Espada Estelar", 2145, 6200));
    lojas.add(new Loja("Lança do Sol", 2180, 6295));
    lojas.add(new Loja("Machado do Abismo", 2215, 6390));
    lojas.add(new Loja("Espada do Crepúsculo", 2250, 6486));
    lojas.add(new Loja("Lança dos Ancestrais", 2285, 6582));
    lojas.add(new Loja("Martelo de Dragão", 2321, 6678));
    lojas.add(new Loja("Lâmina do Caos", 2356, 6775));
    lojas.add(new Loja("Maça de Cristal", 2392, 6872));
    lojas.add(new Loja("Espada do Fogo Eterno", 2427, 6969));
    lojas.add(new Loja("Machado da Ruína", 2463, 7067));
    lojas.add(new Loja("Lança da Destruição", 2499, 7165));
    lojas.add(new Loja("Espada do Vento Cortante", 2535, 7263));
    lojas.add(new Loja("Martelo da Terra", 2571, 7362));
    lojas.add(new Loja("Lâmina da Sombra", 2607, 7461));
    lojas.add(new Loja("Maça da Tempestade", 2643, 7560));
    lojas.add(new Loja("Espada do Relâmpago", 2679, 7659));
    lojas.add(new Loja("Machado da Luz", 2715, 7759));
    lojas.add(new Loja("Lança do Gelo", 2751, 7859));
    lojas.add(new Loja("Espada do Caos Celestial", 2787, 7959));
    lojas.add(new Loja("Martelo do Abismo", 2823, 8059));
    lojas.add(new Loja("Lâmina Estelar", 2859, 8159));
    lojas.add(new Loja("Maça do Vento", 2896, 8259));
    lojas.add(new Loja("Espada da Noite", 2932, 8359));
    lojas.add(new Loja("Machado dos Deuses", 2968, 8459));
    lojas.add(new Loja("Lança do Fim", 3005, 8559));
    lojas.add(new Loja("Espada da Alma", 3041, 8659));
    lojas.add(new Loja("Martelo do Sol", 3077, 8759));
    lojas.add(new Loja("Lâmina da Eternidade", 3114, 8859));
    lojas.add(new Loja("Maça da Luz Eterna", 3150, 8959));
    lojas.add(new Loja("Espada do Destino Final", 3187, 9059));
    lojas.add(new Loja("Machado do Crepúsculo", 3223, 9159));
    lojas.add(new Loja("Lança do Infinito", 3259, 9259));
    lojas.add(new Loja("Espada do Eclipse", 3296, 9359));
    lojas.add(new Loja("Martelo do Vácuo", 3333, 9459));
    lojas.add(new Loja("Lâmina da Fúria", 3369, 9559));
    lojas.add(new Loja("Maça do Caos", 3406, 9659));
    lojas.add(new Loja("Espada do Trovão", 3442, 9759));
    lojas.add(new Loja("Machado da Tempestade", 3479, 9859));
    lojas.add(new Loja("Lança de Fogo", 3516, 9959));
    lojas.add(new Loja("Espada das Estrelas", 3552, 10059));
    lojas.add(new Loja("Martelo da Morte", 3589, 10159));
    lojas.add(new Loja("Lâmina de Gelo", 3626, 10259));
    lojas.add(new Loja("Maça da Sombra", 3662, 10359));
    lojas.add(new Loja("Espada do Céu", 3699, 10459));
    lojas.add(new Loja("Machado da Luz", 3736, 10559));
    lojas.add(new Loja("Lança da Tempestade Eterna", 3773, 10659));
    lojas.add(new Loja("Espada do Apocalipse", 3809, 10759));
    lojas.add(new Loja("Martelo da Vida", 3846, 10859));
    lojas.add(new Loja("Lâmina do Juízo", 3883, 10959));
    lojas.add(new Loja("Maça Estelar", 3920, 11059));
    lojas.add(new Loja("Espada da Alma Eterna", 3957, 11159));
    lojas.add(new Loja("Lança do Fim dos Tempos", 3994, 11259));

    public Guerreiro(String nome) {
        this.hp = 100;
        this.def = 150;
        this.nome = nome;
        this.nivel = 1;
        this.xp = 0;
        this.atk = 25;
        this.pocoesUsadas = 0;
        this.pocoesRestantes = 0;
        this.cash = 0;
        this.maxDef = 150;
        this.maxHp = 100;
        this.xpNecessario = 500;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getPocoesUsadas() {
        return pocoesUsadas;
    }

    public void setPocoesUsadas(int pocoesUsadas) {
        this.pocoesUsadas = pocoesUsadas;
    }

    public int getPocoesRestantes() {
        return pocoesRestantes;
    }

    public void setPocoesRestantes(int pocoesRestantes) {
        this.pocoesRestantes = pocoesRestantes;
    }
    
    public int getCash() {
        return cash;
    }
    
    public void setCash(int cash) {
        this.cash = cash;
    }
    
    public void comprarPocao(){
        if(this.cash < 50){
            sistem.out.println("Voce nao tem dinheiro suficiente para comprar uma pocao");
            break;
        }else{
            sistem.out.printf("Voce comprou uma pocao de cura por 50 coins. Voce tem %i pocoes e %i de coins restantes", pocoesRestantes, coins);
            this.pocoesRestantes ++;
            break;
        }
    }
    
    public void verificarNivel(){
        if(this.xp >= this.xpNecessario){
            this.xp - this.xpNecessario;
            this.xpNecessario += 250;
            this.nivel ++;
            contabilizarNivel();
        }
    }
    
    public void contabilizarNivel(){
        sistem.out.printf("Voce subiu para o nivel %d, parabens.", this.nivel);
        sistem.out.println("");
        if(nivel == 2){
            this.maxHp += 15;
            this.maxDef += 20;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 3){
            this.maxHp += 20;
            this.maxDef += 25;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 4){
            this.maxHp += 25;
            this.maxDef += 30;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 5){
            this.maxHp += 30;
            this.maxDef += 35;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 6){
            this.maxHp += 35;
            this.maxDef += 40;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 7){
            this.maxHp += 40;
            this.maxDef += 45;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 8){
            this.maxHp += 45;
            this.maxDef += 50;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 9){
            this.maxHp += 50;
            this.maxDef += 55;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 10){
            this.maxHp += 55;
            this.maxDef += 60;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 11){
            this.maxHp += 60;
            this.maxDef += 65;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 12){
            this.maxHp += 65;
            this.maxDef += 70;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 13){
            this.maxHp += 70;
            this.maxDef += 75;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 14){
            this.maxHp += 75;
            this.maxDef += 80;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 15){
            this.maxHp += 80;
            this.maxDef += 85;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 16){
            this.maxHp += 85;
            this.maxDef += 90;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 17){
            this.maxHp += 90;
            this.maxDef += 95;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 18){
            this.maxHp += 95;
            this.maxDef += 100;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 19){
            this.maxHp += 100;
            this.maxDef += 105;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 20){
            this.maxHp += 105;
            this.maxDef += 110;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 21){
            this.maxHp += 110;
            this.maxDef += 115;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 22){
            this.maxHp += 115;
            this.maxDef += 120;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 23){
            this.maxHp += 120;
            this.maxDef += 125;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 24){
            this.maxHp += 125;
            this.maxDef += 130;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 25){
            this.maxHp += 130;
            this.maxDef += 135;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 26){
            this.maxHp += 135;
            this.maxDef += 140;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 27){
            this.maxHp += 140;
            this.maxDef += 145;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 28){
            this.maxHp += 145;
            this.maxDef += 150;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 29){
            this.maxHp += 150;
            this.maxDef += 155;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 30){
            this.maxHp += 155;
            this.maxDef += 160;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 40){
            this.maxHp += 100;
            this.maxDef += 100;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 50){
            this.maxHp += 100;
            this.maxDef += 100;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 70){
            this.maxHp += 100;
            this.maxDef += 100;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 99){
            this.maxHp += 100;
            this.maxDef += 100;
            this.hp = maxHp;
            this.def = maxDef;
            this.pocoesRestantes++;
        }else if(nivel == 100){
            this.maxHp += 500;
            this.maxDef += 500;
            this.hp = maxHp;
            this.def = maxDef;
            System.out.println("Parabens seu viciado, voce chegou ao nivel 100, e agora nao recebera mais power ups por nivel, apenas uma pocao por nivel, ate o nivel 150. Apos isso, e por sua conta.");
        }if (nivel >= 101 && nivel <= 150) {
            this.pocoesRestantes++;
        }
    }

    public void comprarArmas(){
        System.out.println("Bem-vindo à loja de armas, qual deseja?: \n" +
            "1 - Adaga (Atk: 10, custo: 30);\n" +
            "2 - Clava (Atk: 13, custo: 45);\n" +
            "3 - Espada Curta (Atk: 16, custo: 60);\n" +
            "4 - Maça de Ferro (Atk: 19, custo: 78);\n" +
            "5 - Lança Leve (Atk: 22, custo: 95);\n" +
            "6 - Espada Longa (Atk: 26, custo: 115);\n" +
            "7 - Machado de Mão (Atk: 30, custo: 135);\n" +
            "8 - Lança Média (Atk: 34, custo: 158);\n" +
            "9 - Martelo de Pedra (Atk: 38, custo: 182);\n" +
            "10 - Espada Bastarda (Atk: 43, custo: 208);\n" +
            "11 - Alabarda Simples (Atk: 48, custo: 235);\n" +
            "12 - Espada Rúnica (Atk: 54, custo: 263);\n" +
            "13 - Machado Pesado (Atk: 60, custo: 292);\n" +
            "14 - Lança Afiada (Atk: 66, custo: 322);\n" +
            "15 - Maça de Guerra (Atk: 73, custo: 353);\n" +
            "16 - Espada Flamejante (Atk: 80, custo: 385);\n" +
            "17 - Machado de Titânio (Atk: 88, custo: 418);\n" +
            "18 - Martelo de Guerra (Atk: 96, custo: 452);\n" +
            "19 - Lança de Elite (Atk: 104, custo: 487);\n" +
            "20 - Espada Negra (Atk: 113, custo: 523);\n" +
            "21 - Lâmina Sombria (Atk: 122, custo: 560);\n" +
            "22 - Clava Mística (Atk: 132, custo: 598);\n" +
            "23 - Machado Duplo (Atk: 142, custo: 637);\n" +
            "24 - Espada do Vento (Atk: 153, custo: 677);\n" +
            "25 - Maça Espiritual (Atk: 164, custo: 718);\n" +
            "26 - Lança do Caçador (Atk: 176, custo: 760);\n" +
            "27 - Espada de Prata (Atk: 188, custo: 803);\n" +
            "28 - Alabarda de Ferro (Atk: 201, custo: 847);\n" +
            "29 - Machado de Aço (Atk: 214, custo: 892);\n" +
            "30 - Espada Sagrada (Atk: 228, custo: 938);\n" +
            "31 - Lança do Trovão (Atk: 242, custo: 985);\n" +
            "32 - Martelo de Titã (Atk: 257, custo: 1033);\n" +
            "33 - Lâmina de Sangue (Atk: 272, custo: 1082);\n" +
            "34 - Espada Dracônica (Atk: 288, custo: 1132);\n" +
            "35 - Machado da Ira (Atk: 304, custo: 1183);\n" +
            "36 - Espada de Gelo (Atk: 321, custo: 1235);\n" +
            "37 - Maça de Luz (Atk: 338, custo: 1288);\n" +
            "38 - Lança da Morte (Atk: 356, custo: 1342);\n" +
            "39 - Espada de Cristal (Atk: 374, custo: 1397);\n" +
            "40 - Machado de Ossos (Atk: 393, custo: 1453);\n" +
            "41 - Espada das Sombras (Atk: 412, custo: 1510);\n" +
            "42 - Martelo Celestial (Atk: 432, custo: 1568);\n" +
            "43 - Lança Cósmica (Atk: 452, custo: 1627);\n" +
            "44 - Espada do Caos (Atk: 473, custo: 1687);\n" +
            "45 - Machado Flamejante (Atk: 494, custo: 1748);\n" +
            "46 - Lâmina Fantasma (Atk: 516, custo: 1810);\n" +
            "47 - Maça de Fogo (Atk: 538, custo: 1873);\n" +
            "48 - Espada Estelar (Atk: 561, custo: 1937);\n" +
            "49 - Lança Divina (Atk: 584, custo: 2002);\n" +
            "50 - Espada do Infinito (Atk: 608, custo: 2068);\n" +
            "51 - Machado Abissal (Atk: 633, custo: 2135);\n" +
            "52 - Espada Arcana (Atk: 658, custo: 2203);\n" +
            "53 - Lança do Eclipse (Atk: 684, custo: 2272);\n" +
            "54 - Martelo de Aço Negro (Atk: 710, custo: 2342);\n" +
            "55 - Espada do Dragão (Atk: 736, custo: 2413);\n" +
            "56 - Machado de Sangue (Atk: 763, custo: 2485);\n" +
            "57 - Lâmina da Noite (Atk: 790, custo: 2558);\n" +
            "58 - Maça do Juízo (Atk: 818, custo: 2632);\n" +
            "59 - Espada da Aurora (Atk: 846, custo: 2707);\n" +
            "60 - Lança da Tempestade (Atk: 874, custo: 2783);\n" +
            "61 - Machado Feral (Atk: 903, custo: 2859);\n" +
            "62 - Espada do Caçador (Atk: 932, custo: 2936);\n" +
            "63 - Martelo do Trovão (Atk: 961, custo: 3014);\n" +
            "64 - Lança de Gelo (Atk: 991, custo: 3093);\n" +
            "65 - Espada Sombria (Atk: 1021, custo: 3173);\n" +
            "66 - Machado de Fogo (Atk: 1051, custo: 3254);\n" +
            "67 - Lâmina de Cristal (Atk: 1082, custo: 3335);\n" +
            "68 - Maça do Dragão (Atk: 1113, custo: 3417);\n" +
            "69 - Espada Estígia (Atk: 1144, custo: 3500);\n" +
            "70 - Lança da Fúria (Atk: 1175, custo: 3583);\n" +
            "71 - Machado Glacial (Atk: 1207, custo: 3667);\n" +
            "72 - Espada do Vácuo (Atk: 1239, custo: 3752);\n" +
            "73 - Martelo Estelar (Atk: 1271, custo: 3837);\n" +
            "74 - Lança Espectral (Atk: 1303, custo: 3923);\n" +
            "75 - Espada do Abismo (Atk: 1335, custo: 4009);\n" +
            "76 - Machado Etéreo (Atk: 1367, custo: 4096);\n" +
            "77 - Lâmina Infernal (Atk: 1400, custo: 4183);\n" +
            "78 - Maça da Luz (Atk: 1433, custo: 4271);\n" +
            "79 - Espada do Eclipse (Atk: 1466, custo: 4359);\n" +
            "80 - Lança Celestial (Atk: 1499, custo: 4448);\n" +
            "81 - Machado do Caos (Atk: 1532, custo: 4537);\n" +
            "82 - Espada de Titânio (Atk: 1565, custo: 4627);\n" +
            "83 - Martelo de Prata (Atk: 1598, custo: 4717);\n" +
            "84 - Lança do Inverno (Atk: 1632, custo: 4807);\n" +
            "85 - Espada do Fênix (Atk: 1665, custo: 4898);\n" +
            "86 - Machado Sombrio (Atk: 1699, custo: 4989);\n" +
            "87 - Lâmina Radiante (Atk: 1733, custo: 5081);\n" +
            "88 - Maça das Estrelas (Atk: 1767, custo: 5173);\n" +
            "89 - Espada do Destino (Atk: 1801, custo: 5265);\n" +
            "90 - Lança do Vento (Atk: 1835, custo: 5357);\n" +
            "91 - Machado Celeste (Atk: 1869, custo: 5450);\n" +
            "92 - Espada da Tempestade (Atk: 1903, custo: 5543);\n" +
            "93 - Martelo Infernal (Atk: 1937, custo: 5636);\n" +
            "94 - Lança Sagrada (Atk: 1972, custo: 5729);\n" +
            "95 - Espada de Gelo (Atk: 2006, custo: 5823);\n" +
            "96 - Machado do Vácuo (Atk: 2041, custo: 5917);\n" +
            "97 - Lâmina do Dragão (Atk: 2075, custo: 6011);\n" +
            "98 - Maça da Morte (Atk: 2110, custo: 6105);\n" +
            "99 - Espada Estelar (Atk: 2145, custo: 6200);\n" +
            "100 - Lança do Sol (Atk: 2180, custo: 6295);\n" +
            "101 - Machado do Abismo (Atk: 2215, custo: 6390);\n" +
            "102 - Espada do Crepúsculo (Atk: 2250, custo: 6486);\n" +
            "103 - Lança dos Ancestrais (Atk: 2285, custo: 6582);\n" +
            "104 - Martelo de Dragão (Atk: 2321, custo: 6678);\n" +
            "105 - Lâmina do Caos (Atk: 2356, custo: 6775);\n" +
            "106 - Maça de Cristal (Atk: 2392, custo: 6872);\n" +
            "107 - Espada do Fogo Eterno (Atk: 2427, custo: 6969);\n" +
            "108 - Machado da Ruína (Atk: 2463, custo: 7067);\n" +
            "109 - Lança da Destruição (Atk: 2499, custo: 7165);\n" +
            "110 - Espada do Vento Cortante (Atk: 2535, custo: 7263);\n" +
            "111 - Martelo da Terra (Atk: 2571, custo: 7362);\n" +
            "112 - Lâmina da Sombra (Atk: 2607, custo: 7461);\n" +
            "113 - Maça da Tempestade (Atk: 2643, custo: 7560);\n" +
            "114 - Espada do Relâmpago (Atk: 2679, custo: 7659);\n" +
            "115 - Machado da Luz (Atk: 2715, custo: 7759);\n" +
            "116 - Lança do Gelo (Atk: 2751, custo: 7859);\n" +
            "117 - Espada do Caos Celestial (Atk: 2787, custo: 7959);\n" +
            "118 - Martelo do Abismo (Atk: 2823, custo: 8059);\n" +
            "119 - Lâmina Estelar (Atk: 2859, custo: 8159);\n" +
            "120 - Maça do Vento (Atk: 2896, custo: 8259);\n" +
            "121 - Espada da Noite (Atk: 2932, custo: 8359);\n" +
            "122 - Machado dos Deuses (Atk: 2968, custo: 8459);\n" +
            "123 - Lança do Fim (Atk: 3005, custo: 8559);\n" +
            "124 - Espada da Alma (Atk: 3041, custo: 8659);\n" +
            "125 - Martelo do Sol (Atk: 3077, custo: 8759);\n" +
            "126 - Lâmina da Eternidade (Atk: 3114, custo: 8859);\n" +
            "127 - Maça da Luz Eterna (Atk: 3150, custo: 8959);\n" +
            "128 - Espada do Destino Final (Atk: 3187, custo: 9059);\n" +
            "129 - Machado do Crepúsculo (Atk: 3223, custo: 9159);\n" +
            "130 - Lança do Infinito (Atk: 3259, custo: 9259);\n" +
            "131 - Espada do Eclipse (Atk: 3296, custo: 9359);\n" +
            "132 - Martelo do Vácuo (Atk: 3333, custo: 9459);\n" +
            "133 - Lâmina da Fúria (Atk: 3369, custo: 9559);\n" +
            "134 - Maça do Caos (Atk: 3406, custo: 9659);\n" +
            "135 - Espada do Trovão (Atk: 3442, custo: 9759);\n" +
            "136 - Machado da Tempestade (Atk: 3479, custo: 9859);\n" +
            "137 - Lança de Fogo (Atk: 3516, custo: 9959);\n" +
            "138 - Espada das Estrelas (Atk: 3552, custo: 10059);\n" +
            "139 - Martelo da Morte (Atk: 3589, custo: 10159);\n" +
            "140 - Lâmina de Gelo (Atk: 3626, custo: 10259);\n" +
            "141 - Maça da Sombra (Atk: 3662, custo: 10359);\n" +
            "142 - Espada do Céu (Atk: 3699, custo: 10459);\n" +
            "143 - Machado da Luz (Atk: 3736, custo: 10559);\n" +
            "144 - Lança da Tempestade Eterna (Atk: 3773, custo: 10659);\n" +
            "145 - Espada do Apocalipse (Atk: 3809, custo: 10759);\n" +
            "146 - Martelo da Vida (Atk: 3846, custo: 10859);\n" +
            "147 - Lâmina do Juízo (Atk: 3883, custo: 10959);\n" +
            "148 - Maça Estelar (Atk: 3920, custo: 11059);\n" +
            "149 - Espada da Alma Eterna (Atk: 3957, custo: 11159);\n" +
            "150 - Lança do Fim dos Tempos (Atk: 3994, custo: 11259);"
            );
            int armaComprarInserido = teclado.nextInt();
            int armaComprar = armaComprarInserido - 1; //index para a loja
            if(armas.contains(lojas.get(armaComprar).getNome()){
                sistem.out.println("Voce ja comprou esta arma, nao e possivel comprar ela duas vezes.");
            }
            if(this.cash > lojas.get(armaComprar).getCusto()){
                sistem.out.println("Voce nao possui coins suficientes para comprar esta arma");
                break;
            }else{
                armas.add(lojas.get(armaComprar).getNome());
                this.cash -= lojas.get(armaComprar).getCusto();
                this.atk += lojas.get(armaComprar).getDano();
                sistem.out.printf("Voce comprou a arma '%s' pelo valor de %d coins. Agora voce tem %d coins e esta com ataque de %d de dano.", lojas.get(armaComprar).getNome(), lojas.get(armaComprar).getCusto(), this.cash, this.atk);
                sistem.out.println("");
            }    
}
