package ObjectOrientedProgPart2;

public class FinalizeConcept {
	//finalize is a method which is autocalled(no need to call it) before the gc, to cleanup processing of the object
	public void finalize(){
		System.out.println("inside finalize block");
	}

	public static void main(String[] args) {
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		f1=null;//remember diagram, object which does not have any name(reference)
		
		System.out.println("neeraj");
		f2=null;
		//before gc finalize will be called twice bcoz there are two objects
		System.gc(); //garbage collector is used to destroy object which donot have reference. gc is as like destructor in c++
	}

}
