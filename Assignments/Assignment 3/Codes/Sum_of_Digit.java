class Sum_of_Digit
    {
        public static void main(String[] args)
        {
            int number = 9876, sum= 0;
            while(number != 0)
            {
                int remainder = number % 10;
                sum+=remainder;
                number = number/10;
            }
            System.out.println("Sum of Digit is " + sum);
        }
    }