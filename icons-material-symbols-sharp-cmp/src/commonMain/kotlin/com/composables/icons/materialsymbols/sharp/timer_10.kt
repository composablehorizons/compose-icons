package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Timer_10: ImageVector
    get() {
        if (_Timer_10 != null) return _Timer_10!!
        
        _Timer_10 = ImageVector.Builder(
            name = "timer_10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-320f)
                horizontalLineTo(560f)
                verticalLineToRelative(320f)
                close()
                moveTo(440f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(560f)
                horizontalLineTo(440f)
                close()
                moveToRelative(-200f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(560f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Timer_10!!
    }

private var _Timer_10: ImageVector? = null

