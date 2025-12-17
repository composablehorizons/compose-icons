package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_overscan: ImageVector
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
            }
        }.build()
        
        return _Settings_overscan!!
    }

private var _Settings_overscan: ImageVector? = null

