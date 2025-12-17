package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Timer_3: ImageVector
    get() {
        if (_Timer_3 != null) return _Timer_3!!
        
        _Timer_3 = ImageVector.Builder(
            name = "timer_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(360f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-100f)
                horizontalLineTo(320f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(220f)
                lineToRelative(-60f, 60f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(220f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Timer_3!!
    }

private var _Timer_3: ImageVector? = null

