package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_remote: ImageVector
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
                moveTo(320f, 920f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(560f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, -350f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(530f, 520f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(480f, 470f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(430f, 520f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(480f, 570f)
                close()
                moveTo(338f, 298f)
                lineToRelative(-56f, -56f)
                quadToRelative(40f, -40f, 91f, -61f)
                reflectiveQuadToRelative(107f, -21f)
                quadToRelative(56f, 0f, 107f, 21f)
                reflectiveQuadToRelative(91f, 61f)
                lineToRelative(-56f, 56f)
                quadToRelative(-29f, -29f, -65.5f, -43.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-40f, 0f, -76.5f, 14.5f)
                reflectiveQuadTo(338f, 298f)
                close()
                moveTo(226f, 186f)
                lineToRelative(-58f, -58f)
                quadToRelative(63f, -61f, 143.5f, -94.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(88f, 0f, 168.5f, 33.5f)
                reflectiveQuadTo(790f, 130f)
                lineToRelative(-56f, 56f)
                quadToRelative(-50f, -52f, -116f, -79f)
                reflectiveQuadToRelative(-138f, -27f)
                quadToRelative(-72f, 0f, -138f, 27f)
                reflectiveQuadToRelative(-116f, 79f)
                close()
            }
        }.build()
        
        return _Settings_remote!!
    }

private var _Settings_remote: ImageVector? = null

