public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("ad: "+this.name);
        System.out.println("Bölüm: "+this.branch);
        System.out.println("telefon: "+this.mpno);
    }


}