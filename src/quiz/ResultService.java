package quiz;

import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.control.RadioButton;

public class ResultService {
	public void result(Parent root) {
		Inquiry into = new Inquiry();
		ArrayList<RadioButton> radioTravel=new ArrayList<RadioButton>();
		for(int i=0;i<3;i++) {
			radioTravel.add((RadioButton)root.lookup("#radioTr"+i));//3가지 주소를 각각 arraylist에 저장중
			if(radioTravel.get(i).isSelected()) {//만약 3개중 하나가 선택이 되었을때
				into.setTravel(i);//왜 i숫자를 (dto)에 넣는거지
			}
		}
	}
}
