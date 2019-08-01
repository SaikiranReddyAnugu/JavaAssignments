public class ExceptionHandling {
    /**
     * This method is an example to show different exceptions created
     * @param age
     * @throws Exception
     */
    public static void check(int age) throws Exception{
        if(age<0)
            throw new Invalid_NumberException("please provide positive value");
        if(age>30)
            throw new AgeOutOfBoundException("please provide age less than 30");
        if(age<18)
            throw new Minor_AgeException("Minor Age");

    }

public static void main(String args[]) {
    try {
        check(9);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("Finally");
    }
}
}
