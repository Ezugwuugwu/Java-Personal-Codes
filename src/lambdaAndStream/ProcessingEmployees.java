package lambdaAndStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee [] employess = {new Employee("Max", "Abonyi", 2564, "Chemistry"),
                new Employee("Mbohnson", "Aawu", 404, "Pharm"),
                new Employee("Mbohnson", "Jgwu", 445, "Pharm"),
                new Employee("Ami", "Abonyi", 400.65, "Pharm")
        };

        List<Employee> employees = Arrays.asList(employess);
                    employees.stream()
                    .forEach(System.out::println);


            Predicate<Employee> seniorEmployee =
                    e -> (e.getSalary() >=400 && e.getSalary() <=600);
            System.out.print("\nEmployees with salary more than 4000 and less than 6000 \n ");
                    employees.stream()
                    .filter(seniorEmployee)
                    .sorted(Comparator.comparing(Employee::getSalary))
                    .forEach(System.out::println);

            System.out.printf("\nDisplay first Employee with salary in the range $4000-$6000:\n %s",
                            employees.stream()
                            .filter(value -> value.getSalary() >=400 && value.getSalary() <=600)
                            .findFirst()
                            .get());


        //Mapping Employees to Unique Last Name Strings
        // Functions for getting first and last names from an Employee
        Function<Employee, String> byLastName = Employee::getLastName;
        Function<Employee, String>  byFirstName = Employee::getFirstName;

        Comparator<Employee> firstThenLastName = Comparator.comparing(byFirstName).thenComparing(byLastName);
        System.out.println("\n// Functions for getting(Sorting) first and last names from an Employee");
                employees.stream()
                .sorted(firstThenLastName)
                .forEach(System.out::println);

        System.out.println("\n Reversing the sorted order. That is the in descending order");
                employees.stream()
                .sorted(firstThenLastName.reversed())
                .forEach(System.out::println);

        // display unique employee last names sorted
        System.out.println("\n// display unique employee last names sorted");
                employees.stream()
                .map(value -> value.getLastName())// or .map(Employee::getLastName)
                .sorted()
                .distinct()
                .forEach(System.out::println);


        // display only first and last names
        System.out.printf("%nEmployee names in order by first name then last name:%n");
                employees.stream()
                .sorted(firstThenLastName)
                .map(value -> value.getName())// or .map(Employee::getName)
                .forEach(System.out::println);

        // group Employees by department
        System.out.println("\n// group Employees by department");
                         Map<String, List<Employee>> grouByDepartment =
                         employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

                        grouByDepartment.forEach((department, employeesByDepartment) ->
                        {
                            System.out.println(department+":");
                            employeesByDepartment.forEach(System.out::println);
                        });


        // count number of Employees in each department
        System.out.printf("%nCount of Employees by department:%n");
                        Map<String, Long>countEmployeeByDepartment =
                        employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

                        countEmployeeByDepartment.forEach((department, count)-> {
                            System.out.printf("%s has %d employees %n", department, count);
                        });

        System.out.printf("%nSum of Employees' salaries (via sum method): %.2f%n",
                        employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum()
                        );

        // calculate sum of Employee salaries with Stream reduce method
        System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
                        employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2)->(value1 + value2))
                        );

        // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
                    employees.stream()
                      .mapToDouble(Employee::getSalary)
                      .average()
                      .getAsDouble()
                        );
    }
}