#include <stdio.h>
#include <stdlib.h>
typedef struct lkList
{
    int info;
    struct lkList *next;
} node;
node *ptr = NULL, *ptr2 = NULL;
void main()
{
    void traverse(node *);
    void reverse(node **);
    int n = 0, data = 0;
    node *head = NULL;
    node *temp = NULL;
    while (1)
    {
        printf("1 for insert element\n");
        printf("2 for exit\n");
        scanf("%d", &n);
        if (n == 1)
        {
            printf("Enter the element\n");
            scanf("%d", &data);
            temp = (node *)(malloc(sizeof(node)));
            temp->info = data;
            temp->next = head;
            head = temp;
            printf("Node Insert Successfully\n");
        }
        if (n == 2)
        {
            break;
        }
    }
    printf("Enter Linked List\n");
    traverse(head);
    printf("\nLinked List in Reverse\n");
    reverse(&head);
    traverse(head);
}
void traverse(node *head)
{
    if (head == NULL)
    {
        printf("No Element Found\n");
    }
    while (head != NULL)
    {
        printf("%d ", head->info);
        head = head->next;
    }
}
void reverse(node **head)
{
    ptr = *head;
    int count = 0;
    int t;
    while (ptr != NULL)
    {
        count++;
        ptr = ptr->next;
    }
    ptr = *head;
    int outerCount = count;
    outerCount /= 2;
    while (outerCount > 0)
    {
        ptr2 = *head;
        count--;
        for (int i = count; i > 0; i--)
        {
            ptr2 = ptr2->next;
        }
        t = ptr->info;
        ptr->info = ptr2->info;
        ptr2->info = t;
        outerCount--;
        ptr = ptr->next;
    }
}
