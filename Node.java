package com.company.Heap;

class Node<T> {
    protected T val;
    protected Node<T> left;
    protected Node<T> right;

    protected Node(T val, Node<T> left, Node<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
