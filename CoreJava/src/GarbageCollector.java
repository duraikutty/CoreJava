public class GarbageCollector {
	static int c =0;
	public static void main(String[] args){
		for(int i=0;i<1000000000;i++) {
			GarbageCollector h = new GarbageCollector();
		}
	}
	public void finalize()  {
		System.out.println("Finalize Called : "+ ++c);
	}
}
