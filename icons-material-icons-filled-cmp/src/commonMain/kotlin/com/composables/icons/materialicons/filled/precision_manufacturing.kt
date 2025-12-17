package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Precision_manufacturing: ImageVector
    get() {
        if (_Precision_manufacturing != null) return _Precision_manufacturing!!
        
        _Precision_manufacturing = ImageVector.Builder(
            name = "precision_manufacturing",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19.93f, 8.21f)
                            lineToRelative(-3.6f, 1.68f)
                            lineTo(14f, 7.7f)
                            verticalLineTo(6.3f)
                            lineToRelative(2.33f, -2.19f)
                            lineToRelative(3.6f, 1.68f)
                            curveToRelative(0.38f, 0.18f, 0.82f, 0.01f, 1f, -0.36f)
                            curveToRelative(0.18f, -0.38f, 0.01f, -0.82f, -0.36f, -1f)
                            lineTo(16.65f, 2.6f)
                            curveToRelative(-0.38f, -0.18f, -0.83f, -0.1f, -1.13f, 0.2f)
                            lineToRelative(-1.74f, 1.6f)
                            curveTo(13.6f, 4.16f, 13.32f, 4f, 13f, 4f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(1f)
                            horizontalLineTo(8.82f)
                            curveTo(8.34f, 4.65f, 6.98f, 3.73f, 5.4f, 4.07f)
                            curveTo(4.24f, 4.32f, 3.25f, 5.32f, 3.04f, 6.5f)
                            curveTo(2.82f, 7.82f, 3.5f, 8.97f, 4.52f, 9.58f)
                            lineTo(7.08f, 18f)
                            horizontalLineTo(4f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(13f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(-3.62f)
                            lineTo(8.41f, 8.77f)
                            curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8f)
                            horizontalLineTo(12f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            curveToRelative(0.32f, 0f, 0.6f, -0.16f, 0.78f, -0.4f)
                            lineToRelative(1.74f, 1.6f)
                            curveToRelative(0.3f, 0.3f, 0.75f, 0.38f, 1.13f, 0.2f)
                            lineToRelative(3.92f, -1.83f)
                            curveToRelative(0.38f, -0.18f, 0.54f, -0.62f, 0.36f, -1f)
                            curveTo(20.75f, 8.2f, 20.31f, 8.03f, 19.93f, 8.21f)
                            close()
                            moveTo(6f, 8f)
                            curveTo(5.45f, 8f, 5f, 7.55f, 5f, 7f)
                            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                            reflectiveCurveTo(6.55f, 8f, 6f, 8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Precision_manufacturing!!
    }

private var _Precision_manufacturing: ImageVector? = null

