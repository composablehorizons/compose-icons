package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Close_fullscreen: ImageVector
    get() {
        if (_Close_fullscreen != null) return _Close_fullscreen!!
        
        _Close_fullscreen = ImageVector.Builder(
            name = "close_fullscreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(264f, -264f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-184f)
                lineTo(136f, 880f)
                close()
                moveToRelative(344f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(264f, -264f)
                lineToRelative(56f, 56f)
                lineToRelative(-264f, 264f)
                horizontalLineToRelative(184f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Close_fullscreen!!
    }

private var _Close_fullscreen: ImageVector? = null

