$(function(){

    let header = $("#header");
    header.addClass("fixed");

    $(window).scroll(function() {
        if($(this).scrollTop() != 0) {
            $('#toTop').fadeIn();
        } else {
            $('#toTop').fadeOut();
        }
    });
    
    $('#toTop').click(function() {
        $('body,html').animate({scrollTop:0});
    });

    let nav = $("#nav");
    let navToggle = $("#navToggle");
    navToggle.on("click", function(event) {
        event.preventDefault();
        nav.toggleClass("show");
    });
});