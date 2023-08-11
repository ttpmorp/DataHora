package DataHora;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;

public class aula110 {

    public static void main(String[] args) {
        // Cria um objeto DateTimeFormatter para formatar datas no padrão "dd/MM/yyyy"
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Cria um objeto DateTimeFormatter para formatar datas no padrão "dd/MM/yyyy HH:mm"
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Obtém a data atual no formato LocalDate
        LocalDate d01 = LocalDate.now();
        // Obtém a data e hora atual no formato LocalDateTime
        LocalDateTime d02 = LocalDateTime.now();
        // Obtém a data e hora atual no formato Instant (data e hora em UTC)
        Instant d03 = Instant.now();

        // Converte uma string no formato "yyyy-MM-dd" para um objeto LocalDate
        LocalDate d04 = LocalDate.parse("2023-07-20");
        // Converte uma string no formato "yyyy-MM-ddTHH:mm:ss" para um objeto LocalDateTime
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
        // Converte uma string no formato "yyyy-MM-ddTHH:mm:ssZ" para um objeto Instant (data e hora em UTC)
        Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
        // Converte uma string no formato "yyyy-MM-ddTHH:mm:ss-hh:mm" para um objeto Instant (data e hora com fuso horário)
        Instant d07 = Instant.parse("2023-07-20T01:30:26-03:00");

        // Converte uma string no formato "dd/MM/yyyy" para um objeto LocalDate usando o DateTimeFormatter fmt1
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        // Converte uma string no formato "dd/MM/yyyy HH:mm" para um objeto LocalDateTime usando o DateTimeFormatter fmt2
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2);

        // Cria um objeto LocalDate com a data específica (2023-07-20)
        LocalDate d10 = LocalDate.of(2023, 7, 20);
        // Cria um objeto LocalDateTime com a data e hora específicas (2023-07-20T01:30)
        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 1, 30);

        // Exibe as datas e horas no formato string
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
