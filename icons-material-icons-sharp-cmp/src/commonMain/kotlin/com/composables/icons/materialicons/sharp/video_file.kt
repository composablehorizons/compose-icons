package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Video_file: ImageVector
    get() {
        if (_Video_file != null) return _Video_file!!
        
        _Video_file = ImageVector.Builder(
            name = "video_file",
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
                    moveTo(14f, 2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(13f, 9f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(14f, 14f)
                    lineToRelative(2f, -1.06f)
                    verticalLineToRelative(4.12f)
                    lineTo(14f, 16f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Video_file!!
    }

private var _Video_file: ImageVector? = null

