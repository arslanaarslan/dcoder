function Person(name, age, height) {
 this.name = name;
 this.age = age;
 this.height = height;
 this.speak = function() {
  console.log("Hi, I'm " + this.name + "!");
 }
}
var p1 = new Person("Robin", 42, 1.72);
console.log(p1.name); 