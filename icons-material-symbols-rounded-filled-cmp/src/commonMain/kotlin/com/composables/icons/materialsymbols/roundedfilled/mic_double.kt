package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mic_double: ImageVector
    get() {
        if (_Mic_double != null) return _Mic_double!!
        
        _Mic_double = ImageVector.Builder(
            name = "mic_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-83f)
                quadToRelative(-93f, -13f, -157.5f, -77.5f)
                reflectiveQuadTo(44f, 485f)
                quadToRelative(-3f, -17f, 8f, -31f)
                reflectiveQuadToRelative(28f, -14f)
                quadToRelative(17f, 0f, 29f, 13.5f)
                reflectiveQuadToRelative(16f, 31.5f)
                quadToRelative(15f, 67f, 69f, 111f)
                reflectiveQuadToRelative(126f, 44f)
                horizontalLineToRelative(10f)
                quadToRelative(5f, 0f, 10f, -1f)
                quadToRelative(13f, 20f, 28f, 37.5f)
                reflectiveQuadToRelative(32f, 32.5f)
                quadToRelative(-10f, 3f, -19.5f, 4.5f)
                reflectiveQuadTo(360f, 717f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 840f)
                close()
                moveToRelative(320f, -280f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-340f, -2f)
                quadToRelative(-43f, -8f, -71.5f, -40.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(167f)
                quadToRelative(-10f, -4f, -19.5f, -5.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(-50f, 0f, -83.5f, 35f)
                reflectiveQuadTo(283f, 478f)
                quadToRelative(0f, 19f, 5.5f, 40.5f)
                reflectiveQuadTo(300f, 558f)
                close()
                moveToRelative(340f, 82f)
                quadToRelative(72f, 0f, 126f, -44f)
                reflectiveQuadToRelative(69f, -111f)
                quadToRelative(4f, -18f, 16f, -31.5f)
                reflectiveQuadToRelative(29f, -13.5f)
                quadToRelative(17f, 0f, 28f, 14f)
                reflectiveQuadToRelative(8f, 31f)
                quadToRelative(-14f, 90f, -78.5f, 154.5f)
                reflectiveQuadTo(680f, 717f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                verticalLineToRelative(-83f)
                quadToRelative(-93f, -13f, -157.5f, -77.5f)
                reflectiveQuadTo(364f, 485f)
                quadToRelative(-3f, -17f, 8f, -31f)
                reflectiveQuadToRelative(28f, -14f)
                quadToRelative(17f, 0f, 29f, 13.5f)
                reflectiveQuadToRelative(16f, 31.5f)
                quadToRelative(15f, 67f, 69f, 111f)
                reflectiveQuadToRelative(126f, 44f)
                close()
            }
        }.build()
        
        return _Mic_double!!
    }

private var _Mic_double: ImageVector? = null

