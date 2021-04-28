package ch07.ex03.case12;

@TypeAnnotation(name = "Class:" , value=1)
public class MyClass {
	@MethodAnnotation(name = "Class", value=2)
	public void process() {}
	
	public void processParam(
			@ParamAnnotation(name ="parameter1", value= 31)String param,
			@ParamAnnotation(name ="parameter2", value= 32)Integer num) {}

	@FieldAnnotation(name = "field",value = 41)
	@FieldAnnotation2(name = "field",value = 42)
	public String memberField;
}
