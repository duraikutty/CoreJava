package javaeight;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void functionalInterfaceFn();
}

@FunctionalInterface
interface Function extends FunctionalInterfaceDemo{
	public void functionalInterfaceFn();
}