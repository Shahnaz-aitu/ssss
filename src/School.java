import java.util.ArrayList;
import java.util.List;
class School {
    private List<Person> members;
    public School(){
        this.members = new ArrayList<>();
    }
    public void addMembers(Person person){
        members.add(person);
    }
    @Override
    public String toString() {
        StingBuilder result= new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}