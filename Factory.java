
package Views;

public class Factory {
     public static void init_type(int choice){
        switch(choice){
            case 1: {
                Factoryint fi1 = new CreateSeller();
                fi1.making_new_page();
                break;
            }
            case 2: {
                Factoryint fi1 = new CreateBidder();
                fi1.making_new_page();
                break;
            }
            case 3: {
                Factoryint fi1 = new ViewProduct();
                fi1.making_new_page();
                break;
            }
            case 4: {
                Factoryint fi1 = new EnterAdmin();
                fi1.making_new_page();
                break;
            }
            
            default: ;
            
        }
        
    }
    
}
