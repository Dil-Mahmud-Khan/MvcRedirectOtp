<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<style>
    .btn {
        margin-left: 20px;
        background-color: rgb(56, 58, 58);
        padding: 10px;
        border: none;
        border-radius: 5px;
        cursor: pointer;

    }
.cap{
	margin-left:700px;
}
    .div {
        margin-top: 200px;
        text-align: center;
    }

    div {
        margin: 10px;
    }
</style>

<body>

<form action="submitpage2" method="post">
<button class="btn">Home</button>
    <div class="div">
        <div>
            <label class="label">Enter Your Email/Mobile:</label>
            <input type="text" name="email" id="">
            <br>
        </div>

        <div>
            <img src="" alt="">
            <label class="label">Complete the Captcha</label>
           <div class="form-group">
                <label for="captcha">CAPTCHA:</label>
                <div class="g-recaptcha cap" data-sitekey="6LfXig8nAAAAAPUu6ziqEG3al3mjL6di9rwcOi6h"></div>
            </div>
            <br>
        </div>
        <br>
        <button class="btn" type="submit">Submit</button>
    </div>
</form>
    
</body>
</html>