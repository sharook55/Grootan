<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>NEW USER</title>
        <link rel="icon" href="myicon.png" type="image/x-icon">
        <link rel="stylesheet" href="style.css">
    </head>
    <style>

        h1 {
            text-align: center;
        }
        #outer {
            border: 1px solid black;
            background-color: aliceblue;
            display: flex;
            flex-wrap: nowrap;
        }

        #logid {
            border: 1px solid black;
            margin: 0.5%;
            padding: 1%;
            flex: 50%;
        }

        #outer-right {
            border: 1px solid black;
            background-color: darkcyan;
            margin: 0.5%;
        }

        #form {
            border: 1px solid black;
            margin: 2%;
            padding: 2%;
            background-color: white;
        }

        #pd, #cd, #ld {
            padding: 2% 8%;
        }

        #s {
            width: 30%;
            margin: 1% 36%;
        }
        
        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=password], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: slategray;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }
    </style>
    <div id="outer">
        <div id="logid">
        </div>
        <div id="outer-right">
            <div id="form">
                <h1>CREATE NEW USER</h1>
                <form action="create" method="post"><br>
                    <fieldset id="pd">
                        <legend>Personal Details</legend><br>
                        FIRST NAME <input type="text" name="fn" required>
                        LAST NAME <input type="text" name="ln" required>
                    </fieldset><br>
                    <fieldset id="cd">
                        <legend>Contact Details</legend><br>
                        EMAIL <input type="text" name="email" required>
                        PHONE NUMBER <input type="text" name="pno" required>
                    </fieldset><br>
                    <fieldset id="ld">
                        <legend>Login Details</legend><br>
                        USERNAME <input type="text" name="username" required>
                        PASSWORD <input type="password" name="pass" required>
                    </fieldset><br>
                    <input type="submit" value="SUBMIT" id="s"><br>
                </form>
            </div>
        </div>
    </div>
</html>