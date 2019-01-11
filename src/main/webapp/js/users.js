function checkLoginRegistration() {
  var userLogin = $('#userLogin').val();
  var userName = $('#userNameForm').val();
  var userSurname = $('#userSurnameForm').val();
  var password = $('#password').val();
  var password2 = $('#password2').val();

  if (userLogin == "" || userName == "" || userSurname == "" || password == "" || password2 == "") {
    alert("Все поля формы должны быть заполнены!");
  } else {
    if (password != password2) {
      alert('Пароль и подтверждение пароля не совпадают!');
    } else {
      if (userLogin == "admin") {
        alert('Логин "admin" уже занят')
      } else {
        alert('Логин свободен. А вот логин "admin" уже занят');
      }
    }
  }
};
