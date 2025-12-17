package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_diamond: ImageVector
    get() {
        if (_Add_diamond != null) return _Add_diamond!!
        
        _Add_diamond = ImageVector.Builder(
            name = "add_diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(41f, 274f)
                lineTo(49f, 480f)
                lineToRelative(432f, -433f)
                lineToRelative(430f, 433f)
                lineTo(481f, 914f)
                close()
                moveToRelative(-1f, -114f)
                lineToRelative(319f, -320f)
                lineToRelative(-319f, -320f)
                lineToRelative(-319f, 320f)
                lineToRelative(319f, 320f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Add_diamond!!
    }

private var _Add_diamond: ImageVector? = null

