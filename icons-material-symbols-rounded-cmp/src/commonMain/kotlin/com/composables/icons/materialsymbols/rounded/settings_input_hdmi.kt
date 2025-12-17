package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Settings_input_hdmi: ImageVector
    get() {
        if (_Settings_input_hdmi != null) return _Settings_input_hdmi!!
        
        _Settings_input_hdmi = ImageVector.Builder(
            name = "settings_input_hdmi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                lineTo(208f, 537f)
                quadToRelative(-5f, -8f, -6.5f, -17.5f)
                reflectiveQuadTo(200f, 501f)
                verticalLineToRelative(-141f)
                quadToRelative(0f, -22f, 11f, -40f)
                reflectiveQuadToRelative(29f, -29f)
                verticalLineToRelative(-131f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 160f)
                verticalLineToRelative(131f)
                quadToRelative(18f, 11f, 29f, 29f)
                reflectiveQuadToRelative(11f, 40f)
                verticalLineToRelative(141f)
                quadToRelative(0f, 9f, -1.5f, 18.5f)
                reflectiveQuadTo(752f, 537f)
                lineTo(640f, 760f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-80f, -600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(80f, 520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                lineToRelative(120f, -240f)
                verticalLineToRelative(-140f)
                horizontalLineTo(280f)
                verticalLineToRelative(140f)
                lineToRelative(120f, 240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(80f, -300f)
                close()
            }
        }.build()
        
        return _Settings_input_hdmi!!
    }

private var _Settings_input_hdmi: ImageVector? = null

