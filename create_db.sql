create table tbl_student (student_id int primary key, student_name varchar(50), email varchar(50),dob date, grade char);
create table tbl_teacher (teacher_id int primary key, teacher_name varchar(50), email varchar(50), dob date, faculty varchar(30));
create table tbl_subject (subject_id int primary key, subject_name varchar(50), description varchar(250));
create table tbl_class ( class_id int primary key, subject_id int, teacher_id int,room_num int, class_time time, FOREIGN KEY (subject_id) REFERENCES tbl_subject(subject_id),
     FOREIGN KEY (teacher_id) REFERENCES tbl_teacher(teacher_id));
create table tbl_grades (student_id int, class_id int, final_grade float,FOREIGN KEY (student_id) REFERENCES tbl_student(student_id), FOREIGN KEY (class_id) REFERENCES tbl_class(class_id));
