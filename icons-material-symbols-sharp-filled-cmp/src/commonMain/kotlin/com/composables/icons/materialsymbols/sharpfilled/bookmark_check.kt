package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bookmark_check: ImageVector
    get() {
        if (_Bookmark_check != null) return _Bookmark_check!!
        
        _Bookmark_check = ImageVector.Builder(
            name = "bookmark_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 560f)
                lineToRelative(198f, -198f)
                lineToRelative(-57f, -56f)
                lineToRelative(-141f, 141f)
                lineToRelative(-57f, -57f)
                lineToRelative(-57f, 57f)
                lineToRelative(114f, 113f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(720f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
            }
        }.build()
        
        return _Bookmark_check!!
    }

private var _Bookmark_check: ImageVector? = null

