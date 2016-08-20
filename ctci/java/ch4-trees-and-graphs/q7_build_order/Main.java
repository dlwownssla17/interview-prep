package q7_build_order;

import static q7_build_order.QuestionA.*;
import static q7_build_order.QuestionB.*;

/**
 * Created by jjlee on 8/19/16.
 */
public class Main {
    private static String[] projects;
    private static String[][] dependencies;
    private static String[][] dependenciesCircular;

    private static void setup() throws Exception {
        projects = new String[]{ "a", "b", "c", "d", "e", "f", "g", "h" };
        dependencies = new String[][]{ { "a", "b" }, { "a", "c" }, { "a", "f" }, { "b", "f" }, { "c", "f" },
                { "e", "a" }, { "e", "b" }, { "g", "d" } };
        dependenciesCircular = new String[][]{ { "a", "b" }, { "a", "c" }, { "a", "f" }, { "b", "f" }, { "c", "f" },
                { "e", "a" }, { "e", "b" }, { "g", "d" }, { "c", "e" } };
    }

    private static void testBuildOrder(String[][] dependencies) throws Exception {
        String[] buildOrder = buildOrder(projects, dependencies);
        if (buildOrder == null) {
            System.out.println("Circular dependency.");
        } else {
            for (String s : buildOrder) {
                System.out.println(s);
            }
        }
    }

    private static void testBuildOrderTopologicalSort(String[][] dependencies) throws Exception {
        String[] buildOrder = buildOrderTopologicalSort(projects, dependencies);
        if (buildOrder == null) {
            System.out.println("Circular dependency.");
        } else {
            for (String s : buildOrder) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        setup();
        testBuildOrder(dependencies);
        System.out.println();
        testBuildOrder(dependenciesCircular);
        System.out.println();
        testBuildOrderTopologicalSort(dependencies);
        System.out.println();
        testBuildOrderTopologicalSort(dependenciesCircular);
    }
}
