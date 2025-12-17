package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_b_roll: ImageVector
    get() {
        if (_Settings_b_roll != null) return _Settings_b_roll!!
        
        _Settings_b_roll = ImageVector.Builder(
            name = "settings_b_roll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 800f)
                lineToRelative(120f, -120f)
                lineToRelative(-120f, -120f)
                lineToRelative(-28f, 28f)
                lineToRelative(72f, 72f)
                horizontalLineTo(560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(163f)
                lineToRelative(-71f, 72f)
                lineToRelative(28f, 28f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-310f, 0f)
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
        
        return _Settings_b_roll!!
    }

private var _Settings_b_roll: ImageVector? = null

