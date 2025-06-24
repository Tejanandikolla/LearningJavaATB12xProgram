//24)  Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
//           :- take the Site URL input from the user
//Example Scenarios
//Input: example.com
//Output: The website type is: Commercial website
//Input: example.org
//Output: The website type is: Non-profit organization
//Input: example.edu
//Output: The website type is: Educational institution
//Input: example.gov
//Output: The website type is: Government website
//Input: example.net
//Output: The website type is: Network-related website
//Input: example.info
//Output: The website type is: Informational website
//Input: example.xyz
//Output: The website type is: Unknown or other types of websites
package Task23thjunif_else;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a wedsite URL:");
        String url= scanner.next().toLowerCase();

        if(url.endsWith(".com")){
            System.out.println("The website type is: Commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("The website type is: Non-profit organization");
        }
        else if(url.endsWith(".edu")){
            System.out.println("The website type is: Educational institution");
        }
        else if(url.endsWith(".gov")){
            System.out.println("The website type is: Government website");
        }
        else if (url.endsWith(".net")){
            System.out.println("The website type is: Network-related website");
        }
        else if(url.endsWith(".info")){
            System.out.println("The website type is: Informational website");
        }else {
            System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
