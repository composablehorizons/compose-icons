package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Timer_arrow_down: ImageVector
    get() {
        if (_Timer_arrow_down != null) return _Timer_arrow_down!!
        
        _Timer_arrow_down = ImageVector.Builder(
            name = "timer_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 800f)
                quadToRelative(-125f, 0f, -212.5f, -87.5f)
                reflectiveQuadTo(40f, 500f)
                quadToRelative(0f, -125f, 87.5f, -212.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(52f, 0f, 98f, 16.5f)
                reflectiveQuadToRelative(84f, 45.5f)
                lineToRelative(42f, -42f)
                lineToRelative(56f, 56f)
                lineToRelative(-42f, 42f)
                quadToRelative(29f, 38f, 45.5f, 84.5f)
                reflectiveQuadTo(640f, 500f)
                quadToRelative(0f, 125f, -87.5f, 212.5f)
                reflectiveQuadTo(340f, 800f)
                close()
                moveToRelative(440f, 0f)
                lineTo(640f, 660f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 44f)
                verticalLineToRelative(-488f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(487f)
                lineToRelative(43f, -43f)
                lineToRelative(57f, 56f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(60f, 380f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Timer_arrow_down!!
    }

private var _Timer_arrow_down: ImageVector? = null

