class A
{
  int num1;
  String name1;
  A()
  {
    num1 = 10;
    name1 = "neeraj";
  }
}
class B
{
  int a1;
  int a2;
  B()
  {
    a1 = 56;
    a2 = 89;
  }
}
public class Abc {
  public static void main(String[] args) {
    Object arr[] = new Object[5];
    arr[0] = new A();
    arr[1] = new B();
    for (var res:arr) {
      if(res instanceof A)
      {
        //A tobj= (A)res;
        System.out.println(((A) res).name1);
      }

    }


  }
}
