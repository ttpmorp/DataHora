package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class aula113 {
	
	public static void main(String[] args) {

        // Exemplos de criação de objetos LocalDate, LocalDateTime e Instant a partir de strings
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant d06 = Instant.parse("2023-07-20T01:30:26Z");

        // Exemplos de subtração e adição de dias usando LocalDate
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("LocalDate = " + d04);
        System.out.println();
        System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println();

        // Exemplos de subtração e adição de horas e minutos usando LocalDateTime
        LocalDateTime pastWeekLocalDateTimeHours = d05.minusHours(7);
        LocalDateTime nextWeekLocalDateTimeHours = d05.plusHours(7);
        LocalDateTime pastWeekLocalDateTimeMinutes = d05.minusMinutes(7);
        LocalDateTime nextWeekLocalDateTimeSeconds = d05.plusSeconds(7);

        System.out.println("PastWeekLocalDateTimeHours = " + pastWeekLocalDateTimeHours);
        System.out.println("NextWeekLocalDateTimeHours = " + nextWeekLocalDateTimeHours);
        System.out.println("PastWeekLocalDateTimeMinutes = " + pastWeekLocalDateTimeMinutes);
        System.out.println("NextWeekLocalDateTimeSeconds = " + nextWeekLocalDateTimeSeconds);
        System.out.println();

        // Exemplos de subtração e adição de dias usando Instant
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("PastWeekInstant = " + pastWeekInstant);
        System.out.println("NextWeekInstant = " + nextWeekInstant);
        System.out.println();

        // Exemplos de cálculo de duração entre datas e instants
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTimeHours, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());

    }
}
