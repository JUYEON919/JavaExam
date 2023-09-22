package ppt5;

public class AnonymousClass{
   
	//필드
   public static void main(String[] args) {
      Person lee = new Person("lee");
      Student kim = new Student("kim", "ansan uni.");
      
      kim.greeting();
      kim.study();
      kim.getScore();

    //여기부터
      //메인안에서 지역변수로쓰임
      Student james = new Student() { //익명객체제임스만든거임 일회성임
    	  
    	  //한번의 하나의 클래스 혹은 인스턴스만 상속 혹은 구현가능
         @Override
         public void greeting() {
            System.out.println("Hello, My Name is " + getName());
            System.out.println("I am studing in " + getSchool());
         }
         @Override
         public void study() {
        	 play();
         }
         
         public void play() {
        	 System.out.println("Play");
         }
         
      };//여기까지를 필드밖으로 빼고
      //   AnonymousClass my = new AnonymousClass(); 설정해줘도 똑같이 된다
      
      james.setSchool("james");
      james.setSchool("ansan uni");
      james.greeting();
      //james.play();//스튜던트에있는메서드만사용가능해서 플에이못씀
      james.study();
      
    }//main
   
}//AnonymousClass

class Person{
   private String name;
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Person() {}
   
   public Person(String name) {
      this.name = name;
   }
   
   public void greeting() {
      System.out.println("안녕하세요. " + name + " 입니다.");
   }
}//Person

class Student extends Person{
   
   // 추가 필드 
   private String school;
   private int score=0;
   
   public Student() {}
   
   public Student(String name, String school) {
      super(name);
      this.school = school;
   }
   
   // 부모의 메서드 오버로딩
   @Override
   public void greeting() {
      super.greeting();
      System.out.println("저는 " + school + "에 재학중입니다.");
   }
   
   // 자식에서 새로운 메서드 추가.
   public void study() {
      System.out.println("열공!");
      setScore(getScore() + 1);
   }

   public int getScore() {
      return score;
   }

   public void setScore(int score) {
      this.score = score;
   }

   public String getSchool() {
      return school;
   }

   public void setSchool(String school) {
      this.school = school;
   }
}//class Student