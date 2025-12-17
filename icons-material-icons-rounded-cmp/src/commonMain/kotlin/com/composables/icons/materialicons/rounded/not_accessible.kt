package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Not_accessible: ImageVector
    get() {
        if (_Not_accessible != null) return _Not_accessible!!
        
        _Not_accessible = ImageVector.Builder(
            name = "not_accessible",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveTo(10.9f, 2f, 12f, 2f)
                    close()
                    moveTo(10f, 20f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    curveToRelative(0f, -1.31f, 0.84f, -2.41f, 2f, -2.83f)
                    verticalLineTo(12.1f)
                    curveToRelative(-2.28f, 0.46f, -4f, 2.48f, -4f, 4.9f)
                    curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                    curveToRelative(2.42f, 0f, 4.44f, -1.72f, 4.9f, -4f)
                    horizontalLineToRelative(-2.07f)
                    curveTo(12.42f, 19.16f, 11.31f, 20f, 10f, 20f)
                    close()
                    moveTo(20.49f, 20.49f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(7.9f, 7.9f)
                    verticalLineTo(15f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(2.17f)
                    lineToRelative(4.9f, 4.9f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                    close()
                    moveTo(18.16f, 10.93f)
                    curveToRelative(-1.25f, -0.21f, -2.43f, -0.88f, -3.23f, -1.76f)
                    lineToRelative(-1.29f, -1.43f)
                    curveTo(13.4f, 7.5f, 13.2f, 7.38f, 13.01f, 7.28f)
                    curveToRelative(-0.36f, -0.19f, -0.72f, -0.3f, -1.2f, -0.26f)
                    curveToRelative(-0.49f, 0.04f, -0.91f, 0.27f, -1.23f, 0.61f)
                    lineTo(14f, 11.05f)
                    curveToRelative(1f, 0.83f, 2.4f, 1.54f, 3.8f, 1.82f)
                    curveTo(18.42f, 13f, 19f, 12.53f, 19f, 11.9f)
                    curveTo(19f, 11.42f, 18.64f, 11.01f, 18.16f, 10.93f)
                    close()
                }
            }
        }.build()
        
        return _Not_accessible!!
    }

private var _Not_accessible: ImageVector? = null

