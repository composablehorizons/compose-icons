package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Timer_1: ImageVector
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
                moveTo(540f, 760f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 700f)
                verticalLineToRelative(-380f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 200f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 280f)
                verticalLineToRelative(420f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(540f, 760f)
                close()
            }
        }.build()
        
        return _Timer_1!!
    }

private var _Timer_1: ImageVector? = null

