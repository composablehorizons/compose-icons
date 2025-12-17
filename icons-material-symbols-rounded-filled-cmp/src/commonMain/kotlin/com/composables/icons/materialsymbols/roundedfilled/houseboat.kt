package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Houseboat: ImageVector
    get() {
        if (_Houseboat != null) return _Houseboat!!
        
        _Houseboat = ImageVector.Builder(
            name = "houseboat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-38f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-57f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-28f, 0f, -45f, 13.5f)
                reflectiveQuadTo(120f, 755f)
                quadToRelative(-16f, 4f, -28f, -7f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(0f, -17f, 12f, -29.5f)
                reflectiveQuadToRelative(27f, -20.5f)
                quadToRelative(17f, -9f, 36f, -19.5f)
                reflectiveQuadToRelative(58f, -10.5f)
                quadToRelative(58f, 0f, 78f, 20f)
                reflectiveQuadToRelative(55f, 20f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(59f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                quadToRelative(35f, 0f, 55f, -20f)
                reflectiveQuadToRelative(78f, -20f)
                quadToRelative(39f, 0f, 58f, 10.5f)
                reflectiveQuadToRelative(36f, 19.5f)
                quadToRelative(15f, 8f, 27f, 20.5f)
                reflectiveQuadToRelative(12f, 29.5f)
                quadToRelative(0f, 17f, -12f, 28f)
                reflectiveQuadToRelative(-28f, 7f)
                quadToRelative(-32f, -8f, -49f, -21.5f)
                reflectiveQuadTo(746f, 720f)
                quadToRelative(-36f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-59f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                close()
                moveTo(230f, 600f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineToRelative(-27f, -27f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(118f, 482f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(174f, 481f)
                lineToRelative(27f, 27f)
                quadToRelative(6f, 6f, 13.5f, 9f)
                reflectiveQuadToRelative(15.5f, 3f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-135f)
                lineToRelative(-21f, 16f)
                quadToRelative(-14f, 10f, -29.5f, 7.5f)
                reflectiveQuadTo(204f, 392f)
                quadToRelative(-10f, -14f, -8f, -29.5f)
                reflectiveQuadToRelative(16f, -25.5f)
                lineToRelative(221f, -162f)
                quadToRelative(11f, -8f, 22.5f, -12f)
                reflectiveQuadToRelative(24.5f, -4f)
                quadToRelative(13f, 0f, 24.5f, 4f)
                reflectiveQuadToRelative(22.5f, 12f)
                lineToRelative(221f, 162f)
                quadToRelative(14f, 10f, 16.5f, 25.5f)
                reflectiveQuadTo(757f, 392f)
                quadToRelative(-10f, 14f, -26.5f, 16.5f)
                reflectiveQuadTo(700f, 401f)
                lineToRelative(-20f, -15f)
                verticalLineToRelative(134f)
                horizontalLineToRelative(50f)
                quadToRelative(8f, 0f, 15.5f, -3f)
                reflectiveQuadToRelative(13.5f, -9f)
                lineToRelative(27f, -27f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-27f, 27f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                horizontalLineTo(230f)
                close()
                moveToRelative(290f, -80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Houseboat!!
    }

private var _Houseboat: ImageVector? = null

