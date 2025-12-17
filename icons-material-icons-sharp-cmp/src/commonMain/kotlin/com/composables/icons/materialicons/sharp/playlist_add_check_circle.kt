package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Playlist_add_check_circle: ImageVector
    get() {
        if (_Playlist_add_check_circle != null) return _Playlist_add_check_circle!!
        
        _Playlist_add_check_circle = ImageVector.Builder(
            name = "playlist_add_check_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                close()
                moveTo(10f, 15f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(15f)
                close()
                moveTo(14.05f, 18.36f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.59f, 12f)
                lineTo(19f, 13.41f)
                lineTo(14.05f, 18.36f)
                close()
            }
        }.build()
        
        return _Playlist_add_check_circle!!
    }

private var _Playlist_add_check_circle: ImageVector? = null

