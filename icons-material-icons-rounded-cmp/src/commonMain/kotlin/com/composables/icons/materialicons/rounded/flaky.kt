package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flaky: ImageVector
    get() {
        if (_Flaky != null) return _Flaky!!
        
        _Flaky = ImageVector.Builder(
            name = "flaky",
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
                    moveTo(12.16f, 15.72f)
                    curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0f, -1.06f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                    lineToRelative(0.82f, 0.82f)
                    lineToRelative(1.96f, -1.96f)
                    curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                    lineToRelative(-2.65f, 2.65f)
                    curveToRelative(-0.19f, 0.19f, -0.51f, 0.2f, -0.7f, 0f)
                    lineTo(12.16f, 15.72f)
                    close()
                    moveTo(12f, 2f)
                    curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                    reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                    reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                    close()
                    moveTo(7.87f, 6.81f)
                    lineToRelative(0.88f, 0.88f)
                    lineToRelative(0.88f, -0.88f)
                    curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                    lineTo(9.81f, 8.75f)
                    lineToRelative(0.88f, 0.88f)
                    curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0f)
                    lineTo(8.75f, 9.81f)
                    lineToRelative(-0.88f, 0.88f)
                    curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0f, -1.06f)
                    lineToRelative(0.88f, -0.88f)
                    lineTo(6.81f, 7.87f)
                    curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0f, -1.06f)
                    lineToRelative(0f, 0f)
                    curveTo(7.1f, 6.51f, 7.57f, 6.51f, 7.87f, 6.81f)
                    close()
                    moveTo(12f, 20f)
                    curveToRelative(-2.2f, 0f, -4.2f, -0.9f, -5.7f, -2.3f)
                    lineTo(17.7f, 6.3f)
                    curveTo(19.1f, 7.8f, 20f, 9.8f, 20f, 12f)
                    curveTo(20f, 16.4f, 16.4f, 20f, 12f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Flaky!!
    }

private var _Flaky: ImageVector? = null

