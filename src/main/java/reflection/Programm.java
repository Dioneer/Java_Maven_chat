package reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employee = Class.forName("reflection.Employee");
//        Class employee2 = Employee.class;
//        Employee emp = new Employee();
//        Class emplyee3 = emp.getClass();
        Field field = employee.getField("id");
//        System.out.println(field.getType());
        Field[] fields = employee.getFields();
        for (Field i : fields){
//            System.out.println(i.getName()+" "+i.getType());
        }
        Field[] allFields = employee.getDeclaredFields();
        for (Field i : allFields){
//            System.out.println("All fields " + i.getName()+" "+i.getType());
        }
        Method someMethod = employee.getMethod("increaseSalary");
//        Method[] someMethod1 = employee.getMethods();
//        for (Method i : someMethod1){
//            System.out.println("All methods " + i.getName());
//        }
//        System.out.println("Type of methods " + someMethod1);
                Method[] someMethod3 = employee.getDeclaredMethods();
        for (Method i : someMethod3){
//            System.out.println("All methods " + i.getName());
        }
//        System.out.println("Type of methods " + someMethod3);
//        System.out.println("Type of method " + someMethod);
//        Method someMethod2 = employee.getMethod("setSalary", double.class);
//        System.out.println(Arrays.toString(someMethod2.getParameterTypes()));

//        --------------------------------------------------------------------------------------------
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/reflection/test.txt"))){
            String methodName = reader.readLine();
            String first = reader.readLine();
            String second = reader.readLine();
            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;
            Method[] methods = cl.getDeclaredMethods();
            for(Method i: methods){
                if(i.getName().equals(methodName)){
                    method=i;
                }
            }
            method.invoke(calculator, Integer.parseInt(first), Integer.parseInt(second));
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
