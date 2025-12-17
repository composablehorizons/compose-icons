package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hand_meal: ImageVector
    get() {
        if (_Hand_meal != null) return _Hand_meal!!
        
        _Hand_meal = ImageVector.Builder(
            name = "hand_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(79f, 440f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(40f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 360f)
                horizontalLineToRelative(59f)
                quadToRelative(34f, -97f, 114.5f, -162f)
                reflectiveQuadTo(440f, 121f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(1f)
                quadToRelative(105f, 12f, 185.5f, 77f)
                reflectiveQuadTo(820f, 360f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 440f)
                horizontalLineTo(79f)
                close()
                moveToRelative(241f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(272f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 19f)
                quadToRelative(4f, 11f, 1.5f, 23f)
                reflectiveQuadTo(618f, 591f)
                lineToRelative(-59f, 49f)
                horizontalLineTo(430f)
                quadToRelative(-13f, 0f, -21.5f, 9f)
                reflectiveQuadToRelative(-8.5f, 21f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(429f, 700f)
                horizontalLineToRelative(122f)
                quadToRelative(14f, 0f, 27.5f, -4.5f)
                reflectiveQuadTo(603f, 682f)
                lineToRelative(139f, -116f)
                quadToRelative(22f, -16f, 46.5f, -20f)
                reflectiveQuadToRelative(48.5f, 2f)
                quadToRelative(24f, 6f, 45.5f, 20.5f)
                reflectiveQuadTo(919f, 606f)
                lineTo(684f, 803f)
                quadToRelative(-22f, 18f, -48f, 27.5f)
                reflectiveQuadToRelative(-54f, 9.5f)
                horizontalLineTo(320f)
                close()
                moveTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 520f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 880f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Hand_meal!!
    }

private var _Hand_meal: ImageVector? = null

