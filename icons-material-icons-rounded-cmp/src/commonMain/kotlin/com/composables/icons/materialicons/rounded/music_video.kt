package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Music_video: ImageVector
    get() {
        if (_Music_video != null) return _Music_video!!
        
        _Music_video = ImageVector.Builder(
            name = "music_video",
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
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                    close()
                    moveTo(20f, 18f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(18f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.84f, 16.98f)
                    curveToRelative(1.26f, -0.17f, 2.16f, -1.33f, 2.16f, -2.6f)
                    lineTo(13f, 9f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4.51f)
                    curveToRelative(-0.46f, -0.35f, -1.02f, -0.54f, -1.66f, -0.51f)
                    curveToRelative(-1.11f, 0.07f, -2.09f, 0.92f, -2.3f, 2.02f)
                    curveTo(7.73f, 15.73f, 9.15f, 17.2f, 10.84f, 16.98f)
                    close()
                }
            }
        }.build()
        
        return _Music_video!!
    }

private var _Music_video: ImageVector? = null

