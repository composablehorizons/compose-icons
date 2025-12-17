package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Playlist_add_check: ImageVector
    get() {
        if (_Playlist_add_check != null) return _Playlist_add_check!!
        
        _Playlist_add_check = ImageVector.Builder(
            name = "playlist_add_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(534f, 440f)
                lineTo(512f, 618f)
                lineToRelative(56f, -56f)
                lineToRelative(86f, 84f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 58f)
                lineToRelative(-226f, 226f)
                close()
            }
        }.build()
        
        return _Playlist_add_check!!
    }

private var _Playlist_add_check: ImageVector? = null

