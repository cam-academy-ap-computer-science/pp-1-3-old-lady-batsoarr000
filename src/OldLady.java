/***
 * Grading Comments:
 *  Pretty good job.
 *  You definitely got the concept of reducing
 *  code by nesting methods.
 *  Compiles/runs: 15/15
 *  Desired output: 4/6  Some typos, 'sallowed' 'perhapse', spaces
 *     It would have been nice to put newlines between the verses.
 *  Efficiency: 1/2 - The nesting is nice, but you could have done more.
 *   You ended up typing:
 *    "There was an old lady who swallowed a" 
 *   a bunch of times below, and even introduced a few typos (am old lady)
 *   that wouldn't have happened if you wrote a single method.   A great
 *   example of how duplicating code can introduce bugs.
 *   Good job overall.  22/25
 */
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
