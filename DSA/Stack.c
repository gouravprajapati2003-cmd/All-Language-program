// This is Dynamic Stack Program.
#include<stdio.h>
#include<malloc.h>
struct node {
    int no;
    struct node *next;
};
struct node *Top = NULL;
void push(int n) {
    struct node *p;
    p = (struct node*)malloc(sizeof(struct node));
    p->no = n;
    p->next = NULL;
    if(Top == NULL) {
        Top = p;
    } else {
        p->next = Top;
        Top = p;
    }
}
void traverse() {
    struct node *temp;
    if(Top == NULL) {
        printf("Stack is Empty");
    } else {
        temp = Top;
        while(temp != NULL) {
            printf(" %d",temp->no);
            temp = temp->next;
        }
    }
}
void pop() {
    struct node *temp = Top;
    if(Top == NULL) {
        printf("Stack is Empty");
    } else {
            printf("\nDeleted Item = %d\n",temp->no);
            Top = Top->next;
            free(temp);
    }
}
void oddEven() {
    struct node *temp = Top;
    if(Top == NULL) {
        printf("Stack is Empty");
    } else {
        while(temp != NULL) {
            if(temp->no%2==0){
                printf("\nEven Number = %d",temp->no);
            } else {
                printf("\nOdd Number = %d",temp->no);
            }
            temp = temp->next;
        }
    }
}
void countItems() {
    struct node *temp = Top;
    int count = 0;
    if(Top == NULL) {
        printf("Stack is Empty");
    } else {
        while(temp != NULL) {
            count++;
            temp = temp->next;
        }
        printf("\nTotal Elements = %d",count);
    }
}
int main() {
    push(100);
    push(265);
    push(300);
    push(409);
    push(500);
    push(117);
    traverse();
    pop();
    traverse();
    oddEven();
    countItems();
}