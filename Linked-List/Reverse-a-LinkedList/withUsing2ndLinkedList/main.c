#include <stdio.h>
#include <stdlib.h>
typedef struct lkList
{
    int info;
    struct lkList *next;
} node;
node *temp;
void main()
{
    node *head = NULL;
    node *rev = NULL;
    int n = 0, data = 0;
    void traverse(node *);
    void reverse(node **, node *);
    while (1)
    {

        printf("\n1 for insert\n");
        printf("2 for exit\n");
        scanf("%d", &n);
        if (n == 1)
        {
            printf("Enter the Element you want to insert\n");
            scanf("%d", &data);
            temp = (node *)(malloc(sizeof(node)));
            temp->info = data;
            temp->next = head;
            head = temp;
            printf("node Insert Successfully");
        }
        else if (n == 2)
        {
            break;
        }
    }
    printf("Before Reverse\n");
    traverse(head);
    printf("\nAfter Reverse\n");
    reverse(&rev, head);
    traverse(rev);
}
void traverse(node *head)
{
    if (head == NULL)
    {
        printf("No Data Found");
        return;
    }
    while (head != NULL)
    {
        printf("%d ", head->info);
        head = head->next;
    }
}
void reverse(node **rev, node *head)
{
    if (head == NULL)
    {
        printf("No Element Found can't reverse\n");
        return;
    }
    while (head != NULL)
    {
        temp = (node *)(malloc(sizeof(node)));
        temp->info = head->info;
        temp->next = *rev;
        *rev = temp;
        head = head->next;
    }
}