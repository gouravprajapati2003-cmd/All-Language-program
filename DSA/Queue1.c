#include<stdio.h>
#define Max 10
int Queue[Max];
int rear = -1, front = -1;
void enque(int n) {
    if(rear == Max-1) {
        printf("Queue is OverFlow");
    } else {
        if(front == -1) {
            front = 0;
        }
        rear++;
        Queue[rear] = n;
    }
}
void deque() {
    if(front == -1 || front>rear) {
        printf("Queue is Empty");
    } else {
        printf("\n Deleted Item = %d",Queue[front]);
        front++;
    }
}
void display() {
    if(front == -1 || front>rear) {
        printf("Queue is Empty");
    } else {
        for(int i=front; i<=rear; i++) {
            printf("\n Element are = %d",Queue[i]);
        }
    }
}
int main() {
    enque(100);
    enque(200);
    enque(300);
    enque(400);
    enque(500);
    display();
    printf("\n");
    deque();
    printf("\n");
    display(); 

    return 0;
}