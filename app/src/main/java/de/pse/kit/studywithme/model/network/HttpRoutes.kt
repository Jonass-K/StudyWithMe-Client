package de.pse.kit.studywithme.model.network

object HttpRoutes {

    private const val BASE_URL = "https://api.test.studywithme.ovh"
    const val USERS = "$BASE_URL/users/"
    const val GROUPS = "$BASE_URL/groups/"
    const val SESSIONS = "$BASE_URL/sessions/"
    const val MAJORS = "$BASE_URL/majors/"
    const val LECTURES = "$BASE_URL/lectures/"
    const val INSTITUTIONS = "$BASE_URL/institutions/"
    const val REPORTS = "$BASE_URL/reports/"
}