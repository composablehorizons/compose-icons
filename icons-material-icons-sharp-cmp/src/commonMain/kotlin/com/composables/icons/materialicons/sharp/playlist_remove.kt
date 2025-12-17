package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Playlist_remove: ImageVector
    get() {
        if (_Playlist_remove != null) return _Playlist_remove!!
        
        _Playlist_remove = ImageVector.Builder(
            name = "playlist_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 10f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(10f)
                    close()
                    moveTo(14f, 6f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(6f)
                    close()
                    moveTo(3f, 16f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(16f)
                    close()
                    moveTo(14.41f, 22f)
                    lineTo(17f, 19.41f)
                    lineTo(19.59f, 22f)
                    lineTo(21f, 20.59f)
                    lineTo(18.41f, 18f)
                    lineTo(21f, 15.41f)
                    lineTo(19.59f, 14f)
                    lineTo(17f, 16.59f)
                    lineTo(14.41f, 14f)
                    lineTo(13f, 15.41f)
                    lineTo(15.59f, 18f)
                    lineTo(13f, 20.59f)
                    lineTo(14.41f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Playlist_remove!!
    }

private var _Playlist_remove: ImageVector? = null

