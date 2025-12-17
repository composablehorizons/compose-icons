package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Google_wifi: ImageVector
    get() {
        if (_Google_wifi != null) return _Google_wifi!!
        
        _Google_wifi = ImageVector.Builder(
            name = "google_wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(184f, 400f)
                horizontalLineToRelative(592f)
                lineToRelative(-11f, -160f)
                horizontalLineTo(195f)
                lineToRelative(-11f, 160f)
                close()
                moveToRelative(-5f, 80f)
                lineToRelative(-13f, 200f)
                horizontalLineToRelative(628f)
                lineToRelative(-13f, -200f)
                horizontalLineTo(179f)
                close()
                moveToRelative(21f, 320f)
                lineToRelative(-13f, -40f)
                horizontalLineTo(80f)
                lineToRelative(40f, -600f)
                horizontalLineToRelative(720f)
                lineToRelative(40f, 600f)
                horizontalLineTo(773f)
                lineToRelative(-13f, 40f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Google_wifi!!
    }

private var _Google_wifi: ImageVector? = null

