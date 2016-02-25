function validate_email(field, alerttxt)
{
apos=value.indexOf("@");
dotpos=value.lastIndexOf(".");
if (apos<1||dotpos-apos<2)
  {alert(alerttxt);return false};
else {return true};
}

function validate_form(thisform)
{
if (validate_email(email,"Please enter a valid e-mail address!")===false)
  {email.focus();return false};
}

function check(){
    if(pw1.value != pw2.value){
      alert("Please enter the same password!")
      pw1.value="";
      pw2.value="";
    }
}

var images = ["img1.jpg","img2.jpg","img3.jpg","img4.jpg","img5.jpg"];
var caption = ["BMW X3","Jeep Cherokee","Mercedes C300","Ford Mustang","Nissan Rogue"];
var imageNumber = 0;
var imageLength = images.length-1;

function changeImage(x){
  imageNumber += x;
  if(imageNumber > imageLength){
    imageNumber = 0;
  }
  if(imageNumber < 0){
    imageNumber = imageLength;
  }
  document.getElementById("img").src=images[imageNumber];
  document.getElementById("caption").innerHTML = caption[imageNumber];

  return false;
}
