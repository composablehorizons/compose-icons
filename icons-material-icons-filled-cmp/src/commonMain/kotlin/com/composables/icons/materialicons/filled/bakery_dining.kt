package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bakery_dining: ImageVector
    get() {
        if (_Bakery_dining != null) return _Bakery_dining!!
        
        _Bakery_dining = ImageVector.Builder(
            name = "bakery_dining",
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
                    moveTo(19.28f, 16.34f)
                    curveTo(18.07f, 15.45f, 17.46f, 15f, 17.46f, 15f)
                    reflectiveCurveToRelative(0.32f, -0.59f, 0.96f, -1.78f)
                    curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0f)
                    lineToRelative(0.81f, 1.26f)
                    curveToRelative(0.19f, 0.3f, 0.21f, 0.68f, 0.06f, 1f)
                    lineToRelative(-0.22f, 0.47f)
                    curveTo(20.42f, 16.49f, 19.76f, 16.67f, 19.28f, 16.34f)
                    close()
                    moveTo(4.72f, 16.34f)
                    curveToRelative(-0.48f, 0.33f, -1.13f, 0.15f, -1.39f, -0.38f)
                    lineTo(3.1f, 15.49f)
                    curveToRelative(-0.15f, -0.32f, -0.13f, -0.7f, 0.06f, -1f)
                    lineToRelative(0.81f, -1.26f)
                    curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0f)
                    curveTo(6.22f, 14.41f, 6.54f, 15f, 6.54f, 15f)
                    reflectiveCurveTo(5.93f, 15.45f, 4.72f, 16.34f)
                    close()
                    moveTo(15.36f, 9.37f)
                    curveToRelative(0.09f, -0.68f, 0.73f, -1.06f, 1.27f, -0.75f)
                    lineToRelative(1.59f, 0.9f)
                    curveToRelative(0.46f, 0.26f, 0.63f, 0.91f, 0.36f, 1.41f)
                    lineTo(16.5f, 15f)
                    horizontalLineToRelative(-1.8f)
                    lineTo(15.36f, 9.37f)
                    close()
                    moveTo(8.63f, 9.37f)
                    lineTo(9.3f, 15f)
                    horizontalLineTo(7.5f)
                    lineToRelative(-2.09f, -4.08f)
                    curveToRelative(-0.27f, -0.5f, -0.1f, -1.15f, 0.36f, -1.41f)
                    lineToRelative(1.59f, -0.9f)
                    curveTo(7.89f, 8.31f, 8.54f, 8.69f, 8.63f, 9.37f)
                    close()
                    moveTo(13.8f, 15f)
                    horizontalLineToRelative(-3.6f)
                    lineTo(9.46f, 8.12f)
                    curveTo(9.39f, 7.53f, 9.81f, 7f, 10.34f, 7f)
                    horizontalLineToRelative(3.3f)
                    curveToRelative(0.53f, 0f, 0.94f, 0.53f, 0.88f, 1.12f)
                    lineTo(13.8f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Bakery_dining!!
    }

private var _Bakery_dining: ImageVector? = null

