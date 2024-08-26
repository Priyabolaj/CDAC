class LargestDigit
    {
        public static void main(String[] args)
        {
            int number = 4821, LargestDigit= 0;
            while(number != 0)
            {
                int remainder = number % 10;
                //reverse = reverse * 10 + remainder;
		if(remainder>LargestDigit)
			LargestDigit=remainder;
                number = number/10;
            }
            System.out.println("Largest Digit is: " +LargestDigit );
        }
    }