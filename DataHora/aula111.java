package DataHora;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class aula111{

    public static void main(String[] args) {
        // Criando objetos LocalDate, LocalDateTime e Instant a partir de strings
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2023-07-20T01:30:26-03:00");
        
        // Criando objetos DateTimeFormatter com padrões de formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        // Exibindo as datas formatadas utilizando os DateTimeFormatter
        System.out.println("d04 = " + d04.format(fmt1)); // Exibe a data no formato "dd/MM/yyyy"
        System.out.println("d04 = " + fmt1.format(d04)); // Exibe a data no formato "dd/MM/yyyy" (forma equivalente)
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Exibe a data no formato "dd/MM/yyyy" (forma equivalente)
        
        System.out.println("d05 = " + d05.format(fmt1)); // Exibe a data e hora no formato "dd/MM/yyyy" (ignorando a hora e minutos)
        System.out.println("d05 = " + d05.format(fmt2)); // Exibe a data e hora no formato "dd/MM/yyyy HH:mm"
        
        System.out.println("d06 = " + fmt3.format(d06)); // Exibe a data e hora com fuso horário do sistema
    }
}
