package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Timer_1: ImageVector
    get() {
        if (_Timer_1 != null) return _Timer_1!!
        
        _Timer_1 = ImageVector.Builder(
            name = "timer_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                verticalLineToRelative(-440f)
                horizontalLineTo(320f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(560f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Timer_1!!
    }

private var _Timer_1: ImageVector? = null

