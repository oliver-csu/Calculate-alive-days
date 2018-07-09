import java.util.Calendar;

public class CalculateAliveDays {

	public static void main(String[] args) {
		
		Calendar my = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		//设置出生年月日 1995-05-10
		my.set(Calendar.YEAR, 1995);
		my.set(Calendar.MONTH, 4);
		my.set(Calendar.DAY_OF_MONTH, 1);
		//获取时间中的天数
		long mytime = my.getTime().getTime();
		long ctime = c.getTime().getTime();
		System.out.println((ctime-mytime)/24/60/60/1000);
	}

}
