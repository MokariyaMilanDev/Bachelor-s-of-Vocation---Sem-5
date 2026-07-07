# Class & Object

## Class

**Class:** A _class_ is a user-defined `blueprint` or `template` used to create **objects**

##### Syntax

```java
class <ClasName> {
   // Body
}
```

---

### Constructore

**Constructore:** A constructor in Java is a special block of code similar to a method that is `automatically called` when a `new object` of a class is created

> ? constructore overloading: **Constructor overloading in Java is a technique that allows a class to have more than one constructor with the same name but different parameter lists**

```java
class <ClasName> {
   <ClassName>(){
      // Body
   }
}
```

#### Types

##### Default

##### Parameterized

---

## Object

**Object:** An _object_ is an `instance` of a **class**

##### Syntax

```java
<ClassName> <ObjectName> = new <ClassName>();
```

## Inheritance

- an class dirived another class
- `extend` keyword is used for inheritance

### Types

**Single Level**

- Parent to Child

##### Example

```java
class Parent{
   // Body
}

class Chile extends Parent{
   // Body
}
```

**Multi Level**

- Parent -> Child -> GrandChild

##### Example

```java
class Parent{
   // Body
}

class Chile extends Parent{
   // Body
}

class GrandChile extends Child{
   // Body
}
```
