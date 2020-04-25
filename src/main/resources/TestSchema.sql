CREATE TABLE IF NOT EXISTS UserList(
	uId VARCHAR(50) PRIMARY KEY,
	userId VARCHAR(50),
	userName VARCHAR(50),
	userMailAddress VARCHAR(50),
	userDescription VARCHAR(200),
	userImage VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS SettingsList(
	SettingId VARCHAR(50) PRIMARY KEY,
	uId VARCHAR(50),
	userEnabled VARCHAR(50),
	userVisibled VARCHAR(50),
	designSettings VARCHAR(50)
);