package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_hand_left: ImageVector
    get() {
        if (_Mobile_hand_left != null) return _Mobile_hand_left!!
        
        _Mobile_hand_left = ImageVector.Builder(
            name = "mobile_hand_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(550f, 880f)
                quadToRelative(-26f, 0f, -37f, -23f)
                reflectiveQuadToRelative(6f, -43f)
                lineToRelative(102f, -123f)
                quadToRelative(20f, -24f, 19f, -55f)
                reflectiveQuadToRelative(-23f, -53f)
                lineToRelative(-15f, -15f)
                quadToRelative(-30f, -30f, -72f, -36f)
                reflectiveQuadToRelative(-80f, 13f)
                lineToRelative(-50f, 26f)
                verticalLineToRelative(-251f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(320f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(550f)
                close()
                moveToRelative(-10f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 280f)
                close()
                moveTo(280f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                verticalLineToRelative(275f)
                quadToRelative(0f, 23f, 19f, 34.5f)
                reflectiveQuadToRelative(39f, 1.5f)
                lineToRelative(108f, -54f)
                quadToRelative(15f, -8f, 31f, -6f)
                reflectiveQuadToRelative(28f, 14f)
                quadToRelative(6f, 6f, 7f, 15f)
                reflectiveQuadToRelative(-5f, 16f)
                lineTo(384f, 851f)
                quadToRelative(-11f, 14f, -27.5f, 21.5f)
                reflectiveQuadTo(322f, 880f)
                horizontalLineToRelative(-42f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left!!
    }

private var _Mobile_hand_left: ImageVector? = null

