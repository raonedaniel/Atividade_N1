import java.sql.Date;
import java.text.SimpleDateFormat;

public class PrincipalTest {
	public static void main(String[] args) {
		System.out.println()
		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
		String time = d.format(new Date(0));
	}
}
