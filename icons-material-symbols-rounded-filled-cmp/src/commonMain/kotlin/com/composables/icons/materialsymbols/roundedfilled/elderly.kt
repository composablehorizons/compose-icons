package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Elderly: ImageVector
    get() {
        if (_Elderly != null) return _Elderly!!
        
        _Elderly = ImageVector.Builder(
            name = "elderly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 220f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
                moveToRelative(160f, 350f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-19f)
                quadToRelative(-54f, -23f, -84f, -51.5f)
                reflectiveQuadTo(543f, 403f)
                quadToRelative(-11f, 28f, -17.5f, 68.5f)
                reflectiveQuadTo(521f, 548f)
                lineToRelative(72f, 102f)
                quadToRelative(4f, 5f, 5.5f, 11f)
                reflectiveQuadToRelative(1.5f, 12f)
                verticalLineToRelative(207f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 880f)
                verticalLineToRelative(-160f)
                lineToRelative(-71f, -102f)
                lineToRelative(-8f, 130f)
                quadToRelative(0f, 4f, -8f, 22f)
                lineTo(344f, 888f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                quadToRelative(-14f, -10f, -16f, -26f)
                reflectiveQuadToRelative(8f, -30f)
                lineToRelative(80f, -107f)
                verticalLineToRelative(-213f)
                quadToRelative(0f, -31f, 5f, -67.5f)
                reflectiveQuadToRelative(15f, -67.5f)
                lineToRelative(-60f, 33f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 520f)
                verticalLineToRelative(-125f)
                quadToRelative(0f, -11f, 5f, -20.5f)
                reflectiveQuadToRelative(15f, -14.5f)
                lineToRelative(156f, -88f)
                quadToRelative(25f, -14f, 43.5f, -21.5f)
                reflectiveQuadTo(494f, 243f)
                quadToRelative(25f, 0f, 45.5f, 21.5f)
                reflectiveQuadTo(587f, 332f)
                quadToRelative(32f, 54f, 58f, 81f)
                reflectiveQuadToRelative(56f, 41f)
                quadToRelative(11f, -8f, 19f, -11f)
                reflectiveQuadToRelative(19f, -3f)
                quadToRelative(25f, 0f, 43f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
            }
        }.build()
        
        return _Elderly!!
    }

private var _Elderly: ImageVector? = null

