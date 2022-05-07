public class Student{

        private String stdName;
        private int roll_num;
        private String[] subjects =new String[]{"English", "Maths", "Science","Social","Computer"};
        
        Student()
        {

        }

        public Student(String stdName, int roll_num, String[] subjects) {
            this.stdName = stdName;
            this.roll_num = roll_num;
            this.subjects = subjects;
        }

        public String getStdName(){
            return stdName;
        }

        public int getRoll_num(){
            return roll_num;
        }

        public String[] getSubjects(){
            return subjects;
        }

        public void setStdName(String stdName){
            this.stdName = stdName;
        }

        public void setRoll_num(int roll_num){
            this.roll_num = roll_num;
        }

        public void setSubjects(String[] subjects){
            this.subjects = subjects;
        }

        public String toString(){
            return "Student Name: " + stdName + "\nRoll Number: " + roll_num + "\nSubjects: " + subjects;
        }

        public void setMarks(double[] marks) {
        }
}