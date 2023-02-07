select id, student_name from student inner join class on student.class_title = class.class_title where class.teacher_name = student.student_name;
