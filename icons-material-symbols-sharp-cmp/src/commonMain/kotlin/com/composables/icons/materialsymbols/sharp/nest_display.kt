package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_display: ImageVector
    get() {
        if (_Nest_display != null) return _Nest_display!!
        
        _Nest_display = ImageVector.Builder(
            name = "nest_display",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
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
                moveTo(167f, 600f)
                horizontalLineToRelative(626f)
                lineToRelative(-27f, -320f)
                horizontalLineTo(194f)
                lineToRelative(-27f, 320f)
                close()
                moveToRelative(313f, -160f)
                close()
            }
        }.build()
        
        return _Nest_display!!
    }

private var _Nest_display: ImageVector? = null

