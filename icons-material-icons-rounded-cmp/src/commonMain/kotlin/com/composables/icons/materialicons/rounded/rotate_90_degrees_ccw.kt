package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rotate_90_degrees_ccw: ImageVector
    get() {
        if (_Rotate_90_degrees_ccw != null) return _Rotate_90_degrees_ccw!!
        
        _Rotate_90_degrees_ccw = ImageVector.Builder(
            name = "rotate_90_degrees_ccw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.93f, 7.83f)
                lineToRelative(-3.65f, 3.66f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                lineToRelative(3.66f, -3.65f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineTo(8.76f, 7.82f)
                curveToRelative(-0.79f, -0.78f, -2.05f, -0.78f, -2.83f, 0.01f)
                close()
                moveTo(4.4f, 12.19f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0f)
                lineToRelative(2.24f, 2.24f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0f)
                lineTo(4.4f, 13.61f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0f, -1.42f)
                close()
                moveToRelative(14.96f, -5.55f)
                curveTo(17.61f, 4.88f, 15.3f, 4f, 13f, 4f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(9.47f, 4.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.83f, 1.83f)
                curveToRelative(0.62f, 0.63f, 1.7f, 0.19f, 1.7f, -0.7f)
                verticalLineTo(6f)
                curveToRelative(2.02f, 0f, 4.03f, 0.86f, 5.45f, 2.61f)
                curveToRelative(2.05f, 2.52f, 2.05f, 6.27f, 0f, 8.79f)
                curveTo(17.03f, 19.14f, 15.02f, 20f, 13f, 20f)
                curveToRelative(-0.78f, 0f, -1.55f, -0.13f, -2.29f, -0.39f)
                curveToRelative(-0.36f, -0.12f, -0.75f, -0.01f, -1.02f, 0.26f)
                curveToRelative(-0.5f, 0.5f, -0.34f, 1.39f, 0.34f, 1.62f)
                curveToRelative(0.96f, 0.34f, 1.96f, 0.51f, 2.97f, 0.51f)
                curveToRelative(2.3f, 0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0f, -12.72f)
                close()
            }
        }.build()
        
        return _Rotate_90_degrees_ccw!!
    }

private var _Rotate_90_degrees_ccw: ImageVector? = null

