<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>

   $(function(){
    ocr2_form.init();
   });

</script>
<div class="col-sm-8  text-left ">
    <div class="container">
            <div class="col-sm-6  text-left ">
                <h1>OCR2</h1>
                <h2>${result.menu1}</h2>
                <h2>${result.menu2}</h2>
                <h2>${result.menu3}</h2>
                <h2>${result.menu4}</h2>
                <h2>${result.menu5}</h2>
                <form action="/ocr2impl" method="post" enctype="multipart/form-data" id="ocr2_form" class="form-horizontal well">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="img">Image:</label>
                        <div class="col-sm-10">
                            <input type="file" name="img" class="form-control" id="img" placeholder="Enter id">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button id="cfr2_btn" type="submit" class="btn btn-default">SEND</button>
                        </div>
                    </div>
                </form>

            </div>
    </div>
</div>