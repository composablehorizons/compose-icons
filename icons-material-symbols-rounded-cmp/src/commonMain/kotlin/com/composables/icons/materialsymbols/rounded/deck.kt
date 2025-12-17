package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Deck: ImageVector
    get() {
        if (_Deck != null) return _Deck!!
        
        _Deck = ImageVector.Builder(
            name = "deck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-480f)
                horizontalLineTo(143f)
                quadToRelative(-15f, 0f, -19f, -14f)
                reflectiveQuadToRelative(8f, -22f)
                lineToRelative(325f, -228f)
                quadToRelative(11f, -8f, 23f, -8f)
                reflectiveQuadToRelative(23f, 8f)
                lineToRelative(325f, 228f)
                quadToRelative(12f, 8f, 8f, 22f)
                reflectiveQuadToRelative(-19f, 14f)
                horizontalLineTo(520f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                close()
                moveToRelative(40f, -560f)
                horizontalLineToRelative(146f)
                horizontalLineToRelative(-292f)
                horizontalLineToRelative(146f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-170f)
                lineTo(95f, 533f)
                quadToRelative(-3f, -17f, 6f, -30f)
                reflectiveQuadToRelative(26f, -16f)
                quadToRelative(16f, -3f, 29.5f, 6.5f)
                reflectiveQuadTo(173f, 519f)
                lineToRelative(23f, 121f)
                horizontalLineToRelative(124f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 680f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineToRelative(124f)
                lineToRelative(23f, -121f)
                quadToRelative(3f, -16f, 16f, -25.5f)
                reflectiveQuadToRelative(30f, -6.5f)
                quadToRelative(17f, 3f, 26f, 16f)
                reflectiveQuadToRelative(6f, 30f)
                lineToRelative(-25f, 137f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                close()
                moveTo(334f, 280f)
                horizontalLineToRelative(292f)
                lineTo(480f, 178f)
                lineTo(334f, 280f)
                close()
            }
        }.build()
        
        return _Deck!!
    }

private var _Deck: ImageVector? = null

