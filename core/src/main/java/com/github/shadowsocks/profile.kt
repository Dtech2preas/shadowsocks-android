fun initDefaultProfiles() {
    val profiles = Gson().fromJson(readAssets("initprofiles.json"), Array<Profile>::class.java)
    profiles.forEach { it.save() }
}