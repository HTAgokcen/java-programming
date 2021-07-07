package day48_consructors_static;

public class test {

  static int count;
  public test(){

      count++;

  }
  public test(int i) {
      count += i;
  }
  public test(String s) {
      count += s.length();
  }

}
class T {
    public static void main(String[] args) {
        new test();
        test a = new test();
        test a2 = new test("word");
        test a3 = new test(5);
        System.out.println(test.count);
    }
}
