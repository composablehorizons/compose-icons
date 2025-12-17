package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_motion_mode: ImageVector
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
                quadToRelative(11f, -8f, 22.5f, -15f)
                reflectiveQuadToRelative(24.5f, -12f)
                lineToRelative(16f, -128f)
                horizontalLineToRelative(220f)
                lineToRelative(16f, 128f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(119f, -50f)
                lineToRelative(110f, 190f)
                lineToRelative(-74f, 56f)
                quadToRelative(-30f, -15f, -62f, -23f)
                reflectiveQuadToRelative(-66f, -8f)
                quadToRelative(-20f, 0f, -38.5f, 3.5f)
                reflectiveQuadTo(604f, 412f)
                quadToRelative(-19f, -33f, -51.5f, -52.5f)
                reflectiveQuadTo(482f, 340f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 38f, 18.5f, 70f)
                reflectiveQuadToRelative(50.5f, 51f)
                quadToRelative(-6f, 20f, -8.5f, 41.5f)
                reflectiveQuadTo(400f, 685f)
                quadToRelative(1f, 56f, 22.5f, 106.5f)
                reflectiveQuadTo(484f, 880f)
                horizontalLineTo(370f)
                close()
            }
        }.build()
        
        return _Settings_motion_mode!!
    }

private var _Settings_motion_mode: ImageVector? = null

