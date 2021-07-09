package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Plan {
	private Date date;
	public ArrayList schedule = new ArrayList();
	public HashMap<Integer, ArrayList> people = new HashMap<Integer, ArrayList>();

	public Plan(String date, String schedule) {
		try {
			this.date = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			this.schedule.add(schedule);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void addPeople(Integer i, String person, HashMap<Integer, ArrayList> hm) {
		ArrayList array = new ArrayList();
		if (hm != null) {
			array = hm.get(i);
		}
		System.out.println(this.people);
		System.out.println(array);
		array.add(person);
		this.people.put(i, array);
	}

	public void addSchedule(String schedule) {
		this.schedule.add(schedule);
	}

	public Date getDate() {
		return this.date;
	}

	public ArrayList getSchedule() {
		return this.schedule;
	}

	public HashMap<Integer, ArrayList> getPeople() {
		return this.people;
	}

	public int getScheduleSize() {
		return this.schedule.size();
	}

	public int getPeopleSize() {
		return this.people.size();
	}
}
