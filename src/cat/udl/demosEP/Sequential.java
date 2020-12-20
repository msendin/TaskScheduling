package cat.udl.demosEP;

public class Sequential extends Composed implements Task {

    public Sequential() {
        super();
    }

    @Override
    public int durationInDays() {
        for (Task schedTask : schedTasks) duration += schedTask.durationInDays();
        return duration;
    }
}
