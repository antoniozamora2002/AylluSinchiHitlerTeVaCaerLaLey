function VerificarUsuario(){
    var txtUsuario = document.getElementById("txtUsuario").value;
    var txtPassword = document.getElementById("txtPassword").value;
    
    if (txtUsuario == "admin" && txtPassword == "admin") {
        console.log(txtUsuario + txtPassword);
        window.location.href = "/admin";
    } else {
        console.log("ta mal xd ");
        console.log(txtUsuario + txtPassword);
    }
};