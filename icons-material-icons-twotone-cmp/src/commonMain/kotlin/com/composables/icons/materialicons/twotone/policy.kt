package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Policy: ImageVector
    get() {
        if (_Policy != null) return _Policy!!
        
        _Policy = ImageVector.Builder(
            name = "policy",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 6.3f)
                        verticalLineTo(11f)
                        curveToRelative(0f, 4.52f, 2.98f, 8.69f, 7f, 9.93f)
                        curveToRelative(1.74f, -0.53f, 3.28f, -1.62f, 4.47f, -3.04f)
                        lineToRelative(-1.72f, -1.72f)
                        curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f)
                        curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                        curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0f)
                        curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f)
                        lineToRelative(1.45f, 1.45f)
                        curveTo(18.49f, 14.65f, 19f, 12.85f, 19f, 11f)
                        verticalLineTo(6.3f)
                        lineToRelative(-7f, -3.11f)
                        lineTo(5f, 6.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 1f)
                        lineTo(3f, 5f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                        curveToRelative(0.65f, -0.16f, 1.27f, -0.38f, 1.87f, -0.65f)
                        curveToRelative(1.8f, -0.82f, 3.36f, -2.13f, 4.57f, -3.74f)
                        curveTo(20.04f, 16.46f, 21f, 13.77f, 21f, 11f)
                        verticalLineTo(5f)
                        lineTo(12f, 1f)
                        close()
                        moveTo(19f, 11f)
                        curveToRelative(0f, 1.85f, -0.51f, 3.65f, -1.38f, 5.21f)
                        lineToRelative(-1.45f, -1.45f)
                        curveToRelative(1.29f, -1.94f, 1.07f, -4.58f, -0.64f, -6.29f)
                        curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0f)
                        curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                        curveToRelative(1.71f, 1.71f, 4.35f, 1.92f, 6.29f, 0.64f)
                        lineToRelative(1.72f, 1.72f)
                        curveToRelative(-1.19f, 1.42f, -2.73f, 2.51f, -4.47f, 3.04f)
                        curveTo(7.98f, 19.69f, 5f, 15.52f, 5f, 11f)
                        verticalLineTo(6.3f)
                        lineToRelative(7f, -3.11f)
                        lineToRelative(7f, 3.11f)
                        verticalLineTo(11f)
                        close()
                        moveTo(15f, 12f)
                        curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                        reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                        reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                        reflectiveCurveTo(15f, 10.34f, 15f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Policy!!
    }

private var _Policy: ImageVector? = null

