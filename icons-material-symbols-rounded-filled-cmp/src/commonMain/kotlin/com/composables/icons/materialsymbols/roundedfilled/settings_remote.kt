package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_remote: ImageVector
    get() {
        if (_Settings_remote != null) return _Settings_remote!!
        
        _Settings_remote = ImageVector.Builder(
            name = "settings_remote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 880f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 400f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -350f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(530f, 520f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(480f, 470f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(430f, 520f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(480f, 570f)
                close()
                moveToRelative(0f, -330f)
                quadToRelative(-30f, 0f, -58f, 8f)
                reflectiveQuadToRelative(-53f, 25f)
                quadToRelative(-14f, 9f, -31f, 8.5f)
                reflectiveQuadTo(310f, 270f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(13.5f, -26f)
                quadToRelative(36f, -27f, 79f, -41.5f)
                reflectiveQuadToRelative(89f, -14.5f)
                quadToRelative(46f, 0f, 89f, 14.5f)
                reflectiveQuadToRelative(79f, 41.5f)
                quadToRelative(13f, 10f, 13.5f, 26f)
                reflectiveQuadTo(650f, 270f)
                quadToRelative(-11f, 11f, -27f, 12f)
                reflectiveQuadToRelative(-30f, -8f)
                quadToRelative(-25f, -17f, -54f, -25.5f)
                reflectiveQuadToRelative(-59f, -8.5f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-62f, 0f, -119f, 19.5f)
                reflectiveQuadTo(257f, 157f)
                quadToRelative(-14f, 11f, -31f, 11.5f)
                reflectiveQuadTo(197f, 157f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(14f, -28f)
                quadToRelative(60f, -48f, 131.5f, -74f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(78f, 0f, 150f, 25.5f)
                reflectiveQuadTo(760f, 101f)
                quadToRelative(13f, 11f, 13.5f, 28f)
                reflectiveQuadTo(762f, 158f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(705f, 159f)
                quadToRelative(-48f, -39f, -105f, -59f)
                reflectiveQuadToRelative(-120f, -20f)
                close()
            }
        }.build()
        
        return _Settings_remote!!
    }

private var _Settings_remote: ImageVector? = null

