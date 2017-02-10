var options = {
};
fileSystem.open("../data/miserables.json", options, function (res, res_err) {
  if (res_err == null) {
    var file = res;
  } else {
    // Something went wrong!
  }
});