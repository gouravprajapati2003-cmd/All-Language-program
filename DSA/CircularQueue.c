// WAP a program to implement a Circular Queue.
#include <stdio.h>
#define Max
int a[6]; // It means we can store maximum 6 element a Queue.
int front = -1, rear = -1;
void enqueue(int n) {
    if((rear + 1) % 6 == front) {
        printf("Queue is Full");
    } else {
        if(front == -1) {
            front = 0;
        }
        rear = (rear + 1) % 6; // Since Maxsize is 6.
        a[rear] = n;
    }
}
void dequeue() {
    if(front == -1) {
        printf("Queue is Empty");
    } else {
        printf("\nDeleted Item = %d",a[front]);
        if(front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % 6;
        }
    }
}
void traverse() {
    int i;
    if(front == -1) {
        printf("Queue is Empty");
    } else {
       i = front;
       while(i != rear) {
           printf("%d\t",a[i]);
           i = (i+1)%6;
       }
    }
    printf("%d",a[rear]);
}

int main()
{
    enqueue(10);
    enqueue(20);
    enqueue(30);
    enqueue(40);
    enqueue(50);
    enqueue(60);
    //enqueue(70);
    traverse();
    printf("\n");
    dequeue();
    printf("\n");
    traverse();

    return 0;
}
