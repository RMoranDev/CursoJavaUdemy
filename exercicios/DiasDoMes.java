package exercicios;

public class DiasDoMes {
    public static void main(String[] args) {
        String mes = "ewfwesgw";

        String numeroDias = switch (mes) { // switch inicialização
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "Onúmero de dias é 31";
            case  "Abril", "Junho", "Setembro", "Novembro" -> "O número de dias é 30";
            case "Fevereiro" -> "o número de dias é 28";
            default -> "Mês desconhecido";
        };

        System.out.println(numeroDias);
    }
}
