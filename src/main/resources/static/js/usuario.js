
$(document).ready(function () {
    listar();
});

function listar() {
    $.ajax({
        url: "/usuario/all",
        type: 'GET',
        success: function (x) {
            $("#table tbody tr").remove();
            x.forEach((item, index, array) => {
                $("#table").append(
                        "<tr>\n\
                            <td>" + (index + 1) + "</td>\n\
                            <td>" + item.userName + "</td>\n\
                            <td class = 'hidetext'>" + item.userClave + "</td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='editar(" + item.userId + ")'><i class='fa-solid fa-pen-to-square' style='color:#ffc107'></i></a>\n\
                            </td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='eliminar(" + item.userId + ")'><i class='fa-solid fa-trash-can' style='color:#ffc107'></i></a>\n\
                            </td>\n\
                        </tr>");

            });
        }
    });
}

function editar(id) {
    $.ajax({
        url: "/usuario/" + id,
        type: 'GET',
        success: function (w) {
            $("#edit_userId").val(w.userId);
            $("#edit_nombre").val(w.userName);
            $("#edit_Password").val(w.userClave);
        }
    });
    $("#editarModal").modal('show');
}

function eliminar(id) {
    bootbox.confirm({
        message: "¿Está seguro que desea eliminar el registro?",
        closeButton: false,
        title: "Eliminar",
        buttons: {
            confirm: {
                label: 'Eliminar',
                className: 'btn btn-outline-dark'
            },
            cancel: {
                label: 'Cancelar',
                className: 'btn btn-outline-dangers'
            }
        },
        callback: function (result) {
            if (result) {
                $.ajax({
                    url: "/usuario/" + id,
                    type: 'DELETE',
                    success: function (w) {
                        var dialog = bootbox.dialog({
                            message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Eliminado Correctamente.</p>',
                            closeButton: false
                        });
                        setTimeout(function () {
                            dialog.modal('hide');
                        }, 1500);
                        listar();
                    }
                });
            } else {
                var dialog = bootbox.dialog({
                    message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro no Eliminado.</p>',
                    closeButton: false
                });
                setTimeout(function () {
                    dialog.modal('hide');
                }, 1500);
            }
        }
    });
}

$("#guardar").click(function () {
    $.ajax({
        url: "/usuario/save",
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            userName: $("#nombre").val(),
            userClave: $("#password").val()
            
        }),
        cache: false,
        success: function (w) {
            var dialog = bootbox.dialog({
                message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Guardado Correctamente.</p>',
                closeButton: false
            });
            setTimeout(function () {
                dialog.modal('hide');
            }, 1500);
            limpiar();
            listar();
        }
    });
    $("#exampleModal").modal('hide');
});

function limpiar() {
    $("#nombre").val('');
    $("#password").val('');
}

$("#modificar").click(function () {
    $.ajax({
        url: "/usuario/update",
        type: 'PUT',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            userId: $("#edit_userId").val(),
            userName: $("#edit_nombre").val(),
            userClave: $("#edit_Password").val()
        }),
        cache: false,
        success: function (w) {
            var dialog = bootbox.dialog({
                message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Modificado Correctamente.</p>',
                closeButton: false
            });
            setTimeout(function () {
                dialog.modal('hide');
            }, 1500);
            listar();
        }
    });
    $("#editarModal").modal('hide');
});