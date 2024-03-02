

public class FirstGradeState extends State {
    public  FirstGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = FileReader.getWords("state/first.txt");
    }
    public void increaseGrade()
    {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("State:1 -> State:2");
    };
	public void decreaseGrade()
    {
        System.out.println("You have reached the lowest grade!");
    }
}

