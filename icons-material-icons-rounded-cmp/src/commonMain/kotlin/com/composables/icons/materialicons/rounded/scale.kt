package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
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
                    moveTo(16f, 21f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    lineToRelative(3.43f, 0f)
                    curveToRelative(0.87f, 0f, 1.58f, -0.75f, 1.5f, -1.62f)
                    curveTo(21.34f, 14.18f, 17.4f, 11.68f, 14f, 11f)
                    verticalLineTo(8f)
                    curveToRelative(3.31f, -0.42f, 6.03f, -1.86f, 7.27f, -3.73f)
                    curveTo(21.92f, 3.3f, 21.15f, 2f, 19.98f, 2f)
                    horizontalLineTo(4.02f)
                    curveTo(2.85f, 2f, 2.08f, 3.3f, 2.73f, 4.27f)
                    curveTo(3.97f, 6.14f, 6.69f, 7.58f, 10f, 8f)
                    lineToRelative(0f, 3f)
                    curveToRelative(-3.4f, 0.68f, -7.34f, 3.18f, -7.93f, 9.38f)
                    curveTo(1.99f, 21.25f, 2.7f, 22f, 3.57f, 22f)
                    lineTo(7f, 22f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(4.13f)
                    curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f)
                    reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f)
                    horizontalLineTo(17f)
                    curveTo(16.45f, 20f, 16f, 20.45f, 16f, 21f)
                    close()
                    moveTo(11.5f, 21.94f)
                    curveToRelative(-0.7f, -0.17f, -1.27f, -0.74f, -1.44f, -1.44f)
                    curveToRelative(-0.18f, -0.74f, 0.06f, -1.44f, 0.53f, -1.91f)
                    curveToRelative(0.55f, -0.55f, 2.91f, -1.57f, 4.33f, -2.15f)
                    curveToRelative(0.41f, -0.17f, 0.82f, 0.24f, 0.65f, 0.65f)
                    curveToRelative(-0.58f, 1.42f, -1.6f, 3.78f, -2.15f, 4.33f)
                    curveTo(12.95f, 21.88f, 12.25f, 22.12f, 11.5f, 21.94f)
                    close()
                }
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

