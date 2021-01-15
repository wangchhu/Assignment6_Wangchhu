package fragments

import Adapter.StudentAdapter
import Model.sTORAGE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6_wangchhu.R

class hOME : Fragment() {
    private lateinit var  studentRecyclerView : RecyclerView
    private var storage = sTORAGE()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_h_o_m_e,container,false)
        return  view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        studentRecyclerView= view!!.findViewById(R.id.studentRecyclerView)
        studentRecyclerView.layoutManager = LinearLayoutManager(context)

        getData()
    }

    private fun getData(){
        val arr = storage.returnStudent()

        val adapter = StudentAdapter(context, arr)
        studentRecyclerView.adapter = adapter
    }
}