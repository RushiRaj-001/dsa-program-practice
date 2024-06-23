const person1 = {
    name: "rushi",
    age: 21,
};

const person2 = Object.create(person1);

Object.getPrototypeOf(person2);

person2.age
console.log(person2.age)