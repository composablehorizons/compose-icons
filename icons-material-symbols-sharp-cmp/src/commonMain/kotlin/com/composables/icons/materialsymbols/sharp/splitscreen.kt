package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Splitscreen: ImageVector
    get() {
        if (_Splitscreen != null) return _Splitscreen!!
        
        _Splitscreen = ImageVector.Builder(
            name = "splitscreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 440f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-80f, 480f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Splitscreen!!
    }

private var _Splitscreen: ImageVector? = null

