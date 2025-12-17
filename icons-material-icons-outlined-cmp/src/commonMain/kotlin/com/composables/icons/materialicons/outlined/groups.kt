package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Groups: ImageVector
    get() {
        if (_Groups != null) return _Groups!!
        
        _Groups = ImageVector.Builder(
            name = "groups",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 13f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    curveTo(2f, 12.1f, 2.9f, 13f, 4f, 13f)
                    close()
                    moveTo(5.13f, 14.1f)
                    curveTo(4.76f, 14.04f, 4.39f, 14f, 4f, 14f)
                    curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                    curveTo(0.48f, 14.9f, 0f, 15.62f, 0f, 16.43f)
                    verticalLineTo(18f)
                    lineToRelative(4.5f, 0f)
                    verticalLineToRelative(-1.61f)
                    curveTo(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f)
                    close()
                    moveTo(20f, 13f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    curveTo(18f, 12.1f, 18.9f, 13f, 20f, 13f)
                    close()
                    moveTo(24f, 16.43f)
                    curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                    curveTo(21.93f, 14.21f, 20.99f, 14f, 20f, 14f)
                    curveToRelative(-0.39f, 0f, -0.76f, 0.04f, -1.13f, 0.1f)
                    curveToRelative(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f)
                    verticalLineTo(18f)
                    lineToRelative(4.5f, 0f)
                    verticalLineTo(16.43f)
                    close()
                    moveTo(16.24f, 13.65f)
                    curveToRelative(-1.17f, -0.52f, -2.61f, -0.9f, -4.24f, -0.9f)
                    curveToRelative(-1.63f, 0f, -3.07f, 0.39f, -4.24f, 0.9f)
                    curveTo(6.68f, 14.13f, 6f, 15.21f, 6f, 16.39f)
                    verticalLineTo(18f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-1.61f)
                    curveTo(18f, 15.21f, 17.32f, 14.13f, 16.24f, 13.65f)
                    close()
                    moveTo(8.07f, 16f)
                    curveToRelative(0.09f, -0.23f, 0.13f, -0.39f, 0.91f, -0.69f)
                    curveToRelative(0.97f, -0.38f, 1.99f, -0.56f, 3.02f, -0.56f)
                    reflectiveCurveToRelative(2.05f, 0.18f, 3.02f, 0.56f)
                    curveToRelative(0.77f, 0.3f, 0.81f, 0.46f, 0.91f, 0.69f)
                    horizontalLineTo(8.07f)
                    close()
                    moveTo(12f, 8f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveTo(11.45f, 8f, 12f, 8f)
                    moveTo(12f, 6f)
                    curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    curveTo(15f, 7.34f, 13.66f, 6f, 12f, 6f)
                    lineTo(12f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Groups!!
    }

private var _Groups: ImageVector? = null

