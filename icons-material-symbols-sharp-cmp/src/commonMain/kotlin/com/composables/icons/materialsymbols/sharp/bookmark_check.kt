package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bookmark_check: ImageVector
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
                moveToRelative(80f, -122f)
                lineToRelative(200f, -86f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-518f)
                horizontalLineTo(280f)
                verticalLineToRelative(518f)
                close()
                moveToRelative(0f, -518f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Bookmark_check!!
    }

private var _Bookmark_check: ImageVector? = null

