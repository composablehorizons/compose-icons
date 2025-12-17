package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Manage_history: ImageVector
    get() {
        if (_Manage_history != null) return _Manage_history!!
        
        _Manage_history = ImageVector.Builder(
            name = "manage_history",
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
                    moveTo(22.69f, 18.37f)
                    lineToRelative(1.14f, -1f)
                    lineToRelative(-1f, -1.73f)
                    lineToRelative(-1.45f, 0.49f)
                    curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                    lineTo(20f, 14f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(-0.3f, 1.49f)
                    curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                    lineToRelative(-1.45f, -0.49f)
                    lineToRelative(-1f, 1.73f)
                    lineToRelative(1.14f, 1f)
                    curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0f, 1.26f)
                    lineToRelative(-1.14f, 1f)
                    lineToRelative(1f, 1.73f)
                    lineToRelative(1.45f, -0.49f)
                    curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                    lineTo(18f, 24f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0.3f, -1.49f)
                    curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                    lineToRelative(1.45f, 0.49f)
                    lineToRelative(1f, -1.73f)
                    lineToRelative(-1.14f, -1f)
                    curveTo(22.77f, 19.13f, 22.77f, 18.87f, 22.69f, 18.37f)
                    close()
                    moveTo(19f, 21f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(20.1f, 21f, 19f, 21f)
                    close()
                    moveTo(11f, 7f)
                    verticalLineToRelative(5.41f)
                    lineToRelative(2.36f, 2.36f)
                    lineToRelative(1.04f, -1.79f)
                    lineTo(13f, 11.59f)
                    verticalLineTo(7f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(21f, 12f)
                    curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                    curveTo(9.17f, 3f, 6.65f, 4.32f, 5f, 6.36f)
                    verticalLineTo(4f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(8f)
                    horizontalLineTo(6.26f)
                    curveTo(7.53f, 6.19f, 9.63f, 5f, 12f, 5f)
                    curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(10.86f, 18.91f)
                    curveTo(7.87f, 18.42f, 5.51f, 16.01f, 5.08f, 13f)
                    horizontalLineTo(3.06f)
                    curveToRelative(0.5f, 4.5f, 4.31f, 8f, 8.94f, 8f)
                    curveToRelative(0.02f, 0f, 0.05f, 0f, 0.07f, 0f)
                    lineTo(10.86f, 18.91f)
                    close()
                }
            }
        }.build()
        
        return _Manage_history!!
    }

private var _Manage_history: ImageVector? = null

