
public class OldLady {

	public static void main(String[] args) {
		System.out.println("There was am old lady who swallowed a fly.");
		fly();
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to  swallow a cat.");
		cat();
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dog();
		System.out.println("There was an old lady who sallowed a horse,");
		System.out.println("She died of course.");
	}
	public static void fly() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhapse she'll die.");
	}
	public static void spider() {
		System.out.println("She swallowed the spider to chatch the fly,");
		fly();
	}
	public static void bird() {
		System.out.println("She swallowed the bird to chatch the spider,");
		spider();
	}
	public static void cat() {
		System.out.println("She swallowed the cat to chatch the bird");
		bird();
	}
	public static void dog() {
		System.out.println("She swallowed the dog to chatch the cat");
		cat();

	}

}
