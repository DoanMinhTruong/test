package iuh.doanminhtruong.ms19519011.a19519011_doanminhtruong_ad_todoapp

interface UpdateAndDelete{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)
}