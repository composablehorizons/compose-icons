package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_bluetooth: ImageVector
    get() {
        if (_Settings_bluetooth != null) return _Settings_bluetooth!!
        
        _Settings_bluetooth = ImageVector.Builder(
            name = "settings_bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 496f)
                lineTo(284f, 652f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(196f, -196f)
                lineToRelative(-196f, -196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(156f, 156f)
                verticalLineToRelative(-247f)
                quadToRelative(0f, -18f, 12f, -29.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(172f, 172f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(536f, 400f)
                lineToRelative(144f, 144f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(508f, 772f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-16f, 0f, -28f, -11.5f)
                reflectiveQuadTo(440f, 743f)
                verticalLineToRelative(-247f)
                close()
                moveToRelative(80f, 150f)
                lineToRelative(76f, -74f)
                lineToRelative(-76f, -76f)
                verticalLineToRelative(150f)
                close()
                moveToRelative(0f, -342f)
                lineToRelative(76f, -76f)
                lineToRelative(-76f, -74f)
                verticalLineToRelative(150f)
                close()
                moveTo(320f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 960f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 960f)
                close()
            }
        }.build()
        
        return _Settings_bluetooth!!
    }

private var _Settings_bluetooth: ImageVector? = null

