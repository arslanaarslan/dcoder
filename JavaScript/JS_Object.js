function Dog(name) {
 this.name = name;
 this.bark = function() {
  console.log("Woof!");
 };
}
var dog = new Dog("Baxter");
console.log(dog.name);