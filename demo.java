class Demo 
{
    public static void main(String args[])
    {
        int result = 95;

        switch(result)
        {
            case 80:
                System.out.println("B+ Grade");
                break;
            
            case 90:
                System.out.println("A Grade");
                break;

            case 95:
                System.out.println("A+ Grade");
                break;
            
            default:
                System.out.println("Pass Grade");
                break;

        }

        System.out.println();
        login_system();

        System.out.println();
        System.out.println("Session ended");
    }

    public static void login_system()
    {
        String user = "admin";

        switch(user)
        {
            case "admin":
                System.out.println("Full access");
                break;
            
            case "guest":
                System.out.println("Limited access");
                break;

            case "subscriber":
                System.out.println("Standard access");
                break;
            
            default:
                System.out.println("Unknow user");
        }
    }
}