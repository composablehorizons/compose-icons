package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Timer_2: ImageVector
    get() {
        if (_Timer_2 != null) return _Timer_2!!
        
        _Timer_2 = ImageVector.Builder(
            name = "timer_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(-340f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(320f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(340f)
                horizontalLineTo(440f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Timer_2!!
    }

private var _Timer_2: ImageVector? = null

