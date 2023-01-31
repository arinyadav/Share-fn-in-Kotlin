private fun shareImage(result:String) {
MediaScannerConnection.scanFile(this,arrayOf(result),null) {
path, uri ->
val shareIntent = Intent()
shareIntent.action = Intent.ACTION_SEND
shareIntent.putExtra(Intent.EXTRA_STREAM, uri)
shareIntent.type = "image/png"
startActivity(Intent.createChooser(shareIntent,"Share"))
}
}
