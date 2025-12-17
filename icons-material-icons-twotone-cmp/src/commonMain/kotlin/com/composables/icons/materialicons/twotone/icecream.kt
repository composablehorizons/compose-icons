package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Icecream: ImageVector
    get() {
        if (_Icecream != null) return _Icecream!!
        
        _Icecream = ImageVector.Builder(
            name = "icecream",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.32f, 13.42f)
                        lineToRelative(2.73f, 5.21f)
                        lineToRelative(2.67f, -5.23f)
                        curveTo(13.88f, 13.79f, 12.95f, 14f, 12f, 14f)
                        curveTo(11.06f, 14f, 10.15f, 13.79f, 9.32f, 13.42f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.31f, 8.02f)
                        lineTo(16.54f, 7.9f)
                        lineToRelative(-0.06f, -0.78f)
                        curveTo(16.29f, 4.8f, 14.34f, 3f, 12f, 3f)
                        reflectiveCurveTo(7.71f, 4.8f, 7.51f, 7.12f)
                        lineTo(7.45f, 7.9f)
                        lineTo(6.68f, 8.03f)
                        curveTo(5.72f, 8.18f, 5f, 9.02f, 5f, 10f)
                        curveToRelative(0f, 1.11f, 0.9f, 2f, 2f, 2f)
                        curveToRelative(0.52f, 0f, 1.01f, -0.21f, 1.39f, -0.56f)
                        lineToRelative(0.56f, -0.54f)
                        lineToRelative(0.66f, 0.41f)
                        curveTo(10.32f, 11.76f, 11.14f, 12f, 12f, 12f)
                        reflectiveCurveToRelative(1.68f, -0.24f, 2.39f, -0.68f)
                        lineToRelative(0.66f, -0.42f)
                        lineToRelative(0.56f, 0.54f)
                        curveTo(15.99f, 11.8f, 16.48f, 12f, 17f, 12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveTo(19f, 9.01f, 18.28f, 8.18f, 17.31f, 8.02f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.38f, 6.24f)
                        curveTo(17.79f, 3.24f, 15.14f, 1f, 12f, 1f)
                        reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f)
                        curveTo(4.08f, 6.81f, 3f, 8.29f, 3f, 10f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(0.12f, 0f, 0.23f, -0.02f, 0.34f, -0.02f)
                        lineTo(12.07f, 23f)
                        lineToRelative(4.61f, -9.03f)
                        curveTo(16.79f, 13.98f, 16.89f, 14f, 17f, 14f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveTo(21f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f)
                        close()
                        moveTo(12.05f, 18.63f)
                        lineToRelative(-2.73f, -5.21f)
                        curveTo(10.15f, 13.79f, 11.06f, 14f, 12f, 14f)
                        curveToRelative(0.95f, 0f, 1.88f, -0.21f, 2.72f, -0.6f)
                        lineTo(12.05f, 18.63f)
                        close()
                        moveTo(17f, 12f)
                        curveToRelative(-0.52f, 0f, -1.01f, -0.2f, -1.39f, -0.56f)
                        lineToRelative(-0.56f, -0.54f)
                        lineToRelative(-0.66f, 0.42f)
                        curveTo(13.68f, 11.76f, 12.86f, 12f, 12f, 12f)
                        reflectiveCurveToRelative(-1.68f, -0.24f, -2.39f, -0.69f)
                        lineTo(8.95f, 10.9f)
                        lineToRelative(-0.56f, 0.54f)
                        curveTo(8.01f, 11.79f, 7.52f, 12f, 7f, 12f)
                        curveToRelative(-1.1f, 0f, -2f, -0.89f, -2f, -2f)
                        curveToRelative(0f, -0.98f, 0.72f, -1.82f, 1.68f, -1.97f)
                        lineTo(7.45f, 7.9f)
                        lineToRelative(0.06f, -0.78f)
                        curveTo(7.71f, 4.8f, 9.66f, 3f, 12f, 3f)
                        reflectiveCurveToRelative(4.29f, 1.8f, 4.48f, 4.12f)
                        lineToRelative(0.06f, 0.78f)
                        lineToRelative(0.77f, 0.12f)
                        curveTo(18.28f, 8.18f, 19f, 9.01f, 19f, 10f)
                        curveTo(19f, 11.1f, 18.1f, 12f, 17f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Icecream!!
    }

private var _Icecream: ImageVector? = null

