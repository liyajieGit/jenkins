import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huangjie.dubbo_Service.service.IProcessData;








public class test {
	
	
	
	//private static MathContext mc=111;

	public static void main(String[] args) {
		
	BigDecimal  a=new BigDecimal("1.0");
	BigDecimal  b=new BigDecimal("0.3");
	System.out.println(a.subtract(b).floatValue());;
	double m=1.0;
	double n=0.9;
	System.out.println(m-n);
	System.out.println(Double.MAX_VALUE);
	
	System.out.println(a.add(b));
	System.out.println(a.divide(b,10,BigDecimal.ROUND_HALF_UP));
	System.out.println(a.multiply(b));
	System.out.println(a.setScale(3, 1));
	float c=1.0f;
	
System.out.println(c);
	
		
	}

}
