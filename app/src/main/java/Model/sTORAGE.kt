package Model


private var listStudent = arrayListOf<uSER>()
class sTORAGE {

    fun appendStudent(student: uSER){
        listStudent.add(student)
        println(listStudent.size)
    }
    fun returnStudent():ArrayList<uSER>{
        return listStudent
    }

    fun deleteStudent(student: uSER){
        listStudent.remove(student)
    }
}