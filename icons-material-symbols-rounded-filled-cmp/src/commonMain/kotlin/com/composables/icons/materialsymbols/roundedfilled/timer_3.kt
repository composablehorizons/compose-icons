package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Timer_3: ImageVector
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
                moveTo(560f, 760f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 700f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 640f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-100f)
                horizontalLineTo(420f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(420f, 420f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-100f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 200f)
                horizontalLineToRelative(180f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 35f, -24.5f, 59.5f)
                reflectiveQuadTo(596f, 480f)
                quadToRelative(35f, 0f, 59.5f, 24.5f)
                reflectiveQuadTo(680f, 564f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Timer_3!!
    }

private var _Timer_3: ImageVector? = null

