package Structures.QueueOfTasks;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Task> queue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority).reversed());


        queue.offer(new Task("Task 1", 2));
        queue.offer(new Task("Task 2", 1));
        queue.offer(new Task("Task 3", 3));

        // Выполняем задачи в порядке убывания приоритета
        while (!queue.isEmpty()) {
            Task task = queue.poll();
            System.out.println("Выполняем задачу: " + task.getTask());
        }
    }
}

