package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Face_retouching_natural: ImageVector
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
                        moveTo(10.66f, 4.12f)
                        curveToRelative(2.55f, 4.23f, 7.03f, 3.87f, 7.18f, 3.86f)
                        lineToRelative(-0.57f, -1.25f)
                        lineTo(12.4f, 4.5f)
                        lineToRelative(0.85f, -0.39f)
                        curveTo(12.84f, 4.04f, 12.43f, 4f, 12f, 4f)
                        curveTo(11.54f, 4f, 11.09f, 4.05f, 10.66f, 4.12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.08f, 5.03f)
                        curveTo(6.37f, 6f, 5.05f, 7.58f, 4.42f, 9.47f)
                        curveTo(6.13f, 8.5f, 7.45f, 6.92f, 8.08f, 5.03f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.89f, 10.75f)
                        curveTo(19.96f, 11.16f, 20f, 11.57f, 20f, 12f)
                        curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                        reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0f, -0.14f)
                        curveToRelative(2.6f, -0.98f, 4.69f, -2.99f, 5.74f, -5.55f)
                        curveToRelative(3.38f, 4.14f, 7.97f, 3.73f, 8.99f, 3.61f)
                        lineToRelative(-0.89f, -1.93f)
                        curveToRelative(-0.13f, 0.01f, -4.62f, 0.38f, -7.18f, -3.86f)
                        curveToRelative(1.01f, -0.16f, 1.71f, -0.15f, 2.59f, -0.01f)
                        lineToRelative(2.12f, -0.97f)
                        lineToRelative(0.64f, -0.29f)
                        curveTo(14.78f, 2.3f, 13.43f, 2f, 12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveToRelative(0f, -1.43f, -0.3f, -2.78f, -0.84f, -4.01f)
                        lineTo(19.89f, 10.75f)
                        close()
                        moveTo(8.08f, 5.03f)
                        curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                        curveTo(5.05f, 7.58f, 6.37f, 6f, 8.08f, 5.03f)
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
                        moveTo(20.6f, 3.4f)
                        lineTo(19.5f, 1f)
                        lineTo(18.4f, 3.4f)
                        lineTo(16f, 4.5f)
                        lineTo(18.4f, 5.6f)
                        lineTo(19.5f, 8f)
                        lineTo(20.6f, 5.6f)
                        lineTo(23f, 4.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Face_retouching_natural!!
    }

private var _Face_retouching_natural: ImageVector? = null

