package School;

public class vote {
    private int yesvotes;
    private int novotes;
    private String topic;

    public vote(String topic){
        this.topic = topic;
        yesvotes = 0;
        novotes = 0;
    }

    public void vote_yes(){
        yesvotes++;
    }

    public void vote_no(){
        novotes++;
    }
    public void clear_votes(){
        novotes = 0;
        yesvotes = 0;
    }
    public int total_yes(){
        return yesvotes;
    }
    public int total_no(){
        return novotes;
    }
    public String toString(){
        return "Issue: " + topic + "yes votes: " + yesvotes + ". No Votes: " + novotes;
    }
}
