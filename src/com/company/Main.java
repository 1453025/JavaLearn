package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<?> groups = grouping(Arrays.asList(1, 2, 3), Arrays.asList(0, 1, 2));
        System.out.println(groups.size());
        System.out.println(groups);
        List<?> groupingList = groupingList(Arrays.asList(1, 2, 3), 3);
        System.out.println(groupingList.size());
        System.out.println(groupingList);
    }



    private static List<List<List<Integer>>> groupingList(List<Integer> users, Integer groups) {
        if (users.isEmpty()) {
            List<List<List<Integer>>> boCachSapXep = new ArrayList<>();
            List<List<Integer>> empty = new ArrayList<>();
            for (int i = 0; i < groups; i++) {
                List<Integer> box = new ArrayList<>();
                empty.add(box);
            }
            boCachSapXep.add(empty);
            return boCachSapXep;
        } else {
            Integer user = users.get(0);
            List<List<List<Integer>>> subs = groupingList(users.subList(1, users.size()), groups);
            List<List<List<Integer>>> boCachSapXep = new ArrayList<>();

            for (List<List<Integer>> sub : subs) {
                for (int j = 0; j < groups; j++) {
                    List<List<Integer>> groupBox = copy(sub);
                    boCachSapXep.add(groupBox);
                }
            }
            for (int k = 0; k < boCachSapXep.size(); k++) {
                int j = k % groups;
                boCachSapXep.get(k).get(j).add(user);
            }
            return boCachSapXep;
        }
    }

    private static List<Map<Integer, Integer>> grouping(List<Integer> users, List<Integer> groups) {
        if (users.isEmpty()) {
            Map<Integer, Integer> empty = Collections.emptyMap();
            return Collections.singletonList(empty);
        } else {
            Integer user = users.get(0);
            List<Map<Integer, Integer>> subs = grouping(users.subList(1, users.size()), groups);
            List<Map<Integer, Integer>> solutions = new ArrayList<>();
            for (Integer group : groups) {
                for (Map<Integer, Integer> sub : subs) {
                    Map<Integer, Integer> m = new HashMap<>(sub);
                    m.put(user, group);
                    solutions.add(m);
                }
            }
            System.out.println(solutions);
            return solutions;
        }
    }

    private static List<List<Integer>> copy(List<List<Integer>> input) {
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> anInput : input) {
            List<Integer> line = new ArrayList<>();
            line.addAll(anInput);
            result.add(line);
        }
        return result;

    }
}

