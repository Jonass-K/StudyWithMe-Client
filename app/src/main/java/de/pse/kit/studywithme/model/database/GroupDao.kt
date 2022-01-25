package de.pse.kit.studywithme.model.database

import androidx.room.*
import de.pse.kit.studywithme.model.data.Group

@Dao
interface GroupDao {
    @Query("SELECT * FROM `group`")
    fun getGroups()

    @Query("SELECT * FROM `group` WHERE group_ID LIKE :groupID" )
    fun getGroup(groupID: Int)

    @Insert
    fun saveGroup(group: Group) {}

    @Update
    fun editGroup(group: Group) {}

    @Delete
    fun removeGroup(group: Group){}
}