select s.*,c.* from student s left join student_course sc on s.sid = sc.sid left join course c on sc.cid = c.cid