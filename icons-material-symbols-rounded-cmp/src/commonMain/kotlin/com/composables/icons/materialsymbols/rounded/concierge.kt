package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Concierge: ImageVector
    get() {
        if (_Concierge != null) return _Concierge!!
        
        _Concierge = ImageVector.Builder(
            name = "concierge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(440f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(0f, -81f, 51f, -141.5f)
                reflectiveQuadTo(620f, 544f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 479f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 519f)
                verticalLineToRelative(25f)
                quadToRelative(77f, 14f, 128.5f, 74.5f)
                reflectiveQuadTo(880f, 760f)
                horizontalLineTo(440f)
                close()
                moveToRelative(105f, -81f)
                horizontalLineToRelative(228f)
                quadToRelative(-19f, -27f, -48.5f, -43.5f)
                reflectiveQuadTo(660f, 619f)
                quadToRelative(-36f, 0f, -66f, 16.5f)
                reflectiveQuadTo(545f, 679f)
                close()
                moveToRelative(114f, 0f)
                close()
                moveTo(40f, 440f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(24f, 0f, 48f, 17f)
                reflectiveQuadToRelative(32f, 41f)
                lineToRelative(257f, -72f)
                quadToRelative(11f, -3f, 23f, -3f)
                reflectiveQuadToRelative(23f, 4f)
                lineToRelative(269f, 84f)
                quadToRelative(13f, 4f, 20.5f, 14.5f)
                reflectiveQuadTo(880f, 189f)
                verticalLineToRelative(11f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 25f, -14.5f, 45.5f)
                reflectiveQuadTo(628f, 419f)
                lineToRelative(-256f, 96f)
                quadToRelative(-7f, 2f, -13.5f, 3.5f)
                reflectiveQuadTo(344f, 520f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 440f)
                close()
                moveToRelative(80f, -140f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(160f, 30f)
                verticalLineToRelative(110f)
                horizontalLineToRelative(64f)
                lineToRelative(232f, -85f)
                quadToRelative(11f, -4f, 17.5f, -13.5f)
                reflectiveQuadTo(600f, 320f)
                horizontalLineToRelative(-71f)
                lineToRelative(-79f, 26f)
                quadToRelative(-16f, 5f, -30.5f, -2.5f)
                reflectiveQuadTo(400f, 319f)
                quadToRelative(-5f, -16f, 2f, -30f)
                reflectiveQuadToRelative(23f, -19f)
                lineToRelative(88f, -30f)
                horizontalLineToRelative(247f)
                quadToRelative(9f, 0f, 22.5f, -6.5f)
                reflectiveQuadTo(796f, 218f)
                lineToRelative(-238f, -74f)
                lineToRelative(-278f, 76f)
                verticalLineToRelative(110f)
                close()
            }
        }.build()
        
        return _Concierge!!
    }

private var _Concierge: ImageVector? = null

