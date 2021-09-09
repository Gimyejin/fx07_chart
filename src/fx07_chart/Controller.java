package fx07_chart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class Controller implements Initializable{
	Parent root;
	PieChart pieChart;
	BarChart barChart;
	AreaChart areaChart;
	
	public void setroot(Parent root) {
		this.root=root;
		pieChart =(PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
		areaChart = (AreaChart)root.lookup("#areaChart");
		chart();
	}
	
	public void chart() {
		pieChart.setData(FXCollections.observableArrayList(
				//초기화하고자 하는 값을 넣는다
				new PieChart.Data("AWT",10),
				new PieChart.Data("Swing",30),
				new PieChart.Data("JavaFx",50),
				new PieChart.Data("Java",20)
				));
		XYChart.Series series1=new XYChart.Series();
		series1.setName("남자");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016",70),
				new XYChart.Data("2017",78),
				new XYChart.Data("2018",50),
				new XYChart.Data("2019",90)
				));
		
		XYChart.Series series2=new XYChart.Series();
		series2.setName("여자");
		series2.setData(FXCollections.observableArrayList(
				//숫자가 똑같아야 나란히 설 수 있음
				new XYChart.Data("2016",60),
				new XYChart.Data("2017",80),
				new XYChart.Data("2018",90),
				new XYChart.Data("2019",50)
				));
		barChart.getData().add(series1);
		barChart.getData().add(series2);
		
		XYChart.Series series3=new XYChart.Series();
		series3.setName("평균 온도");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016",13),
				new XYChart.Data("2017",6),
				new XYChart.Data("2018",15),
				new XYChart.Data("2019",20)
				));
		areaChart.getData().add(series3);
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
