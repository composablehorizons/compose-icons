package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Settings_overscan: ImageVector
    get() {
        if (_Settings_overscan != null) return _Settings_overscan!!
        
        _Settings_overscan = ImageVector.Builder(
            name = "settings_overscan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 424f)
                quadToRelative(0f, -7f, -6f, -9.5f)
                reflectiveQuadToRelative(-11f, 2.5f)
                lineToRelative(-49f, 49f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                lineToRelative(49f, 49f)
                quadToRelative(5f, 5f, 11f, 2.5f)
                reflectiveQuadToRelative(6f, -9.5f)
                verticalLineToRelative(-112f)
                close()
                moveToRelative(256f, 176f)
                horizontalLineTo(424f)
                quadToRelative(-7f, 0f, -9.5f, 6f)
                reflectiveQuadToRelative(2.5f, 11f)
                lineToRelative(49f, 49f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(49f, -49f)
                quadToRelative(5f, -5f, 2.5f, -11f)
                reflectiveQuadToRelative(-9.5f, -6f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(7f, 0f, 9.5f, -6f)
                reflectiveQuadToRelative(-2.5f, -11f)
                lineToRelative(-49f, -49f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-49f, 49f)
                quadToRelative(-5f, 5f, -2.5f, 11f)
                reflectiveQuadToRelative(9.5f, 6f)
                horizontalLineToRelative(112f)
                close()
                moveToRelative(144f, 64f)
                verticalLineToRelative(112f)
                quadToRelative(0f, 7f, 6f, 9.5f)
                reflectiveQuadToRelative(11f, -2.5f)
                lineToRelative(49f, -49f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-49f, -49f)
                quadToRelative(-5f, -5f, -11f, -2.5f)
                reflectiveQuadToRelative(-6f, 9.5f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Settings_overscan!!
    }

private var _Settings_overscan: ImageVector? = null

