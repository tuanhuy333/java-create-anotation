import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // ton tai trong luc chay chuong trinh
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})  // duoc su dung tren class, interface, field, method, bien
public @interface JsonName {

    String value(); // cac gia tri trong interface deu dang ham abstract, ko tham so
}
