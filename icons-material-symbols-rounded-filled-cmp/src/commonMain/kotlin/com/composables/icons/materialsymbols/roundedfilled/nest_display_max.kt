package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_display_max: ImageVector
    get() {
        if (_Nest_display_max != null) return _Nest_display_max!!
        
        _Nest_display_max = ImageVector.Builder(
            name = "nest_display_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(-99f, 0f, -169.5f, -13.5f)
                reflectiveQuadTo(240f, 714f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(-73f)
                quadToRelative(-35f, 0f, -59f, -26f)
                reflectiveQuadToRelative(-21f, -61f)
                lineToRelative(27f, -320f)
                quadToRelative(2f, -31f, 25f, -52f)
                reflectiveQuadToRelative(55f, -21f)
                horizontalLineToRelative(572f)
                quadToRelative(32f, 0f, 55f, 21f)
                reflectiveQuadToRelative(25f, 52f)
                lineToRelative(27f, 320f)
                quadToRelative(3f, 35f, -21f, 61f)
                reflectiveQuadToRelative(-59f, 26f)
                horizontalLineToRelative(-73f)
                verticalLineToRelative(34f)
                quadToRelative(0f, 19f, -70.5f, 32.5f)
                reflectiveQuadTo(480f, 760f)
                close()
            }
        }.build()
        
        return _Nest_display_max!!
    }

private var _Nest_display_max: ImageVector? = null

