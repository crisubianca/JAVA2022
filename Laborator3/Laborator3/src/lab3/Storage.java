
package lab3;

/**
 *
 * @author Adm
 */
public interface Storage {
    int getStorageCapacity();

    default int changeUnitOfStorageCapacity(String requestedUnit, int storageCapacity){
       String mb = "Megabyte";
       String kb = "Kilobyte";
       String b = "Byte";
       int returnStorageCapacity = 0;
       
       if(requestedUnit.equals(mb) ==  true) {
           returnStorageCapacity = storageCapacity * 1000;
       }
       else
           if(requestedUnit.equals(kb) == true){
               returnStorageCapacity = storageCapacity * 1000000;
           }
       else
               if(requestedUnit.equals(b) == true){
                   returnStorageCapacity = storageCapacity * 1000000000;
               }
       return returnStorageCapacity;
  
    }
}
