class Node:
    def __init__(self, value):
        self.item = value
        self.prev = None
        self.next = None

    def __str__(self) -> str:
        return (f"item - {self.item}")


class double_linked_list:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_value(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            if self.tail is None:
                self.tail = new_node
                self.head.next = new_node
                self.tail.prev = self.head
            else:
                self.tail.next = new_node
                new_node.prev = self.tail
                self.tail = new_node

    def insert_before_value(self, value, find_value):
        new_node = Node(value)
        node = self.head
        while node is not None:
            if node.item is find_value:
                new_node.prev = node.prev
                new_node.next = node
                node.prev.next = new_node
                node.prev = new_node
                break
            else:
                node = node.next

    def reverse_double_list(self):
        node = self.head
        while node is not None:
            node.next, node.prev = node.prev, node.next
            node = node.prev
        self.head, self.tail = self.tail, self.head

    def __str__(self):
        if self.head is None:
            return "List is empty"
        else:
            node = self.head
            string = ""
            while node is not None:
                string += str(node) + ", "
                node = node.next
            return string


linked_list = double_linked_list()
print(linked_list)
linked_list.insert_value(5)
print(linked_list)
linked_list.insert_value(7)
print(linked_list)
linked_list.insert_value(6)
print(linked_list)
linked_list.insert_before_value(8,7)
print(linked_list)
linked_list.reverse_double_list()
print(linked_list)