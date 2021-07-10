package in.practice.ajinkya.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleEx {
	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	Date d = new Date();
	@Scheduled(initialDelay = 5000, fixedDelay = 5000)
	public void m1() {
		System.out.println("Hello: ");
	}
}