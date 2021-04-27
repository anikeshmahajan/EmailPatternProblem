package emailSampleValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
	    String regexSample1 = "[a-z]{3}@[a-z]{5}.[a-z]{3}";
	    String regexSample2 = "[a-z]{3}-[0-9]{3}@[a-z]{5}.[a-z]{3}";
	    String regexSample3 = "[a-z]{3}.[0-9]{3}@[a-z]{5}.[a-z]{3}";
	    String regexSample4 = "[a-z]{3}[0-9]{3}@[a-z]{3}.[a-z]{3}";
	    String regexSample0 = "[a-z]{3}-[0-9]{3}@[a-z]{3}.[a-z]{3}";
	    String regexSample5 = "([a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2})";
	    String regexSample6 = "[a-z]{3}@[0-9]{1}.[a-z]{3}";
	    String regexSample7 = "[a-z]{3}@[a-z]{5}.[a-z]{3}.[a-z]{3}";
	    String regexSample8 = "([a-z]{3}[+][0-9]{3}@[a-z]{5}.[a-z]{3})";



		 void emailIdValidator1(String email1) {
		    Pattern compile = Pattern.compile(regexSample1);
		    Matcher matcher = compile.matcher(email1);
		    boolean result =matcher.matches();
			    if(result) {
			    	System.out.println("Valid EmailId");
			    }else
			    	System.out.println("Not valid");
		}
		
		 void emailIdValidator2(String email2) {
			    Pattern compile = Pattern.compile(regexSample2);
			    Matcher matcher = compile.matcher(email2);
			    boolean result =matcher.matches();
				    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		
		 void emailIdValidator3(String email3) {
			    Pattern compile = Pattern.compile(regexSample3);
			    Matcher matcher = compile.matcher(email3);
			    boolean result =matcher.matches();
				    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		
		 void emailIdValidator4(String email4) {
			    Pattern compile = Pattern.compile(regexSample4);
			    Matcher matcher = compile.matcher(email4);
			    boolean result =matcher.matches();
				    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		 
		 void emailIdValidator0(String email) {
			    Pattern compile = Pattern.compile(regexSample0);
			    Matcher matcher = compile.matcher(email);
			    boolean result =matcher.matches();
				    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		
		 void emailIdValidator5(String email5) {
			    Pattern compile = Pattern.compile(regexSample5);
			    Matcher matcher = compile.matcher(email5);
			    boolean result =matcher.matches();
				    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		
		 void emailIdValidator6(String email6) {
			    Pattern compile = Pattern.compile(regexSample6);
			    Matcher matcher = compile.matcher(email6);
			    boolean result =matcher.matches();
			    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		
		 void emailIdValidator7(String email7) {
			    Pattern compile = Pattern.compile(regexSample7);
			    Matcher matcher = compile.matcher(email7);
			    boolean result =matcher.matches();
				    if(result) {
				    	System.out.println("Valid EmailId");
				    }else
				    	System.out.println("Not valid");
			}
		
		 void emailIdValidator8(String email8) {
			    Pattern compile = Pattern.compile(regexSample8);
			    Matcher matcher = compile.matcher(email8);
			    boolean result =matcher.matches();
				    if(result) 
				    	System.out.println("Valid EmailId");
				    else
				    	System.out.println("Not valid");
			}
}
