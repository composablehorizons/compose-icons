package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Settings_overscan: ImageVector
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
                moveTo(280f, 560f)
                verticalLineToRelative(-160f)
                lineToRelative(-80f, 80f)
                lineToRelative(80f, 80f)
                close()
                moveToRelative(200f, 120f)
                lineToRelative(80f, -80f)
                horizontalLineTo(400f)
                lineToRelative(80f, 80f)
                close()
                moveToRelative(-80f, -320f)
                horizontalLineToRelative(160f)
                lineToRelative(-80f, -80f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(280f, 200f)
                lineToRelative(80f, -80f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(160f)
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
        
        return _Settings_overscan!!
    }

private var _Settings_overscan: ImageVector? = null

