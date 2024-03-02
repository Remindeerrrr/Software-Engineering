public class SecondGradeState extends State {
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/second.txt");
    }
    
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
        System.out.println("State:2 -> State:3");
    }
    
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
        System.out.println("State:2 -> State:1");
    }
}