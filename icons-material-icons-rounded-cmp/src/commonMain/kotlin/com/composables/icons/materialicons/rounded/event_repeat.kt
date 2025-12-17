package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Event_repeat: ImageVector
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
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(8f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveTo(6f, 2.45f, 6f, 3f)
                    verticalLineToRelative(1f)
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
                    moveTo(15.13f, 20f)
                    curveToRelative(-0.55f, 0f, -0.91f, 0.56f, -0.68f, 1.06f)
                    curveTo(15.23f, 22.79f, 16.97f, 24f, 19f, 24f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                    curveToRelative(-1.36f, 0f, -2.6f, 0.55f, -3.5f, 1.43f)
                    lineToRelative(0f, -0.68f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    horizontalLineToRelative(0f)
                    curveTo(14.34f, 14f, 14f, 14.34f, 14f, 14.75f)
                    verticalLineTo(17f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.25f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    lineToRelative(-0.7f, 0f)
                    curveToRelative(0.63f, -0.62f, 1.5f, -1f, 2.45f, -1f)
                    curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                    reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                    curveToRelative(-1.42f, 0f, -2.64f, -0.85f, -3.19f, -2.06f)
                    curveTo(15.69f, 20.17f, 15.42f, 20f, 15.13f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Event_repeat!!
    }

private var _Event_repeat: ImageVector? = null

