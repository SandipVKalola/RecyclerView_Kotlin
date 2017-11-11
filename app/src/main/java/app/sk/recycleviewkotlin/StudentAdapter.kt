package app.sk.recycleviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.student_list_row.view.*

/**
 * Created by Sandip on 11/12/2017.
 */
class StudentAdapter(private val studentList: ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(studentList[position])
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_list_row, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(student: Student) {
            itemView.TxtName.text = student.name
            itemView.TxtStd.text = "Std: ".plus(student.std.toString())
        }
    }
}