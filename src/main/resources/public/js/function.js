
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
