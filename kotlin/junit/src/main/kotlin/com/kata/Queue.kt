package com.kata

import java.util.Stack

class Queue {

    fun reverseQueue(queue: ArrayDeque<Int>): ArrayDeque<Int> {
        val stack = Stack<Int>()
        while (!queue.isEmpty()) {
            stack.push(queue.removeFirst())
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop())
        }
        return queue

    }
}