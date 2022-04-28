#include <stdio.h>
#include <stdlib.h>
typedef struct lkList
{
    int info;
    struct lkList *next;
} node;
void main()
{
    node *head = NULL, *temp = NULL;
    int n = 0, data = 0;
    void traverse(node *);
    void middle(node *);
    while (1)
    {
        printf("\n1for insert and 2 for exit\n");
        scanf("%d", &n);
        if (n == 1)
        {
            temp = (node *)(malloc(sizeof(node)));
            printf("Enter the element you want to insert\n");
            scanf("%d", &data);
            temp->info = data;
            temp->next = head;
            head = temp;
            printf("Node Insert Successfully\n");
        }
        else if (n == 2)
        {
            break;
        }
    }
    printf("Enter Linked List is\n");
    traverse(head);
    middle(head);
}
void traverse(node *head)
{
    if (head == NULL)
    {
        printf("No Data Found\n");
    }
    while (head != NULL)
    {
        printf("%d ", head->info);
        head = head->next;
    }
}
void middle(node *ptr)
{
    node *ptr2 = ptr;
    while ((ptr->next) != NULL)
    {
        ptr2 = ptr2->next;
        if ((ptr->next)->next == NULL)
        {
            break;
        }
        ptr = (ptr->next)->next;
    }
    printf("\nMiddle Element of Link List is %d", ptr2->info);
}