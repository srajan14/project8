class wonders{
    void location(){
        System.out.println("location is");

    }
}
class tajmahal extends wonders{
    void location(){
        System.out.println("it is in India");
    }
} 
class greatwall extends wonders{
    void location(){
        System.out.println("it is in China");
    }
}
class colossem extends wonders{
    void location(){
        System.out.println("it is in Italy");
    }
}
class christredeemer extends wonders{
    void location(){
        System.out.println("it is in brazil");
    }
} 
class chichen extends wonders{
void location(){
    System.out.println("it is in mexico");  
}
}
class petra extends wonders{
    void location(){
        System.out.println("it is in jordan");
    }
}

class abc {
    public static void main(String[] args) {
 wonders a=new wonders();
 wonders b=new tajmahal();
 wonders c=new greatwall() ;
 wonders d=new colossem();
 wonders e=new petra();
 wonders f=new christredeemer();
 a.location();
 b.location();
 c.location();
 d.location();
 e.location();
 f.location();      
    }
}