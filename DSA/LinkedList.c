// Write a program to implement a link list.
// WAP to Add a node add the begging in the Linked list.
// WAP to count the number of node in given single Linked List.
// WAP to insert a node at any location in a single Linked List.
// WAP to delete a node from begging in a single Linked List.
// WAP a program to delete an element from the Last Position in Linked List.
// WAP a program to delete an element from the Any Position in Linked List.
#include <stdio.h>
#include <malloc.h>
struct node {
    int no;
    struct node *next;
};
struct node *start;
void create(int n) {
   struct node *p, *temp;
   p = (struct node*)malloc(sizeof(struct node));
   p->no = n;
   p->next = NULL;
   if(start == NULL) {
       start = p;
   } else {
      temp = start;
      while(temp->next != NULL) {
          temp = temp->next;
      }
      temp->next = p;
   }
}
void traverse() {
    struct node *temp;
    if(start == NULL) {
        printf("\n Linked list is Empty");
    } else {
        temp = start;
        while(temp != NULL) {
          printf("\t%d",temp->no);
          temp = temp->next;
        }
    }
}
void insertAtBegining(int n) {
    struct node *p;
    p = (struct node*)malloc(sizeof(struct node));
    p->no = n;
    p->next = start;
    start = p;
}
int countNode() {
    int count = 0;
    struct node *temp;
    temp = start;
    while(temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}
void insertAtAnyLocation() {
    struct node *p, *temp;
    int location,i, totalNode;
    printf("\n Enter the location : ");
    scanf("%d",&location);
    if(location == 1) {
       insertAtBegining(100); 
    }
    totalNode = countNode();
    if(location == totalNode) {
        create(100);
    } else {
        temp = start;
        for(i=1; i<=location-2; i++) {
            temp = temp->next;
        }
        p = (struct node*)malloc(sizeof(struct node));
        p->no = 100;
        p->next = temp->next;
        temp->next = p;
    }
}
void deleteAtBegining(){
    struct node *temp;
    if(start == NULL) {
        printf("Linked list is Empty");
    } else {
        printf("\nDeleted Item = %d",start->no);
        temp = start;
        start = start->next;
        free(temp);
    }
}
void deleteAtLastPosition() {
    struct node *temp, *temp1;
     if(start == NULL) {
        printf("Linked list is Empty");
    } else {
        temp = start;
        temp1 = start->next;
        while(temp1->next != NULL) {
            temp1 = temp1->next;
            temp = temp->next;
        }
        printf("\nDeleted Last Position Item = %d",temp1->no);
        temp->next = NULL;
        free(temp1);
    }
}
void deleteAtAnyPosition() {
    struct node *temp, *p;
    int location, i, totalNode;
    printf("\nEnter the location: ");
    scanf("%d", &location);
    if (start == NULL) {
        printf("Linked List is Empty");
    }
    totalNode = countNode();
    if (location < 1 || location > totalNode) {
        printf("Invalid Location");
    }
    if (location == 1) {
        temp = start;
        start = start->next;
        printf("Deleted Item = %d", temp->no);
        free(temp);
    }
    temp = start;
    for (i = 1; i < location - 1; i++) {
        temp = temp->next;
    }
    p = temp->next;
    temp->next = p->next;
    printf("Deleted Item = %d", p->no);
    free(p);
}
int main()
{
    start = NULL;
   int choice, no;
   char ch;
   do {
       printf("\nPress 1 For Create the Linked List.");
       printf("\nPress 2 For Traverse the Linked List.");
       printf("\nPress 3 For InsertAtBegining in the Linked List.");
       printf("\nPress 4 For InsertAtAnyLocation in the Linked List.");
       printf("\nPress 5 For DeleteAtBegining in the Linked List.");
       printf("\nPress 6 For DeleteAtLastPosition in the Linked List.");
       printf("\nPress 7 For DeleteAtAnyPosition in the Linked List.");
       printf("\nPress 8 For CountNode in the Linked List.");
       printf("\nEnter Your Choice...");
       scanf("%d", &choice);
       switch(choice) {
           case 1:
               printf("Enter the no Insert into the Linked list: ");
               scanf("%d", &no);
               create(no);
               break;
           case 2:
               traverse();
               break;
           case 3:
               printf("Enter the no Insert At Begining into the Linked list: ");
               scanf("%d", &no);
               insertAtBegining(no);
               break;
            case 4:
               printf("Enter the no Insert At Any Location into the Linked list: ");
               scanf("%d", &no);
               insertAtAnyLocation(no);
               break;   
            case 5:
               printf("Enter the no Delete At Begining into the Linked list: ");
               scanf("%d", &no);
               deleteAtBegining();
               break;
            case 6:
               printf("Enter the no Delete At Last Position into the Linked list: ");
               scanf("%d", &no);
               deleteAtLastPosition();
               break;
            case 7:
               printf("Enter the Location to Delete At Any Position into the Linked list: ");
               scanf("%d", &no);
               deleteAtAnyPosition();
               break;
            case 8:
               printf("Count the Node into the Linked list: ");
               scanf("%d", &no);
               countNode();
               break;            
           default:
                printf("\nPlease Enter the Correct Options...");
       }
       printf("\nDo You Want To Continue(Yes/No)...");
       scanf(" %c",&ch);
   } while(ch == 'y' || ch == 'Y');
    
    return 0;
}