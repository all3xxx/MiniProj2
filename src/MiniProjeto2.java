import java.util.Scanner;

class MiniProjeto2 {
  public static void main(String[] args) {
    // Cria os personagens
    Personagem personaBraum = new Personagem("Braum", 100);
    Personagem personaDiana = new Personagem("Diana", 100);

    // Inicia o scanner para detectar o que foi digitado no console
    Scanner input = new Scanner(System.in);
    System.out.println("Bem-vindo ao livro interativo. Quando estiver preparado pra iniciar, digite 1.");
    int iniciar = input.nextInt();

    if (iniciar == 1) {
      System.out.println("\nCAPÍTULO 1 - A resiliência de Diana\n");
      System.out.println(
          "Era uma vez um reino coberto de neve e gelo chamado de Freljord. Na região em que Freljord fazia parte existiam muitos combates por território e poder. Em um determinado dia, uma legião chamada de Darkins invadiu Freljord, incendiando as casas e causando caos. Em uma área coberta por gelo estava tendo combates entre os principais guerreiros de Freljord e dos Darkins. Os guerreiros de Freljord estavam tentando proteger todos, a mais poderosa entre as mulheres se chamava Diana. Deseja continuar acompanhando a história? 1 para sim e 2 para não");
      int continuar = input.nextInt();
      if (continuar == 1) {
        System.out.println(
            "Enquanto estava em combate, um aldeão que estava fugindo dos ataques com seu bebê, acaba entrando no meio do combate, onde encontra Diana.\nO que Diana deve fazer?");
        System.out.println("1. Proteger o aldeão. \n2. Continuar lutando");
        int escolha1 = input.nextInt();
        if (escolha1 == 1) {
          System.out.println(
              "Diana pede para que o aldeão fuja, pois ela conterá os Darkins. Ao começar a correr, arqueiros Darkins aparecem e começam a atirar em direção a Diana e o aldeão que acabou sendo atingido e morrendo enquanto estava correndo.");
        } else if (escolha1 == 2) {
          System.out.println(
              "Diana com o sangue fervendo dá batalha ignora o aldeão e continua lutando. Nisso o aldeão é atingido e o bebê fica vulnerável no meio do combate");

        }
        System.out.println("Escolha a próxima ação. \n1. Ir em direção ao bebê. \n2. Sacrificar o bebê.");
        int escolha2 = input.nextInt();
        if (escolha2 == 1) {
          personaDiana.diminuirEnergia(20);
          System.out.println(
              " Nisso Diana vê e vai em direção ao bebê para protegê-lo, mas um guerreiro Darkin que estava caído a atacou e a derrubou. Diana se levanta e com muita ira ataca o guerreiro Darkin. O ataque foi tão forte que toda a água congelada começou a se quebrar. \n\n Com isso Diana perde 20 pontos de energia, ficando com: " + personaDiana.mostrarEnergia());
        } else if (escolha2 == 2) {
          System.out.println(
              "Pensando no bem maior de Freljord. Diana opta por não salvar o bebê e deixa-o desprotegido, pois sabia que os Darkins não mataria a criança, já que o principal objetivo deles é de capturar para assim treinar e ter cada vez mais guerreiros. Porém ao olhar melhor percebeu que os guerreiros enviados pelos Darkins eram os mais temidos e assassinos, então não teriam piedade da criança.");
        }
        System.out.println(
            "O que Diana deve fazer a seguir? \n1. Tentar salvar o bebê. \n2. Ficar imóvel para o gelo não quebrar. \n3. Se levantar e continuar lutando no gelo quebradiço.");
        int escolha3 = input.nextInt();
        if (escolha3 == 1) {
          personaDiana.morrer();
          System.out.println(
              "Diana vendo que o bebê corria perigo vai em direção do mesmo, mas como o ataque anterior dela havia deixado o gelo muito frágil, tudo se quebra, levando ao afogamento ela e a criança que buscou proteger. Diana morreu. \n\n Energia Diana: " + personaDiana.mostrarEnergia() + "\n\n\n FIM.");
          System.out.println("\n\nObrigado por participar do nosso livro interativo.");
        } else if (escolha3 == 2) {
          personaDiana.morrer();
          System.out.println(
              "Diana percebe que se der um passo o gelo poderá se quebrar e assim colocar a vida da criança em risco. Então ela decide ficar no mesmo lugar sem se mover, contudo os guerreiros Darkins continuam avançando em sua direção. Ao olhar para o bebê percebe que o seu irmão e guerreiro Braum alcança o bebê e consegue protegê-lo, mas com isso os guerreiros Darkins a alcançaram e executando-a sem nenhuma compaixão. Energia: " + personaDiana.mostrarEnergia() + "\n\n\n FIM.");
          System.out.println("\n\nObrigado por participar do nosso livro interativo.");
        } else if (escolha3 == 3) {
          personaDiana.diminuirEnergia(10);
          System.out.println("\nCAPÍTULO 2 - A chegada de Braum\n");
          System.out.println(
              "Diana se ergue e concentra todo o poder que lhe restava em sua espada e ataca com tudo o chão em que estava, causando uma grande explosão de poder quebrando toda a área de gelo. Com a explosão de seu poder, Diana é jogada montanha abaixo e no local da explosão começa uma avalanche. E por estar completamente esgotada, mal consegue se movimentar. \nDiana perde 10 pontos de energia ficando com: " + personaDiana.mostrarEnergia() + "\nLOCUTOR: Antes da explosão, algo inusitado aconteceu... \n\nSeu irmão e líder (Braum), aparece rapidamente e pega o bebê que estava no chão. Com isso vem a explosão de poder causado por sua irmã Diana que causa uma avalanche. \nO que Braum deve fazer ao ver a avalanche vindo em sua direção? \n1. Deixar o escudo por ter muito peso e correr. \n2. Utilizar o escudo. \n3. Pular montanha abaixo.");
          int escolha4 = input.nextInt();
          if (escolha4 == 1) {
            personaBraum.morrer();
            personaDiana.morrer();
            System.out.println(
                "Braum ao perceber a avalanche, larga seu escudo e tenta correr o mais rápido possível para encontrar algo que poderia proteger ele e a criança, contudo não conseguiu e todos foram levados pela avalanche. \nEnergia Diana: " + personaDiana.mostrarEnergia() + "\nEnergia Braum: " + personaBraum.mostrarEnergia() + "\n\n\n FIM.");
            System.out.println("\n\nObrigado por participar do nosso livro interativo.");
          } else if (escolha4 == 2) {
            personaDiana.morrer();
            personaBraum.diminuirEnergia(50);
            System.out.println(
                "Braum pega seu escudo e com toda sua força tenta proteger ele e a criança da avalanche, mas por precisar utilizar as duas mãos para segurar a enorme avalanche, acaba soltando a criança e apenas ele sobreviveu. \nEnergia Diana: " + personaDiana.mostrarEnergia() + "\nCom isso Braum fica muito ferido, mas sobrevive perdendo 50 pontos de energia e ficando com: " + personaBraum.mostrarEnergia() +  "\n\n\n FIM.");
            System.out.println("\n\nObrigado por participar do nosso livro interativo.");
          } else if (escolha4 == 3) {
            personaBraum.diminuirEnergia(50);
            personaDiana.diminuirEnergia(50);
            System.out.println(
                "Braum ao perceber a avalanche, coloca seu escudo no chão e sobe em cima fazendo-o de snowboard. Coloca a criança em seus braços e então começa a descer a montanha. Enquanto estava descendo consegue ver sua irmã Diana ainda caindo e com um enorme salto consegue pegar ela no ar. Ao cair em uma parte da montanha, Braum joga a criança dos braços de sua irmã e rapidamente pega seu escudo para protegê-los. Utilizando toda sua força, Braum consegue suportar todo o impacto da avalanche salvando todos. \nMas com os ferimentos perderam 50 pontos de energia. \n\nEnergia Diana: " + personaDiana.mostrarEnergia() + "\nEnergia Braum: " + personaBraum.mostrarEnergia() + "\n\n\n FIM");
            System.out.println("\n\nObrigado por participar do nosso livro interativo.");
          }
        }
      } else {
        System.out.println("Fim do programa.");
      }
    } else {
      System.out.println("Fim do programa.");
    }
  }
}