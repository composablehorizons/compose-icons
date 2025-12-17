package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Screen_rotation_up: ImageVector
    get() {
        if (_Screen_rotation_up != null) return _Screen_rotation_up!!
        
        _Screen_rotation_up = ImageVector.Builder(
            name = "screen_rotation_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(567f, 800f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 720f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -18f, 12f, -29f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(17f, 0f, 28.5f, 12f)
                reflectiveQuadToRelative(11.5f, 29f)
                verticalLineToRelative(319f)
                horizontalLineToRelative(247f)
                lineToRelative(-45f, -45f)
                quadToRelative(-5f, -6f, -8f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(8f, -13f)
                quadToRelative(6f, -6f, 13.5f, -9f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(113f, 113f)
                quadToRelative(6f, 6f, 9f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -3f, 15f)
                reflectiveQuadToRelative(-9f, 13f)
                lineTo(578f, 902f)
                quadToRelative(-6f, 6f, -12.5f, 9f)
                reflectiveQuadTo(551f, 914f)
                quadToRelative(-8f, 0f, -15.5f, -3.5f)
                reflectiveQuadTo(522f, 901f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(45f, -45f)
                close()
                moveToRelative(153f, -560f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 18f, -12f, 29f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(640f, 559f)
                verticalLineToRelative(-319f)
                horizontalLineTo(393f)
                lineToRelative(45f, 45f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(438f, 341f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(381f, 341f)
                lineTo(268f, 228f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(114f, -114f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(438f, 115f)
                lineToRelative(-45f, 45f)
                horizontalLineToRelative(247f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                close()
            }
        }.build()
        
        return _Screen_rotation_up!!
    }

private var _Screen_rotation_up: ImageVector? = null

