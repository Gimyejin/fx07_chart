package quiz;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;

public class Controller implements Initializable {
	Parent root;
	Inquiry into;
	
	public void setroot(Parent root) {
		this.root = root;

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void insert() {//설문 내용 추가
		
	}
	public void cancel() {//창닫기
		System.out.println("취소");
	}
	public void look() {//결과보기
		System.out.println("저장");
		RadioButton travel1 = (RadioButton)root.lookup("#travelOut");
		RadioButton travel2 = (RadioButton)root.lookup("#travelIn");
		RadioButton travel3 = (RadioButton)root.lookup("#No");
	}
}
