package exemplos.aula_vitor;
import java.util.Scanner;

public class Main {
    public static void esperar(long milissegundos) {
        try {
            Thread.sleep(milissegundos); // Espera pelo número de milissegundos especificado
        } catch (InterruptedException e) {
            System.out.println("Erro ao esperar: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restaura o status de interrupção
        }
    }
    public static void main(String[] args) {
        double horarioAcordar = 8.00; // Corrigi a formatação do horário
        boolean escovouDentes = false;
        boolean tomouBanho = false;
        boolean tomouCafe = false;
        boolean reuniuTodosItensNecessarios = false;
        boolean saiuDeCasa = false;
        boolean trancarPorta = false;
        boolean andarPontoOnibus = false;
        boolean chegouPontoOnibus = false;
        boolean esperarOnibus = false;
        boolean entrarOnibus = false;
        boolean chegouLocalDesejado = false;
        boolean descerOnibus = false;
        boolean andarAteLocalTarefa = false;
        boolean realizarTarefas = false;
        boolean voltarParaCasa = false;

        int esperarTempoOnibus = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que horas voce acordou?");
        double horario = scanner.nextDouble();

        if (horario > 6.00) {
            System.out.println("Acorde! Voce está atrasado, se apresse");
        } else {
            System.out.println("Voce acordou no horario certo, vá se preparar para sair");
        }

        System.out.println("Voce escovou os dentes, tomou banho e tomou cafe?");
        String respostaPrepararSair = scanner.next().toLowerCase();

        while (respostaPrepararSair.equals("nao")) {
            System.out.println("Voce escovou os dentes, tomou banho e tomou cafe?");
            respostaPrepararSair = scanner.next().toLowerCase();
        }

        if (respostaPrepararSair.equals("sim")) {
            escovouDentes = true;
            tomouBanho = true;
            tomouCafe = true;

            System.out.println("Voce está levando tudo que é necessario?");
            String respostaLevandoTudo = scanner.next().toLowerCase();

            while (respostaLevandoTudo.equals("nao")) {
                System.out.println("Voce está levando tudo que é necessario?");
                respostaLevandoTudo = scanner.next().toLowerCase();
            }

            if (respostaLevandoTudo.equals("sim")) {
                reuniuTodosItensNecessarios = true;

                System.out.println("Saiu de casa?");
                String respostaSaiuCasa = scanner.next();

                while (respostaSaiuCasa.equals("nao")) {
                    System.out.println("Saiu de casa?");
                    respostaSaiuCasa = scanner.next();
                }

                if (respostaSaiuCasa.equals("sim")) {
                    saiuDeCasa = true;
                    System.out.println("Trancou a porta?");
                    String respostaTrancouPorta = scanner.next();

                    while (respostaTrancouPorta.equals("nao")) {
                        System.out.println("Trancou a porta?");
                        respostaTrancouPorta = scanner.next();
                    }

                    if (respostaTrancouPorta.equals("sim")) {
                        trancarPorta = true;
                        System.out.println("Voce está indo para o ponto de onibus?");
                        String resultadoIndoPontoOnibus = scanner.next();

                        while (resultadoIndoPontoOnibus.equals("nao")) {
                            System.out.println("Voce está indo para o ponto de onibus?");
                            resultadoIndoPontoOnibus = scanner.next();
                        }
                            if (resultadoIndoPontoOnibus.equals("sim")) {
                                andarPontoOnibus = true;
                                System.out.println("Chegou no ponto de onibus?");
                                String respostaChegouPontoOnibus = scanner.next();

                                if (respostaChegouPontoOnibus.equals("sim")) {
                                    chegouPontoOnibus = true;
                                    for (int i = 0; i <= 10; i++) {
                                        System.out.println("O onibus irá passar em: " + i);
                                    }

                                    System.out.println("Pegou o onibus?");
                                    String respostaPegouOnibus = scanner.next();

                                    while (respostaPegouOnibus.equals("nao")) {
                                        System.out.println("Voce perde o onibus! Aguarde o proximo.");
                                        esperar(3000);
                                        for (int i = 0; i <= 10; i++) {
                                            System.out.println("O onibus irá passar em: " + i);
                                        }
                                        break;
                                    }
                                    System.out.println("Pegou o onibus?");
                                    respostaPegouOnibus = scanner.next();

                                    if (respostaPegouOnibus.equals("sim")) {
                                        entrarOnibus = true;


                                    }


                                }
                            }
                        }
                    }
                }
            }
        }
    }
