package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Timer_2: ImageVector
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
                moveTo(380f, 200f)
                horizontalLineToRelative(180f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(440f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(180f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(680f, 700f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 760f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 700f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-100f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 200f)
                close()
            }
        }.build()
        
        return _Timer_2!!
    }

private var _Timer_2: ImageVector? = null

