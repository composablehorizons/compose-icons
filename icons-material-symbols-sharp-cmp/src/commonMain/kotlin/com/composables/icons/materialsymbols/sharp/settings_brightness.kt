package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Settings_brightness: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
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

