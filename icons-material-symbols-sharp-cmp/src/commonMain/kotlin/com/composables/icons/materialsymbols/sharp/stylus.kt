package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stylus: ImageVector
    get() {
        if (_Stylus != null) return _Stylus!!
        
        _Stylus = ImageVector.Builder(
            name = "stylus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(358f, 800f)
                lineToRelative(-250f, 52f)
                lineToRelative(52f, -250f)
                lineToRelative(198f, 198f)
                close()
                moveToRelative(0f, 0f)
                lineTo(160f, 602f)
                lineToRelative(515f, -515f)
                lineToRelative(198f, 198f)
                lineToRelative(-515f, 515f)
                close()
                moveToRelative(-12f, -101f)
                lineToRelative(414f, -414f)
                lineToRelative(-85f, -85f)
                lineToRelative(-414f, 414f)
                lineToRelative(85f, 85f)
                close()
            }
        }.build()
        
        return _Stylus!!
    }

private var _Stylus: ImageVector? = null

