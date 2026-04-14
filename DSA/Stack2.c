// This is Static Stack Program. 
#include<stdio.h>
#define Max 5
int Stack[Max];
int top = -1;
void push(int n) {
    if(top == Max-1) {
        printf("Stack is OverFlow");
    } else {
        top++;
        Stack[top] = n;
    }
}
void pop() {
    if(top == -1) {
        printf("Stack is Empty");
    } else {
       int a = Stack[top];
       printf("\n Deleted Item = %d",a);
       top--;
    } 
}
void display() {
    if(top == -1) {
        printf("Stack is Empty");
    } else {
        for(int i=top; i>=0; i--) {
            printf("\n Elements are = %d",Stack[i]);
        }
    }
}
int main() {
    push(100);
    push(200);
    push(300);
    push(400);
    push(500);
    display();
    printf("\n");
    pop();
    printf("\n");
    display();
}