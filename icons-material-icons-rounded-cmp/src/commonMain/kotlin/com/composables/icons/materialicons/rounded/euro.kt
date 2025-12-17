package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Euro: ImageVector
    get() {
        if (_Euro != null) return _Euro!!
        
        _Euro = ImageVector.Builder(
            name = "euro",
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
                group {
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15f, 18.5f)
                    curveToRelative(-2.51f, 0f, -4.68f, -1.42f, -5.76f, -3.5f)
                    horizontalLineToRelative(5.14f)
                    curveToRelative(0.38f, 0f, 0.73f, -0.21f, 0.89f, -0.55f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.33f, -0.66f, -0.15f, -1.45f, -0.89f, -1.45f)
                    horizontalLineToRelative(-5.8f)
                    curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1f)
                    reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1f)
                    horizontalLineToRelative(5.8f)
                    curveToRelative(0.38f, 0f, 0.73f, -0.21f, 0.89f, -0.55f)
                    lineToRelative(0f, 0f)
                    curveTo(15.61f, 9.78f, 15.13f, 9f, 14.38f, 9f)
                    horizontalLineTo(9.24f)
                    curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15f, 5.5f)
                    curveToRelative(1.25f, 0f, 2.42f, 0.36f, 3.42f, 0.97f)
                    curveToRelative(0.5f, 0.31f, 1.15f, 0.26f, 1.57f, -0.16f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.58f, -0.58f, 0.45f, -1.53f, -0.25f, -1.96f)
                    curveTo(18.36f, 3.5f, 16.73f, 3f, 15f, 3f)
                    curveToRelative(-3.92f, 0f, -7.24f, 2.51f, -8.48f, 6f)
                    horizontalLineToRelative(-2.9f)
                    curveTo(3.24f, 9f, 2.89f, 9.21f, 2.72f, 9.55f)
                    lineToRelative(0f, 0f)
                    curveTo(2.39f, 10.22f, 2.87f, 11f, 3.62f, 11f)
                    horizontalLineToRelative(2.44f)
                    curveTo(6.02f, 11.33f, 6f, 11.66f, 6f, 12f)
                    reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1f)
                    horizontalLineTo(3.62f)
                    curveToRelative(-0.38f, 0f, -0.73f, 0.21f, -0.89f, 0.55f)
                    lineToRelative(0f, 0f)
                    curveTo(2.39f, 14.22f, 2.87f, 15f, 3.62f, 15f)
                    horizontalLineToRelative(2.9f)
                    curveToRelative(1.24f, 3.49f, 4.56f, 6f, 8.48f, 6f)
                    curveToRelative(1.74f, 0f, 3.36f, -0.49f, 4.74f, -1.35f)
                    curveToRelative(0.69f, -0.43f, 0.82f, -1.39f, 0.24f, -1.97f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.42f, -0.42f, -1.07f, -0.47f, -1.57f, -0.15f)
                    curveTo(17.42f, 18.15f, 16.26f, 18.5f, 15f, 18.5f)
                    close()
                }
            }
        }.build()
        
        return _Euro!!
    }

private var _Euro: ImageVector? = null

