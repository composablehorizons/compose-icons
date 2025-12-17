package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Playlist_remove: ImageVector
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
                    moveTo(13.71f, 21.3f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineTo(17f, 19.41f)
                    lineToRelative(1.89f, 1.89f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                    lineTo(18.41f, 18f)
                    lineToRelative(1.89f, -1.89f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                    lineTo(17f, 16.59f)
                    lineToRelative(-1.89f, -1.89f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                    lineTo(15.59f, 18f)
                    lineToRelative(-1.89f, 1.89f)
                    curveTo(13.32f, 20.27f, 13.32f, 20.91f, 13.71f, 21.3f)
                    close()
                    moveTo(14f, 11f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(9f)
                    curveTo(13.55f, 12f, 14f, 11.55f, 14f, 11f)
                    close()
                    moveTo(14f, 7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(4f)
                    curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(9f)
                    curveTo(13.55f, 8f, 14f, 7.55f, 14f, 7f)
                    close()
                    moveTo(3f, 15f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(5f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineTo(4f)
                    curveTo(3.45f, 14f, 3f, 14.45f, 3f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Playlist_remove!!
    }

private var _Playlist_remove: ImageVector? = null

