package lab4;

public class birthDate extends Thread {
	int birthDate=31;
	public void run() {
		for(int i=1;i<=10;i++) {
			int result=birthDate*i;
			System.out.println(birthDate+" July"+"*"+i+"="+result);
			}
	
}
	}
