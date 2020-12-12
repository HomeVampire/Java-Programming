//* \033: It represents the ASCII escape character. Its ANSI value is 27. It stands for ESC.
//* [: It represents the escape sequence. It is also known as CSI (Control Sequence Indicator). The CSI command starts with ESC[ followed by zero or more parameters.
//! On combining the above codes, we get \033[ or ESC[.

//* \033[H: It moves the cursor at the top left corner of the screen or console.
//* \033[2J: It clears the screen from the cursor to the end of the screen.
//! So we get "\033[H\033[2J". This combination of code clears the screen or console.


public class ProgressBar{
    public static void main(String args[]) throws Exception{  
		  
		// System.out.flush();  
        for(int i=0; i<=10; i++){
            System.out.print("\033[H\033[2J");
            System.out.println("My Progress Bar:");
            for(int j=0; j<i; j++){
                System.out.print("= ");
            }
            System.out.print(i*10 + "%");
            Thread.sleep(500);
        }
	}
}