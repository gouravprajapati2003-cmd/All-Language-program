#include<stdio.h>
#include<malloc.h>
struct node {
    int no;
    struct node *next;
};
struct node *start = NULL;
void create(int n) {
    struct node *p;
    p = (struct node*)malloc(sizeof(struct node));
    p->no = n;
    p->next = NULL;
    if(start == NULL) {
        start = p;
    } else {
        struct node *temp;
        temp = start;
        while (temp->next != NULL)
        {
           temp = temp->next; 
        }
        temp->next = p;
        
    }
}
void traverse() {
    struct node *temp;
    temp = start;
    if(start == NULL) {
        printf("Linked List is Empty");
    } else {
        while (temp != NULL)
        {
            printf("\t%d",temp->no);
            temp = temp->next;
        }
        
    }
}
int main() {
    create(100);
    create(200);
    create(300);
    create(400);
    traverse();

}