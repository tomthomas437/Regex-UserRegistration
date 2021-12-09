package junit.user;

public class MoodAnalyser {
	public String analyseMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successful";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else
            return null;
    }
}

