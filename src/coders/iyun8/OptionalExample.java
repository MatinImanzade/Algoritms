package coders.iyun8;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OptionalExample {

    static Optional<String> optionalString = Optional.empty();
    boolean isPresent = optionalString.isPresent();
    String valueStr = optionalString.get();
    static String valueOrElse = optionalString.orElse("Salam");
    static String orElseGet = optionalString.orElseGet(() -> "hellooooooooooooooooooooooooooo");
    String orElseThrow = optionalString.orElseThrow(() -> new SQLException());

    public OptionalExample() throws SQLException {

    }

    public static void main(String[] args) throws SQLException {


//        Optional<String> optional = Optional.of("Matin");
//           List<String> list = optional
//                 .stream()
//                 .collect(Collectors.toList());
//
//           optional.coı















//        Optional<String> optionalS = Optional.empty();
//        SupplierExample supplierExample = new SupplierExample();
//
//        String value = optionalS.orElseGet(supplierExample);
//        System.out.println(value);

//        String s = supplierExample.get();
//        System.out.println(s);
 //       String s =  optionalString.orElseGet(supplierExample);


//        OptionalExample optionalExample = new OptionalExample();
//        String s = optionalExample.orElseThrow;
    }

}
