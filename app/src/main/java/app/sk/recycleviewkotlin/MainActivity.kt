package app.sk.recycleviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val studentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindStudentData()
        RvStudentsList.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val studentAdapter = StudentAdapter(studentList)
        RvStudentsList.adapter = studentAdapter
    }

    private fun bindStudentData() {
        studentList.add(Student("Student 1", "Male", 10, "Navsari"))
        studentList.add(Student("Student 2", "Male", 11, "Surat"))
        studentList.add(Student("Student 3", "Female", 12, "Bilimora"))
        studentList.add(Student("Student 4", "Male", 9, "Valsad"))
        studentList.add(Student("Student 5", "Male", 10, "Navsari"))
        studentList.add(Student("Student 6", "Female", 12, "Gandevi"))
        studentList.add(Student("Student 7", "Male", 10, "Navsari"))
        studentList.add(Student("Student 8", "Male", 11, "Surat"))
        studentList.add(Student("Student 9", "Female", 12, "Bilimora"))
        studentList.add(Student("Student 10", "Male", 9, "Valsad"))
        studentList.add(Student("Student 11", "Male", 10, "Navsari"))
        studentList.add(Student("Student 12", "Female", 12, "Gandevi"))
    }
}
