
public class OldLady {

	public static void main(String[] args) {
		System.out.println("There was am old lady who swallowed a fly.");
		method1();
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		method2();
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		method3();
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to  swallow a cat.");
		method4();
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		method5();
		System.out.println("There was an old lady who sallowed a horse,");
		System.out.println("She died of course.");
	}
	public static void method1() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhapse she'll die.");
	}
	public static void method2() {
		System.out.println("She swallowed the spider to chatch the fly,");
		method1();
	}
	public static void method3() {
		System.out.println("She swallowed the bird to chatch the spider,");
		method2();
	}
	public static void method4() {
		System.out.println("She swallowed the cat to chatch the bird");
		method3();
	}
	public static void method5() {
		System.out.println("She swallowed the dog to chatch the cat");
		method4();

	}

}
