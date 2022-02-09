CREATE TABLE Tbl_Profiles(
  idProfile numeric PRIMARY KEY AUTO_INCREMENT,
  Profile varchar(30)
);

CREATE TABLE Tbl_Users (
  idUser numeric PRIMARY KEY AUTO_INCREMENT,
  UserName varchar(30) NOT NULL,
  Password varchar(30) NOT NULL,
  idProfile numeric references Tbl_Profiles(idProfile) NOT NULL,
  idEmployee numeric NOT NULL,
  Status numeric NOT NULL,
  CreateDate DATE NOT NULL,
  UpdateDate DATE,
  Login numeric
);
