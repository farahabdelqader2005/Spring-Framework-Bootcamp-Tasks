package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(
        name = "course"
)
public class Course {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private Long id;
    @Column(
            name = "title"
    )
    private String title;
    @ManyToMany
    @JoinTable(
            name = "course_student",
            joinColumns = {@JoinColumn(
                    name = "course_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "student_id"
            )}
    )
    private List<Student> studentList;

    public Course(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public Course() {
    }
}
