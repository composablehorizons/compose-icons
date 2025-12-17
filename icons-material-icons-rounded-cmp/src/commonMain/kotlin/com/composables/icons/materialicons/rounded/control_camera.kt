package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Control_camera: ImageVector
    get() {
        if (_Control_camera != null) return _Control_camera!!
        
        _Control_camera = ImageVector.Builder(
            name = "control_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.65f, 9.35f)
                lineTo(2.7f, 11.3f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.95f, 1.95f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0f)
                curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0f, -1.76f)
                lineToRelative(-0.88f, -0.9f)
                lineToRelative(0.88f, -0.89f)
                curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0f, -1.76f)
                reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0f)
                close()
                moveToRelative(12.93f, 0f)
                curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0f, 1.76f)
                lineToRelative(0.88f, 0.89f)
                lineToRelative(-0.88f, 0.89f)
                curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0f, 1.76f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0f)
                lineToRelative(1.95f, -1.95f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.95f, -1.95f)
                curveToRelative(-0.49f, -0.48f, -1.29f, -0.48f, -1.77f, 0.01f)
                close()
                moveTo(12f, 18.46f)
                lineToRelative(-0.89f, -0.88f)
                curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0f)
                curveToRelative(-0.49f, 0.49f, -0.49f, 1.28f, 0f, 1.77f)
                lineToRelative(1.95f, 1.95f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.95f, -1.95f)
                curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0f, -1.77f)
                curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0f)
                lineToRelative(-0.9f, 0.88f)
                close()
                moveTo(9.35f, 6.42f)
                curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0f)
                lineToRelative(0.89f, -0.88f)
                lineToRelative(0.89f, 0.88f)
                curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0f)
                curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0f, -1.77f)
                lineTo(12.7f, 2.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(9.35f, 4.65f)
                curveToRelative(-0.49f, 0.49f, -0.49f, 1.29f, 0f, 1.77f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
        }.build()
        
        return _Control_camera!!
    }

private var _Control_camera: ImageVector? = null

