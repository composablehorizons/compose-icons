package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Settings_seating: ImageVector
    get() {
        if (_Settings_seating != null) return _Settings_seating!!
        
        _Settings_seating = ImageVector.Builder(
            name = "settings_seating",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                close()
                moveTo(360f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-6f)
                quadToRelative(-32f, 0f, -55f, -21f)
                reflectiveQuadToRelative(-25f, -52f)
                lineToRelative(-30f, -364f)
                quadToRelative(-2f, -17f, 10f, -30f)
                reflectiveQuadToRelative(29f, -13f)
                horizontalLineToRelative(55f)
                quadToRelative(45f, 0f, 78f, 28f)
                reflectiveQuadToRelative(41f, 72f)
                lineToRelative(23f, 140f)
                horizontalLineToRelative(160f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 600f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveToRelative(320f, -200f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 440f)
                horizontalLineTo(372f)
                lineToRelative(-34f, -206f)
                quadToRelative(-2f, -15f, -13.5f, -24.5f)
                reflectiveQuadTo(298f, 200f)
                horizontalLineToRelative(-11f)
                lineToRelative(27f, 320f)
                horizontalLineToRelative(366f)
                close()
                moveToRelative(-366f, 0f)
                close()
            }
        }.build()
        
        return _Settings_seating!!
    }

private var _Settings_seating: ImageVector? = null

