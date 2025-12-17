package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_download_done: ImageVector
    get() {
        if (_File_download_done != null) return _File_download_done!!
        
        _File_download_done = ImageVector.Builder(
            name = "file_download_done",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(382f, 640f)
                lineTo(155f, 413f)
                lineToRelative(57f, -57f)
                lineToRelative(170f, 170f)
                lineToRelative(366f, -366f)
                lineToRelative(57f, 57f)
                lineToRelative(-423f, 423f)
                close()
                moveTo(200f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _File_download_done!!
    }

private var _File_download_done: ImageVector? = null

