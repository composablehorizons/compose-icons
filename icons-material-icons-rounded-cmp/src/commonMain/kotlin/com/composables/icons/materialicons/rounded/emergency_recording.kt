package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emergency_recording: ImageVector
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
                    lineToRelative(3.15f, 3.13f)
                    curveTo(21.46f, 16.97f, 22f, 16.74f, 22f, 16.3f)
                    verticalLineTo(7.7f)
                    curveToRelative(0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f)
                    lineTo(18f, 10.48f)
                    close()
                    moveTo(14.5f, 14.6f)
                    curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f)
                    lineTo(11f, 13.73f)
                    verticalLineTo(16f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-2.27f)
                    lineToRelative(-2.13f, 1.23f)
                    curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.37f)
                    curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f)
                    lineTo(8f, 12f)
                    lineToRelative(-2.13f, -1.23f)
                    curveTo(5.39f, 10.49f, 5.22f, 9.88f, 5.5f, 9.4f)
                    curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f)
                    lineTo(9f, 10.27f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(2.27f)
                    lineToRelative(2.13f, -1.23f)
                    curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f)
                    curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f)
                    lineTo(12f, 12f)
                    lineToRelative(2.13f, 1.23f)
                    curveTo(14.61f, 13.51f, 14.78f, 14.12f, 14.5f, 14.6f)
                    close()
                }
            }
        }.build()
        
        return _Emergency_recording!!
    }

private var _Emergency_recording: ImageVector? = null

