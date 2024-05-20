package java大作业;
import java.util.*;

public class SubwayMap {
	private Map<String,Map<String,Double>> map;
	public SubwayMap() {
		this.map=new LinkedHashMap<>();
	}
	public void addLine(String LineName) {
		map.put(LineName, new LinkedHashMap<>());
	}
	public void addStation(String LineName,String StationName,double distance) {
		map.get(LineName).put(StationName,distance);
	}
	

}
