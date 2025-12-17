package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Download_done: ImageVector
    get() {
        if (_Download_done != null) return _Download_done!!
        
        _Download_done = ImageVector.Builder(
            name = "download_done",
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
        
        return _Download_done!!
    }

private var _Download_done: ImageVector? = null

