import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Java Time!");
		
		// Introduction and declarations to Java Time types
		Clock clock = Clock.systemDefaultZone();
		Duration duration = Duration.ofDays(1);
		Instant instant = Instant.now();
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalTime localTime = LocalTime.now();
		MonthDay monthDay = MonthDay.now();
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		OffsetTime offsetTime = OffsetTime.now();
		Period period = Period.ofDays(1);
		Year year = Year.now();
		YearMonth yearMonth = YearMonth.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		ZoneId zoneId = ZoneId.systemDefault();
		ZoneOffset zoneOffset = ZoneOffset.UTC;
		
		// Basic printing
		System.out.println("Clock: " + clock);
		System.out.println("Duration: " + duration);
		System.out.println("Instant: " + instant);
		System.out.println("LocalDate: " + localDate);
		System.out.println("LocalDateTime: " + localDateTime);
		System.out.println("LocalTime: " + localTime);
		System.out.println("MonthDay: " + monthDay);
		System.out.println("OffsetDateTime: " + offsetDateTime);
		System.out.println("OffsetTime: " + offsetTime);
		System.out.println("Period: " + period);
		System.out.println("Year: " + year);
		System.out.println("YearMonth: " + yearMonth);
		System.out.println("ZonedDateTime: " + zonedDateTime);
		System.out.println("ZoneId: " + zoneId);
		System.out.println("ZoneOffset: " + zoneOffset);
		
		// Calculations
		System.out.println("Add 3 hours: " + localDateTime.plusHours(3));
		System.out.println("Add 1 day: " + localDateTime.plusDays(1));
		System.out.println("Add 2 weeks: " + localDateTime.plusWeeks(2));
		System.out.println("Add 3 months: " + localDateTime.plusMonths(3));
		System.out.println("Add 5 years: " + localDateTime.plusYears(5));
		
	}

}
