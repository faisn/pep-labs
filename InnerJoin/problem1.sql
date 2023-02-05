select class.teacher_name, id, student_name from class inner join student on class.id= student.id where class.teacher_name = 'Ms. Lovelace';
