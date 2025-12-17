package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Playlist_play: ImageVector
    get() {
        if (_Playlist_play != null) return _Playlist_play!!
        
        _Playlist_play = ImageVector.Builder(
            name = "playlist_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 560f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 640f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 320f)
                horizontalLineTo(160f)
                close()
                moveToRelative(511f, 499f)
                quadToRelative(-5f, 3f, -10f, 3f)
                reflectiveQuadToRelative(-10f, -2f)
                quadToRelative(-5f, -2f, -8f, -6.5f)
                reflectiveQuadToRelative(-3f, -10.5f)
                verticalLineToRelative(-246f)
                quadToRelative(0f, -6f, 3f, -10.5f)
                reflectiveQuadToRelative(8f, -6.5f)
                quadToRelative(5f, -2f, 10f, -2f)
                reflectiveQuadToRelative(10f, 3f)
                lineToRelative(184f, 122f)
                quadToRelative(5f, 3f, 7f, 7.5f)
                reflectiveQuadToRelative(2f, 9.5f)
                quadToRelative(0f, 5f, -2f, 9.5f)
                reflectiveQuadToRelative(-7f, 7.5f)
                lineTo(671f, 819f)
                close()
            }
        }.build()
        
        return _Playlist_play!!
    }

private var _Playlist_play: ImageVector? = null

