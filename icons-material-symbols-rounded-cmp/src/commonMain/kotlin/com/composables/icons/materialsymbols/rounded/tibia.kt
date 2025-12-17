package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tibia: ImageVector
    get() {
        if (_Tibia != null) return _Tibia!!
        
        _Tibia = ImageVector.Builder(
            name = "tibia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 368f)
                lineToRelative(-85f, -85f)
                quadToRelative(-17f, -17f, -26f, -39f)
                reflectiveQuadToRelative(-9f, -45f)
                quadToRelative(0f, -50f, 34f, -84.5f)
                reflectiveQuadToRelative(84f, -34.5f)
                horizontalLineToRelative(244f)
                quadToRelative(49f, 0f, 82.5f, 35f)
                reflectiveQuadToRelative(33.5f, 84f)
                quadToRelative(0f, 24f, -9.5f, 46.5f)
                reflectiveQuadTo(682f, 285f)
                lineToRelative(-82f, 82f)
                verticalLineToRelative(222f)
                lineToRelative(84f, 84f)
                quadToRelative(17f, 17f, 26f, 39f)
                reflectiveQuadToRelative(9f, 46f)
                quadToRelative(0f, 51f, -34.5f, 86f)
                reflectiveQuadTo(599f, 879f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                quadToRelative(-7f, -7f, -15.5f, -10.5f)
                reflectiveQuadTo(480f, 830f)
                quadToRelative(-10f, 0f, -18.5f, 3.5f)
                reflectiveQuadTo(446f, 844f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                quadToRelative(-51f, 0f, -86.5f, -35f)
                reflectiveQuadTo(239f, 758f)
                quadToRelative(0f, -24f, 9.5f, -46f)
                reflectiveQuadToRelative(26.5f, -39f)
                lineToRelative(85f, -83f)
                verticalLineToRelative(-222f)
                close()
                moveToRelative(80f, -17f)
                verticalLineToRelative(256f)
                quadToRelative(0f, 8f, -3.5f, 15.5f)
                reflectiveQuadTo(428f, 635f)
                lineToRelative(-96f, 95f)
                quadToRelative(-6f, 5f, -9f, 12.5f)
                reflectiveQuadToRelative(-3f, 15.5f)
                quadToRelative(0f, 17f, 12f, 29.5f)
                reflectiveQuadToRelative(29f, 12.5f)
                quadToRelative(8f, 0f, 15.5f, -3f)
                reflectiveQuadToRelative(13.5f, -9f)
                quadToRelative(18f, -18f, 41f, -28f)
                reflectiveQuadToRelative(49f, -10f)
                quadToRelative(26f, 0f, 49.5f, 10f)
                reflectiveQuadToRelative(40.5f, 28f)
                quadToRelative(6f, 5f, 13.5f, 8.5f)
                reflectiveQuadTo(599f, 800f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(641f, 758f)
                quadToRelative(0f, -8f, -3f, -15.5f)
                reflectiveQuadTo(628f, 730f)
                lineToRelative(-96f, -95f)
                quadToRelative(-5f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-3.5f, -15f)
                verticalLineToRelative(-256f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(8f, -12.5f)
                lineToRelative(95f, -96f)
                quadToRelative(6f, -6f, 9.5f, -13.5f)
                reflectiveQuadTo(639f, 198f)
                quadToRelative(0f, -16f, -11f, -27f)
                reflectiveQuadToRelative(-27f, -11f)
                horizontalLineTo(358f)
                quadToRelative(-16f, 0f, -27f, 11.5f)
                reflectiveQuadTo(320f, 199f)
                quadToRelative(0f, 8f, 3f, 15f)
                reflectiveQuadToRelative(8f, 13f)
                lineToRelative(97f, 96f)
                quadToRelative(6f, 5f, 9f, 12.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                close()
                moveToRelative(41f, 129f)
                close()
            }
        }.build()
        
        return _Tibia!!
    }

private var _Tibia: ImageVector? = null

