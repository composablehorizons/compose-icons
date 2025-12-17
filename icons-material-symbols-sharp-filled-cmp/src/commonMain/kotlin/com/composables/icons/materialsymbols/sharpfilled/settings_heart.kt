package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_heart: ImageVector
    get() {
        if (_Settings_heart != null) return _Settings_heart!!
        
        _Settings_heart = ImageVector.Builder(
            name = "settings_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(482f, 640f)
                lineToRelative(140f, -140f)
                quadToRelative(17f, -17f, 22f, -41.5f)
                reflectiveQuadToRelative(-5f, -47.5f)
                quadToRelative(-10f, -23f, -30f, -37f)
                reflectiveQuadToRelative(-45f, -14f)
                quadToRelative(-25f, 0f, -45f, 15.5f)
                reflectiveQuadTo(482f, 408f)
                quadToRelative(-18f, -17f, -37.5f, -32.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(-25f, 0f, -45.5f, 13.5f)
                reflectiveQuadTo(324f, 410f)
                quadToRelative(-10f, 23f, -4.5f, 47.5f)
                reflectiveQuadTo(342f, 500f)
                lineToRelative(140f, 140f)
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
                lineToRelative(-103f, 78f)
                quadToRelative(1f, 7f, 1f, 13.5f)
                verticalLineToRelative(27f)
                quadToRelative(0f, 6.5f, -2f, 13.5f)
                lineToRelative(103f, 78f)
                lineToRelative(-110f, 190f)
                lineToRelative(-118f, -50f)
                quadToRelative(-11f, 8f, -23f, 15f)
                reflectiveQuadToRelative(-24f, 12f)
                lineTo(590f, 880f)
                horizontalLineTo(370f)
                close()
            }
        }.build()
        
        return _Settings_heart!!
    }

private var _Settings_heart: ImageVector? = null

