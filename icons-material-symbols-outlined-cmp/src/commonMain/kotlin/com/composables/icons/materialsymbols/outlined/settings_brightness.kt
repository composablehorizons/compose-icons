package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Settings_brightness: ImageVector
    get() {
        if (_Settings_brightness != null) return _Settings_brightness!!
        
        _Settings_brightness = ImageVector.Builder(
            name = "settings_brightness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 700f)
                lineToRelative(60f, -60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                lineToRelative(60f, -60f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-100f)
                horizontalLineTo(540f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                horizontalLineTo(320f)
                verticalLineToRelative(100f)
                lineToRelative(-60f, 60f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(100f)
                lineToRelative(60f, 60f)
                close()
                moveToRelative(0f, -100f)
                verticalLineToRelative(-240f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
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
        
        return _Settings_brightness!!
    }

private var _Settings_brightness: ImageVector? = null

