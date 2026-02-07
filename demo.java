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
    }
} 