package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Splitscreen_bottom: ImageVector
    get() {
        if (_Splitscreen_bottom != null) return _Splitscreen_bottom!!
        
        _Splitscreen_bottom = ImageVector.Builder(
            name = "splitscreen_bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -240f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Splitscreen_bottom!!
    }

private var _Splitscreen_bottom: ImageVector? = null

