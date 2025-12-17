package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Settings_motion_mode: ImageVector
    get() {
        if (_Settings_motion_mode != null) return _Settings_motion_mode!!
        
        _Settings_motion_mode = ImageVector.Builder(
            name = "settings_motion_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                verticalLineToRelative(-400f)
                quadToRelative(16f, 0f, 31f, 2.5f)
                reflectiveQuadToRelative(29f, 7.5f)
                verticalLineToRelative(380f)
                quadToRelative(-14f, 5f, -29f, 7.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-100f, -28f)
                verticalLineToRelative(-344f)
                quadToRelative(14f, -8f, 28.5f, -14.5f)
                reflectiveQuadTo(640f, 484f)
                verticalLineToRelative(392f)
                quadToRelative(-17f, -3f, -31.5f, -9.5f)
                reflectiveQuadTo(580f, 852f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-344f)
                quadToRelative(45f, 26f, 72.5f, 71f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 56f, -27.5f, 101f)
                reflectiveQuadTo(780f, 852f)
                close()
                moveToRelative(-240f, -30f)
                quadToRelative(-28f, -27f, -44f, -63.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -42f, 16f, -79f)
                reflectiveQuadToRelative(44f, -64f)
                verticalLineToRelative(285f)
                close()
                moveToRelative(-60f, -342f)
                close()
                moveTo(370f, 880f)
                lineToRelative(-16f, -128f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-119f, 50f)
                lineTo(78f, 585f)
                lineToRelative(103f, -78f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineTo(78f, 375f)
                lineToRelative(110f, -190f)
                lineToRelative(119f, 50f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(16f, -128f)
                horizontalLineToRelative(220f)
                lineToRelative(16f, 128f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(119f, -50f)
                lineToRelative(110f, 190f)
                lineToRelative(-74f, 56f)
                quadToRelative(-22f, -11f, -45f, -18.5f)
                reflectiveQuadTo(714f, 402f)
                lineToRelative(63f, -48f)
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
                quadToRelative(17f, 17f, 36.5f, 30.5f)
                reflectiveQuadTo(400f, 685f)
                quadToRelative(1f, 57f, 23.5f, 107f)
                reflectiveQuadTo(484f, 880f)
                horizontalLineTo(370f)
                close()
                moveToRelative(41f, -279f)
                quadToRelative(6f, -20f, 14.5f, -38.5f)
                reflectiveQuadTo(445f, 527f)
                quadToRelative(-11f, -8f, -17f, -20.5f)
                reflectiveQuadToRelative(-6f, -26.5f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(482f, 420f)
                quadToRelative(14f, 0f, 27f, 6.5f)
                reflectiveQuadToRelative(21f, 17.5f)
                quadToRelative(17f, -11f, 35f, -19.5f)
                reflectiveQuadToRelative(38f, -13.5f)
                quadToRelative(-18f, -32f, -50f, -51.5f)
                reflectiveQuadTo(482f, 340f)
                quadToRelative(-59f, 0f, -99.5f, 41f)
                reflectiveQuadTo(342f, 480f)
                quadToRelative(0f, 38f, 18.5f, 70.5f)
                reflectiveQuadTo(411f, 601f)
                close()
            }
        }.build()
        
        return _Settings_motion_mode!!
    }

private var _Settings_motion_mode: ImageVector? = null

