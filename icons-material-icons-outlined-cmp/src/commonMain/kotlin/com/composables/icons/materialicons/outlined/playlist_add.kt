package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Playlist_add: ImageVector
    get() {
        if (_Playlist_add != null) return _Playlist_add!!
        
        _Playlist_add = ImageVector.Builder(
            name = "playlist_add",
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
                    moveTo(18f, 14f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(18f)
                    close()
                    moveTo(3f, 16f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Playlist_add!!
    }

private var _Playlist_add: ImageVector? = null

