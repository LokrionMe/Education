
import sys
from typing import Any
import enum


class Color(enum.Enum):
    RED = True
    BLACK = False


class Node:
    def __init__(self, value: Any):
        self.item: Any = value
        self.color: Color = Color.RED
        self.left = None
        self.right = None

class RedBlackTree:
    def __init__(self):
        self.root = None

    def add(self, value: Any):
        self.root = self.__add(self.root, value)
        self.root.color = Color.BLACK

    def __add(self, root: Node, val: Any) -> Node:
        if root is None:
            return Node(val)

        if val < root.item:
            root.left = self.__add(root.left, val)
        elif val > root.item:
            root.right = self.__add(root.right, val)
        else:
            root.item = val

        if self.is_red(root.right) and not self.is_red(root.left):
            root = self.rotate_left(root)
        if self.is_red(root.left) and self.is_red(root.left.left):
            root = self.rotate_right(root)
        if self.is_red(root.left) and self.is_red(root.right):
            self.flip_color(root)

        return root

    @staticmethod
    def is_red(node: Node) -> bool:
        if node is None:
            return False
        return node.color == Color.RED

    @staticmethod
    def flip_color(node: Node):
        node.color = Color.RED
        node.left.color = Color.BLACK
        node.right.color = Color.BLACK

    def rotate_left(self, node: Node) -> Node:
        new_root = node.right
        node.right = new_root.left
        new_root.left = node

        new_root.color = node.color
        node.color = Color.RED
        return new_root

    def rotate_right(self, node: Node) -> Node:
        new_root = node.left
        node.left = new_root.right
        new_root.right = node

        new_root.color = node.color
        node.color = Color.RED
        return new_root
    
    def print_tree(self):
        self.__print_helper(self.root, "", True)

    def __print_helper(self, node:Node, indent, last):
        if node is not None:
            sys.stdout.write(indent)
            if last:
                sys.stdout.write("R----")
                indent += "     "
            else:
                sys.stdout.write("L----")
                indent += "|    "

            s_color = "RED" if node.color == Color.RED else "BLACK"
            print(str(node.item) + "(" + s_color + ")")
            self.__print_helper(node.left, indent, False)
            self.__print_helper(node.right, indent, True)
    

tree = RedBlackTree()
tree.add(21)
tree.add(15)
tree.add(60)
tree.add(64)
tree.add(16)
tree.add(7)
tree.add(18)
tree.add(24)
tree.add(55)
tree.add(79)
tree.add(3)
tree.add(45)
tree.print_tree()
