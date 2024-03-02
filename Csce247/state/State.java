import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    protected  ArrayList<String> words;
    private Random random;


	public State(SpellingList spellingList)
	{
		random= new Random();
		this.spellingList = spellingList;
	}

	public String getNextWord()
	{
if(words == null)
{
	return null;
}
return words.get(random.nextInt(words.size()));
	};
	public abstract void increaseGrade();
	public abstract void decreaseGrade();
}