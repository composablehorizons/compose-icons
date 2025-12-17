package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Donut_small: ImageVector
    get() {
        if (_Donut_small != null) return _Donut_small!!
        
        _Donut_small = ImageVector.Builder(
            name = "donut_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(521f, 82f)
                quadToRelative(143f, 14f, 243.5f, 114.5f)
                reflectiveQuadTo(879f, 440f)
                horizontalLineTo(593f)
                quadToRelative(-9f, -26f, -27.5f, -45.5f)
                reflectiveQuadTo(521f, 366f)
                verticalLineToRelative(-284f)
                close()
                moveToRelative(80f, 102f)
                verticalLineToRelative(136f)
                quadToRelative(11f, 9f, 21f, 19f)
                reflectiveQuadToRelative(19f, 21f)
                horizontalLineToRelative(136f)
                quadToRelative(-24f, -60f, -70f, -106f)
                reflectiveQuadToRelative(-106f, -70f)
                close()
                moveTo(441f, 82f)
                verticalLineToRelative(284f)
                quadToRelative(-36f, 13f, -58f, 44.5f)
                reflectiveQuadTo(361f, 480f)
                quadToRelative(0f, 38f, 22f, 68.5f)
                reflectiveQuadToRelative(58f, 43.5f)
                verticalLineToRelative(286f)
                quadTo(287f, 863f, 184f, 749f)
                reflectiveQuadTo(81f, 480f)
                quadToRelative(0f, -155f, 103f, -269f)
                reflectiveQuadToRelative(257f, -129f)
                close()
                moveToRelative(-80f, 102f)
                quadToRelative(-91f, 35f, -145.5f, 116f)
                reflectiveQuadTo(161f, 480f)
                quadToRelative(0f, 99f, 54.5f, 180f)
                reflectiveQuadTo(361f, 778f)
                verticalLineToRelative(-138f)
                quadToRelative(-38f, -29f, -59f, -70.5f)
                reflectiveQuadTo(281f, 480f)
                quadToRelative(0f, -48f, 21f, -89.5f)
                reflectiveQuadToRelative(59f, -70.5f)
                verticalLineToRelative(-136f)
                close()
                moveToRelative(232f, 336f)
                horizontalLineToRelative(286f)
                quadToRelative(-14f, 143f, -114.5f, 243.5f)
                reflectiveQuadTo(521f, 878f)
                verticalLineToRelative(-286f)
                quadToRelative(26f, -9f, 44.5f, -27.5f)
                reflectiveQuadTo(593f, 520f)
                close()
                moveToRelative(48f, 80f)
                quadToRelative(-8f, 11f, -18.5f, 21f)
                reflectiveQuadTo(601f, 640f)
                verticalLineToRelative(136f)
                quadToRelative(60f, -24f, 106f, -70f)
                reflectiveQuadToRelative(70f, -106f)
                horizontalLineTo(641f)
                close()
                moveTo(281f, 481f)
                close()
                moveToRelative(360f, -121f)
                close()
                moveToRelative(0f, 240f)
                close()
            }
        }.build()
        
        return _Donut_small!!
    }

private var _Donut_small: ImageVector? = null

