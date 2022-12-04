var student1 = {
    "sid":12345,
    "sname":"Vikram",
    "average":95.5,
    "section":'A',
    "address":{
        "doorno":105,
        "street":"East street",
        "city": "Chennai",
        "state":"TN",
        "country":"India"
    },
    "courses":[
        {
            "course_id":5005,
            "course_name":"Science",
            "dept":"Science"
        }, 
        {
            "course_id":4004,
            "course_name":"Social Science",
            "dept":"Social studies"
        }, 
        {
            "course_id":1001,
            "course_name":"Algebra",
            "dept":"Mathematics"
        }, 
        {
            "course_id":2002,
            "course_name":"Python Programming",
            "dept":"Computer Science"
        }
    ]
    // "courses":["Science", "Social Science", "Mathematics", "Python Programming"]
}

// console.log(student1);
// console.log(student1.sid);
// console.log(student1.sname);
console.log(student1.address);
// console.log(student1.address.street);
// console.log(student1["address"]["doorno"]);
console.log(student1.courses[0]);
console.log(student1.courses[(student1.courses.length-2) ]);
console.log(student1.courses[3].course_name);