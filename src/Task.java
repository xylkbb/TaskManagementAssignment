public class Task {
    private String name;
    private Priority priority;


    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("|");
        System.out.println("Priority: " + priority);
        System.out.println(" ");
    }



}
