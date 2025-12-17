package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Clean_hands: ImageVector
    get() {
        if (_Clean_hands != null) return _Clean_hands!!
        
        _Clean_hands = ImageVector.Builder(
            name = "clean_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(535f, 873f)
                lineToRelative(-255f, -72f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(64f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(14f, 3.5f)
                lineToRelative(277f, 103f)
                quadToRelative(14f, 5f, 22.5f, 18f)
                reflectiveQuadToRelative(8.5f, 27f)
                quadToRelative(0f, 21f, -14.5f, 34f)
                reflectiveQuadTo(632f, 640f)
                horizontalLineTo(527f)
                quadToRelative(-5f, 0f, -7.5f, -0.5f)
                reflectiveQuadTo(513f, 637f)
                lineToRelative(-45f, -17f)
                quadToRelative(-8f, -3f, -16f, 1f)
                reflectiveQuadToRelative(-10f, 11f)
                quadToRelative(-2f, 8f, 1f, 15f)
                reflectiveQuadToRelative(11f, 10f)
                lineToRelative(59f, 21f)
                quadToRelative(2f, 1f, 6f, 1.5f)
                reflectiveQuadToRelative(7f, 0.5f)
                horizontalLineToRelative(274f)
                quadToRelative(32f, 0f, 56f, 23f)
                reflectiveQuadToRelative(24f, 57f)
                lineTo(585f, 871f)
                quadToRelative(-10f, 4f, -24.5f, 4.5f)
                reflectiveQuadTo(535f, 873f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 520f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(120f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                close()
                moveToRelative(560f, -334f)
                lineToRelative(-214f, -81f)
                quadToRelative(-7f, -2f, -14f, -3.5f)
                reflectiveQuadToRelative(-15f, -1.5f)
                horizontalLineTo(210f)
                quadToRelative(17f, -51f, 56.5f, -88f)
                reflectiveQuadToRelative(93.5f, -48f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(-20f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(300f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 80f)
                horizontalLineToRelative(180f)
                quadToRelative(26f, 0f, 62.5f, 10.5f)
                reflectiveQuadTo(639f, 121f)
                quadToRelative(5f, 5f, 8.5f, 12.5f)
                reflectiveQuadTo(651f, 149f)
                quadToRelative(0f, 17f, -11.5f, 29f)
                reflectiveQuadTo(611f, 190f)
                quadToRelative(-8f, 0f, -15f, -3.5f)
                reflectiveQuadToRelative(-14f, -8.5f)
                quadToRelative(-13f, -9f, -29f, -13.5f)
                reflectiveQuadToRelative(-33f, -4.5f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(84f)
                quadToRelative(69f, 14f, 114.5f, 68.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(26f)
                close()
                moveToRelative(160f, -66f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(0f, -21f, 14f, -50.5f)
                reflectiveQuadToRelative(51f, -86.5f)
                quadToRelative(2f, -2f, 15f, -8f)
                quadToRelative(3f, 0f, 15f, 8f)
                quadToRelative(36f, 56f, 50.5f, 86f)
                reflectiveQuadToRelative(14.5f, 51f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 400f)
                close()
            }
        }.build()
        
        return _Clean_hands!!
    }

private var _Clean_hands: ImageVector? = null

