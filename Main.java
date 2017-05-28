
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		//리스트 생성
		List<GuyVO> ls = new ArrayList<GuyVO>();
		
		//자식들 객체 생성
		GuyVO friend01 = new GuyVO("홍길동", 21, 1, 45000);
		GuyVO friend02 = new GuyVO("김희선", 21, 2, 88000);
		GuyVO friend03 = new GuyVO("미나", 21, 2, 95000);
		
		//리스트에 객체 추가
		ls.add(friend01);
		ls.add(friend02);
		ls.add(friend03);
		
		//유틸리티 메소드
		Method.avg(ls);
		Method.best(ls);
	}
}