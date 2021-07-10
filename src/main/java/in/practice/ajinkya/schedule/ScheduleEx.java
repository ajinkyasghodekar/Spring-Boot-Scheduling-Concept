package in.practice.ajinkya.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleEx {
	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	@Scheduled(initialDelay = 3000, fixedDelay = 5000)
	public void m1() {
		System.out.println("Hello: "+sdf.format(new Date()));
	}
	@Scheduled(initialDelay = 2000, fixedRate = 4000)
	public void m2() {
		System.out.println("Word: "+sdf.format(new Date()));
	}
}