$("#guardar").click(function () {
    $.ajax({
        url: "/asistencia/save",
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            asisName: $("#Nombre").val(),
            asisApellidos: $("#Apellidos").val(),
            asisCodigo: $("#CodU").val(),
            AsisDNI: $("#DNI").val()            
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