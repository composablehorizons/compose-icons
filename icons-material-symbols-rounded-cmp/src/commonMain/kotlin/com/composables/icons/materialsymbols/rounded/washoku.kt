package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Washoku: ImageVector
    get() {
        if (_Washoku != null) return _Washoku!!
        
        _Washoku = ImageVector.Builder(
            name = "washoku",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(338f, 840f)
                quadToRelative(-26f, 0f, -47f, -15f)
                reflectiveQuadToRelative(-29f, -40f)
                lineToRelative(-43f, -129f)
                quadToRelative(-36f, -20f, -61f, -53f)
                reflectiveQuadToRelative(-36f, -75f)
                lineToRelative(-23f, -93f)
                quadToRelative(-7f, -29f, 11f, -52f)
                reflectiveQuadToRelative(47f, -23f)
                horizontalLineToRelative(646f)
                quadToRelative(29f, 0f, 47f, 23f)
                reflectiveQuadToRelative(11f, 52f)
                lineToRelative(-23f, 93f)
                quadToRelative(-11f, 42f, -36f, 75f)
                reflectiveQuadToRelative(-61f, 53f)
                lineToRelative(-43f, 129f)
                quadToRelative(-8f, 25f, -29f, 40f)
                reflectiveQuadToRelative(-47f, 15f)
                horizontalLineTo(338f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(284f)
                lineToRelative(27f, -80f)
                horizontalLineTo(311f)
                lineToRelative(27f, 80f)
                close()
                moveToRelative(-22f, -160f)
                horizontalLineToRelative(328f)
                quadToRelative(42f, 0f, 74f, -25.5f)
                reflectiveQuadToRelative(42f, -65.5f)
                lineToRelative(18f, -69f)
                horizontalLineTo(182f)
                lineToRelative(18f, 69f)
                quadToRelative(10f, 40f, 42f, 65.5f)
                reflectiveQuadToRelative(74f, 25.5f)
                close()
                moveToRelative(484f, -240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -21f, -14f, -35.5f)
                reflectiveQuadTo(672f, 260f)
                quadToRelative(-11f, 0f, -22f, 5f)
                reflectiveQuadToRelative(-20f, 15f)
                horizontalLineTo(507f)
                lineToRelative(-10f, -36f)
                quadToRelative(-5f, -20f, -21f, -32f)
                reflectiveQuadToRelative(-36f, -12f)
                quadToRelative(-18f, 0f, -32.5f, 9.5f)
                reflectiveQuadTo(385f, 236f)
                lineToRelative(-19f, 44f)
                horizontalLineToRelative(-86f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -50f, 34.5f, -85f)
                reflectiveQuadToRelative(83.5f, -35f)
                quadToRelative(8f, 0f, 17f, 1.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                quadToRelative(17f, -38f, 51.5f, -61.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(48f, 0f, 84.5f, 28.5f)
                reflectiveQuadTo(574f, 223f)
                quadToRelative(19f, -20f, 44f, -31.5f)
                reflectiveQuadToRelative(53f, -11.5f)
                quadToRelative(54f, 0f, 91.5f, 38f)
                reflectiveQuadToRelative(37.5f, 92f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(-320f, 80f)
                close()
                moveTo(338f, 760f)
                horizontalLineToRelative(284f)
                horizontalLineToRelative(-284f)
                close()
            }
        }.build()
        
        return _Washoku!!
    }

private var _Washoku: ImageVector? = null

