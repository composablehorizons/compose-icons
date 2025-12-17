package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Perm_camera_mic: ImageVector
    get() {
        if (_Perm_camera_mic != null) return _Perm_camera_mic!!
        
        _Perm_camera_mic = ImageVector.Builder(
            name = "perm_camera_mic",
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
                moveTo(20f, 5f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1.24f, -1.35f)
                curveToRelative(-0.37f, -0.41f, -0.91f, -0.65f, -1.47f, -0.65f)
                horizontalLineTo(9.88f)
                curveToRelative(-0.56f, 0f, -1.1f, 0.24f, -1.48f, 0.65f)
                lineTo(7.17f, 5f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.09f)
                curveToRelative(-2.45f, -0.42f, -4.41f, -2.32f, -4.89f, -4.75f)
                curveToRelative(-0.12f, -0.61f, 0.38f, -1.16f, 0.99f, -1.16f)
                curveToRelative(0.49f, 0f, 0.88f, 0.35f, 0.98f, 0.83f)
                curveTo(8.47f, 15.64f, 10.07f, 17f, 12f, 17f)
                reflectiveCurveToRelative(3.53f, -1.36f, 3.91f, -3.17f)
                curveToRelative(0.1f, -0.48f, 0.5f, -0.83f, 0.98f, -0.83f)
                curveToRelative(0.61f, 0f, 1.11f, 0.55f, 0.99f, 1.16f)
                curveToRelative(-0.48f, 2.43f, -2.44f, 4.34f, -4.89f, 4.75f)
                verticalLineTo(21f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7f)
                curveTo(22f, 5.9f, 21.1f, 5f, 20f, 5f)
                close()
                moveToRelative(-6f, 8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Perm_camera_mic!!
    }

private var _Perm_camera_mic: ImageVector? = null

