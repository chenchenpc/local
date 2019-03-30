package demo.finaldemo;

/**
 * @author chenpengchao   2018/9/27 13:54
 */
public class FinalApp {

    static class Person {

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        void changeValue(StringBuffer s) {
            s .append("is");
            s = new StringBuffer("she");
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        final StringBuffer s = new StringBuffer("he");
        Person p = new Person();
        p.changeValue(s);
        System.out.println(s);
        Person person = new Person();
        person.setId(2);
        System.out.println(person);
        changePerson(person);
        System.out.println(person);
    }

    static void changePerson(Person p){
        p = new Person();
        p.setId(1);
        System.out.println(p);
    }


}
