import java.util.Arrays;

public class Student {
    private String name;
    private int marks[];

    public Student(String name) {
        this.name = name;
    }

    public void addMark(int mark) {
        if (mark < 2 && mark > 5) {
            return;
        }
        marks = Arrays.copyOf(marks, marks.length + 1);
        marks[marks.length - 1] = mark;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return
                "Имя=" + name + '\'' +
                " " + Arrays.toString(marks);
    }
}