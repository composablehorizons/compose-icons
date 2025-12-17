package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Groups: ImageVector
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
                    moveTo(12f, 12.75f)
                    curveToRelative(1.63f, 0f, 3.07f, 0.39f, 4.24f, 0.9f)
                    curveToRelative(1.08f, 0.48f, 1.76f, 1.56f, 1.76f, 2.73f)
                    lineTo(18f, 18f)
                    horizontalLineTo(6f)
                    lineToRelative(0f, -1.61f)
                    curveToRelative(0f, -1.18f, 0.68f, -2.26f, 1.76f, -2.73f)
                    curveTo(8.93f, 13.14f, 10.37f, 12.75f, 12f, 12.75f)
                    close()
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
                    moveTo(12f, 6f)
                    curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                    curveTo(9f, 7.34f, 10.34f, 6f, 12f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Groups!!
    }

private var _Groups: ImageVector? = null

