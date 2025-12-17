package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Face_retouching_natural: ImageVector
    get() {
        if (_Face_retouching_natural != null) return _Face_retouching_natural!!
        
        _Face_retouching_natural = ImageVector.Builder(
            name = "face_retouching_natural",
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
                        moveTo(22.01f, 4.05f)
                        lineTo(20.6f, 3.4f)
                        lineToRelative(-0.65f, -1.41f)
                        curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                        lineTo(18.4f, 3.4f)
                        lineToRelative(-1.41f, 0.65f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineTo(18.4f, 5.6f)
                        lineToRelative(0.65f, 1.41f)
                        curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                        lineTo(20.6f, 5.6f)
                        lineToRelative(1.41f, -0.65f)
                        curveTo(22.4f, 4.78f, 22.4f, 4.22f, 22.01f, 4.05f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.25f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 9f, 14.25f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 7.75f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 10.25f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.25f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 15f, 14.25f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 13.75f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 16.25f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 8.8f)
                        curveToRelative(-0.78f, 0f, -1.49f, -0.46f, -1.82f, -1.17f)
                        lineToRelative(-0.41f, -0.9f)
                        lineToRelative(-0.9f, -0.41f)
                        curveTo(15.66f, 5.99f, 15.2f, 5.28f, 15.2f, 4.5f)
                        curveToRelative(0f, -0.66f, 0.34f, -1.26f, 0.87f, -1.63f)
                        curveTo(14.83f, 2.32f, 13.45f, 2f, 12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveToRelative(0f, -1.45f, -0.32f, -2.83f, -0.87f, -4.07f)
                        curveTo(20.76f, 8.46f, 20.16f, 8.8f, 19.5f, 8.8f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0f, -0.14f)
                        curveToRelative(2.6f, -0.98f, 4.69f, -2.99f, 5.74f, -5.55f)
                        curveTo(11.58f, 8.56f, 14.37f, 10f, 17.5f, 10f)
                        curveToRelative(0.75f, 0f, 1.47f, -0.09f, 2.17f, -0.24f)
                        curveTo(19.88f, 10.47f, 20f, 11.22f, 20f, 12f)
                        curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Face_retouching_natural!!
    }

private var _Face_retouching_natural: ImageVector? = null

