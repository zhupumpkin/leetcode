package CodingDojo;

import java.util.Vector;

public class Game {
    private Vector<Student> students;
    private static Conditions conditions;

    public static void setCondition(Conditions con){
        conditions  = con;
    }

    public Game(int studentnum, Conditions con) {
        setCondition ( con );
        this.students = new Vector<Student> (  );
        for(int i= 0;i!=studentnum;i++){
            students.add ( new Student (  ) );
        }

    }

    public String[] run() {
        String [] res = new String[students.size ()];
        for(int index = 0; index != students.size ();index++){
            res[index] = students.get ( index ).say ( index+1,conditions );
        }
        return res;
    }
}
