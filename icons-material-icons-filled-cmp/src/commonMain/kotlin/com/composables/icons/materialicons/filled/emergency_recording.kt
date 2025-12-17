package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Emergency_recording: ImageVector
    get() {
        if (_Emergency_recording != null) return _Emergency_recording!!
        
        _Emergency_recording = ImageVector.Builder(
            name = "emergency_recording",
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
                    moveTo(18f, 10.48f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-4.48f)
                    lineToRelative(4f, 3.98f)
                    verticalLineToRelative(-11f)
                    lineTo(18f, 10.48f)
                    close()
                    moveTo(12f, 12f)
                    lineToRelative(3f, 1.73f)
                    lineToRelative(-1f, 1.73f)
                    lineToRelative(-3f, -1.73f)
                    verticalLineTo(17f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-3.27f)
                    lineToRelative(-3f, 1.73f)
                    lineToRelative(-1f, -1.73f)
                    lineTo(8f, 12f)
                    lineToRelative(-3f, -1.73f)
                    lineToRelative(1f, -1.73f)
                    lineToRelative(3f, 1.73f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(3.27f)
                    lineToRelative(3f, -1.73f)
                    lineToRelative(1f, 1.73f)
                    lineTo(12f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Emergency_recording!!
    }

private var _Emergency_recording: ImageVector? = null

