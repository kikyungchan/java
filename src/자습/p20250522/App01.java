package 자습.p20250522;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class App01 {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(3, 10, 7, 2, 5, 10, 3, 1, 8);
//        numbers.stream()
//                .filter(s -> s % 2 == 0)
//                .map(s -> 2 * s)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);
//        System.out.println();
//
//
//        List<String> names = List.of("Eunji", "Minho", "Sora", "minho", "Jin", "eunji", "HYUN");
//
//        String collect = names.stream()
//                .map(s -> s.toLowerCase())
//                .distinct()
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//                .filter(s -> s.length() >= 4)
//                .sorted()
//                .collect(joining(","));
//        System.out.println("collect = " + collect);
//
//
//        System.out.println();
//
//
//        List<Student> students = List.of(
//                new Student("Alice", 95),
//                new Student("Bob", 45),
//                new Student("Charlie", 88),
//                new Student("David", 60),
//                new Student("Eve", 50),
//                new Student("Frank", 33),
//                new Student("Grace", 75)
//        );
//
//        //어떻게 할건데
//        //1.전체 순회
//        students.stream()
//                //2. 성적 50점이상인얘만 필터
//                .filter(s -> s.getScore() >= 50)
//                //3.그중에 가장 높은얘 3명
//                .sorted((a, b) -> b.getScore() - a.getScore())
//                .limit(3)
//                .min(Comparator.comparingInt(Student::getScore))
//                .ifPresent(System.out::println);
//        //4.그중에 가장 낮은얘 1명
//
//
//        System.out.println();
//        List<Employee> emp = List.of(
//                new Employee("Alice", 60000, "HR"),
//                new Employee("Bob", 40000, "Engineering"),
//                new Employee("Charlie", 55000, "Marketing"),
//                new Employee("David", 70000, "Engineering"),
//                new Employee("Eve", 30000, "HR"),
//                new Employee("Frank", 45000, "Marketing")
//        );
//        emp.stream()
//                //급여가 50,000이상인애 필터
//                .filter(s -> s.getSalary() >= 50000)
//                .forEach(System.out::println);
//        //모든 직원의 급여 평균
//        System.out.println();
//        double v = emp.stream()
//                .mapToInt(s -> s.getSalary())
//                .average()
//                .orElse(0);
//        System.out.println("v = " + v);
//        System.out.println();
//
//
//        emp.stream()
//                //급여가 평균 이상인 직원들의 이름 출력
//                .filter(s -> s.getSalary() >= 50000)
//                .map(s -> s.getName())
//                .forEach(System.out::println);
//        System.out.println();
//
//        emp.stream()
//                //가장 높은 급여를 받은 직원의 이름 출력
//                .sorted((a, b) -> b.getSalary() - a.getSalary())
//                .map(a -> a.getName())
//                .limit(1)
//                .forEach(System.out::println);
//        System.out.println();
//        emp.stream()
//                //부서별로 평균 급여 출력
//                .collect(groupingBy(Employee::getDepartment, averagingInt(Employee::getSalary)))
//                .entrySet()
//                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        System.out.println();
        List<Staff> staff = List.of(
                new Staff("Alice", 60000, "HR"),
                new Staff("Bob", 40000, "Engineering"),
                new Staff("Charlie", 55000, "Marketing"),
                new Staff("David", 70000, "Engineering"),
                new Staff("Eve", 30000, "HR"),
                new Staff("Frank", 45000, "Marketing"),
                new Staff("Grace", 80000, "Engineering"),
                new Staff("Hannah", 50000, "Marketing")
        );
        //1.부서별로 평균 급여 출력
        staff.stream()
                .collect(groupingBy(Staff::getDepartment, averagingInt(Staff::getSalary)))
                .entrySet()
                .forEach(s -> System.out.println(s.getKey() + ": " + s.getValue()));
        System.out.println();
        //2.부서별로 최고 급여자출력
        staff.stream()
                .collect(Collectors.groupingBy(Staff::getDepartment));
        

        //3.전체 직원 중 평균 급여 이상 인 직원 이름을 오름차순으로 출력

    }
}
