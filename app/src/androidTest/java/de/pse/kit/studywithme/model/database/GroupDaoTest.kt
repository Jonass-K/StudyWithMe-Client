package de.pse.kit.studywithme.model.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import de.pse.kit.studywithme.model.data.Group
import de.pse.kit.studywithme.model.data.SessionFrequency
import de.pse.kit.studywithme.model.data.SessionType
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class GroupDaoTest {
/*
    private lateinit var groupDao: GroupDao
    private lateinit var db: AppDatabase
    private lateinit var group0: Group
    private lateinit var group1: Group

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java
        ).build()
        groupDao = db.groupDao()
        group0 = Group(
            groupID = 0,
            name = "Die wilden Coder",
            lectureID = 0,
            lecture = "Programmieren",
            description = "Alles ist gut solange du wild bist.",
            sessionFrequency = SessionFrequency.WEEKLY,
            sessionType = SessionType.HYBRID,
            lectureChapter = 8,
            exercise = 8,
            groupAdminID = 0,
            participantsSum = 5,
        )
        group1 = Group(
            groupID = 1,
            name = "Die lahmen Coder",
            lectureID = 0,
            lecture = "Programmieren",
            description = "Cool bleiben.",
            sessionFrequency = SessionFrequency.MONTHLY,
            sessionType = SessionType.ONLINE,
            lectureChapter = null,
            exercise = null,
            groupAdminID = 1,
            participantsSum = 1,
        )
    }

    @Test
    @Throws(Exception::class)
    fun saveAndGetGroupById() {
        groupDao.saveGroup(group0)
        groupDao.saveGroup(group1)
        assertThat(group0).isEqualTo(groupDao.getGroup(0))
    }

    @Test
    @Throws(Exception::class)
    fun saveAndGetGroups() {
        groupDao.saveGroup(group0)
        groupDao.saveGroup(group1)
        val groupList = groupDao.getGroups()
        assertThat(groupList.contains(group0))
        assertThat(groupList.contains(group1))
    }

    @Test
    @Throws(Exception::class)
    fun saveAndRemoveGroup() {
        groupDao.saveGroup(group0)
        groupDao.saveGroup(group1)
        groupDao.removeGroup(group0)
        val groupList = groupDao.getGroups()
        assertThat(groupList).doesNotContain(group0)
        assertThat(groupList).contains(group1)
    }

    @Test
    @Throws(Exception::class)
    fun saveAndEditGroup() {
        val groupToBeEdited = Group(
            groupID = 0,
            name = "Die wilden Coder",
            lectureID = 0,
            lecture = "Programmieren",
            description = "",
            sessionFrequency = SessionFrequency.WEEKLY,
            sessionType = SessionType.HYBRID,
            lectureChapter = 8,
            exercise = 8,
            groupAdminID = 0,
            participantsSum = 5,
        )
        groupDao.saveGroup(groupToBeEdited)
        val editedGroup = Group(
            groupID = 0,
            name = "Die wilden Coder",
            lectureID = 0,
            lecture = "Programmieren",
            description = "Alles ist gut solange du wild bist.",
            sessionFrequency = SessionFrequency.WEEKLY,
            sessionType = SessionType.HYBRID,
            lectureChapter = 8,
            exercise = 8,
            groupAdminID = 0,
            participantsSum = 5,
        )
        groupDao.editGroup(group0)
        assertThat(groupDao.getGroup(0)).isEqualTo(editedGroup)
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

 */
}