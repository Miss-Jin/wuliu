function abc() {
    var options = $(".select1 option:selected");
    var dep_name = options[0].innerHTML;
    $.ajax({
        url: "/selectFpartitionByDep",
        type: "GET",
        dataType:"json",
        data: {"dep_name":dep_name},
        success: function (data) {
            $(".select2").empty()
            //接收ajax请求返回的数据，更新到分区列表
            for(i=0;i<data.length;i++)
            {
                var fpartitionName = data[i].fpartitionName;
                var option = $('<option></option>');
                var o = option[0]
                o.innerHTML = fpartitionName
                o.setAttribute("value",data[i].fpartitionId)
                $(".select2").append(o)
            }
        },
        error: function (e){
            alert(e+"111")
        }
    })
}
