package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Settings_alert: ImageVector
    get() {
        if (_Settings_alert != null) return _Settings_alert!!
        
        _Settings_alert = ImageVector.Builder(
            name = "settings_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 480f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(433f, 880f)
                quadToRelative(-27f, 0f, -46.5f, -18f)
                reflectiveQuadTo(363f, 818f)
                lineToRelative(-9f, -66f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-62f, 26f)
                quadToRelative(-25f, 11f, -50f, 2f)
                reflectiveQuadToRelative(-39f, -32f)
                lineToRelative(-47f, -82f)
                quadToRelative(-14f, -23f, -8f, -49f)
                reflectiveQuadToRelative(27f, -43f)
                lineToRelative(53f, -40f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineToRelative(-53f, -40f)
                quadToRelative(-21f, -17f, -27f, -43f)
                reflectiveQuadToRelative(8f, -49f)
                lineToRelative(47f, -82f)
                quadToRelative(14f, -23f, 39f, -32f)
                reflectiveQuadToRelative(50f, 2f)
                lineToRelative(62f, 26f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(9f, -66f)
                quadToRelative(4f, -26f, 23.5f, -44f)
                reflectiveQuadToRelative(46.5f, -18f)
                horizontalLineToRelative(94f)
                quadToRelative(27f, 0f, 46.5f, 18f)
                reflectiveQuadToRelative(23.5f, 44f)
                lineToRelative(9f, 66f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(62f, -26f)
                quadToRelative(25f, -11f, 50f, -2f)
                reflectiveQuadToRelative(39f, 32f)
                lineToRelative(47f, 82f)
                quadToRelative(14f, 23f, 8f, 49f)
                reflectiveQuadToRelative(-27f, 43f)
                lineToRelative(-53f, 40f)
                quadToRelative(1f, 7f, 1f, 13.5f)
                verticalLineToRelative(27f)
                quadToRelative(0f, 6.5f, -2f, 13.5f)
                lineToRelative(53f, 40f)
                quadToRelative(21f, 17f, 27f, 43f)
                reflectiveQuadToRelative(-8f, 49f)
                lineToRelative(-48f, 82f)
                quadToRelative(-14f, 23f, -39f, 32f)
                reflectiveQuadToRelative(-50f, -2f)
                lineToRelative(-60f, -26f)
                quadToRelative(-11f, 8f, -23f, 15f)
                reflectiveQuadToRelative(-24f, 12f)
                lineToRelative(-9f, 66f)
                quadToRelative(-4f, 26f, -23.5f, 44f)
                reflectiveQuadTo(527f, 880f)
                horizontalLineToRelative(-94f)
                close()
                moveToRelative(7f, -80f)
                horizontalLineToRelative(79f)
                lineToRelative(14f, -106f)
                quadToRelative(31f, -8f, 57.5f, -23.5f)
                reflectiveQuadTo(639f, 633f)
                lineToRelative(99f, 41f)
                lineToRelative(39f, -68f)
                lineToRelative(-86f, -65f)
                quadToRelative(5f, -14f, 7f, -29.5f)
                reflectiveQuadToRelative(2f, -31.5f)
                quadToRelative(0f, -16f, -2f, -31.5f)
                reflectiveQuadToRelative(-7f, -29.5f)
                lineToRelative(86f, -65f)
                lineToRelative(-39f, -68f)
                lineToRelative(-99f, 42f)
                quadToRelative(-22f, -23f, -48.5f, -38.5f)
                reflectiveQuadTo(533f, 266f)
                lineToRelative(-13f, -106f)
                horizontalLineToRelative(-79f)
                lineToRelative(-14f, 106f)
                quadToRelative(-31f, 8f, -57.5f, 23.5f)
                reflectiveQuadTo(321f, 327f)
                lineToRelative(-99f, -41f)
                lineToRelative(-39f, 68f)
                lineToRelative(86f, 64f)
                quadToRelative(-5f, 15f, -7f, 30f)
                reflectiveQuadToRelative(-2f, 32f)
                quadToRelative(0f, 16f, 2f, 31f)
                reflectiveQuadToRelative(7f, 30f)
                lineToRelative(-86f, 65f)
                lineToRelative(39f, 68f)
                lineToRelative(99f, -42f)
                quadToRelative(22f, 23f, 48.5f, 38.5f)
                reflectiveQuadTo(427f, 694f)
                lineToRelative(13f, 106f)
                close()
                moveToRelative(40f, -320f)
                close()
            }
        }.build()
        
        return _Settings_alert!!
    }

private var _Settings_alert: ImageVector? = null

