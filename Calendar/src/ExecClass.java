
import java.nio.file.attribute.AclEntry;

import com.kopo.Test;

public class ExecClass {
public static void main(String[] args) {
	

	com.kopo.Test t1 = new Test();

	int a = 10;
	double b = 20;
	Integer c = 20;
//	Double d = 10.0;

	// 4자리 숫자 표시
	for(int k = 0; k<101; k++){
		
		String tmpString = String.format("%4d", k);
		String tmpString2 = String.format("%04d", k);
		
		System.out.println(tmpString);
		System.out.println(tmpString2);
	}
}

}


