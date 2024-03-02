public class ThirdGradeState extends State {
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/third.txt");
    }
    
    public void increaseGrade() {
        System.out.println("You have reached the highest grade!");
    }
    
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("State:3 -> State:2");
    }
}