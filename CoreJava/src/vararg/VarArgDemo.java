package vararg;

import java.util.HashMap;

public class VarArgDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("d1", "l");
		hm.put("d2", "l");
		hm.put("d3", "l");
		hm.put("d4", "l");
		hm.put("d5", "l");
		hm.put("d6", "l");
		hm.put("d7", "l");
		hm.put("d8", "l");
		hm.put("d9", "l");
		hm.put("d10", "l");
		hm.put("d11", "l");
		hm.put("d12", "l");
		hm.put("d13", "l");
		hm.put("d14", "l");
		hm.put("d15", "l");
		hm.put("d16", "l");
		hm.remove("d1");
		hm.remove("d2");
		hm.remove("d3");
		hm.remove("d4");
		System.gc();
		hm.remove("d5");
		hm.remove("d6");
		hm.remove("d7");
		System.gc();
		hm.remove("d8");
		hm.remove("d9");
		hm.remove("d10");
		hm.remove("d11");
		hm.remove("d12");
		hm.remove("d13");
		System.gc();
		hm.remove("d14");
		hm.remove("d15");
		
		System.gc();
		System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();
		System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();System.gc();
		
		
		System.out.println(hm);
		
		
		
	}
}
