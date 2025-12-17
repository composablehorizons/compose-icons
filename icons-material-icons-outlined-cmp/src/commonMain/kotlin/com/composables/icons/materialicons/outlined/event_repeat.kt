package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Event_repeat: ImageVector
    get() {
        if (_Event_repeat != null) return _Event_repeat!!
        
        _Event_repeat = ImageVector.Builder(
            name = "event_repeat",
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
                    moveTo(21f, 12f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineTo(2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 4f, 3f, 4.9f, 3f, 6f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(5f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(19f, 8f)
                    horizontalLineTo(5f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(8f)
                    close()
                    moveTo(15.64f, 20f)
                    curveToRelative(0.43f, 1.45f, 1.77f, 2.5f, 3.36f, 2.5f)
                    curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                    reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                    curveToRelative(-0.95f, 0f, -1.82f, 0.38f, -2.45f, 1f)
                    lineToRelative(1.45f, 0f)
                    verticalLineTo(18f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1.5f)
                    lineToRelative(0f, 1.43f)
                    curveTo(16.4f, 14.55f, 17.64f, 14f, 19f, 14f)
                    curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                    reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                    curveToRelative(-2.42f, 0f, -4.44f, -1.72f, -4.9f, -4f)
                    lineTo(15.64f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Event_repeat!!
    }

private var _Event_repeat: ImageVector? = null

