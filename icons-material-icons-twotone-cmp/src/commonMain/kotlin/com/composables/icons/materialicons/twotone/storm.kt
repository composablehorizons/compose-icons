package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Storm: ImageVector
    get() {
        if (_Storm != null) return _Storm!!
        
        _Storm = ImageVector.Builder(
            name = "storm",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(14f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.2f, 9f)
                        curveTo(15.54f, 6.13f, 11.86f, 5.15f, 9f, 6.8f)
                        curveToRelative(-2.67f, 1.54f, -3.7f, 4.84f, -2.5f, 7.6f)
                        curveToRelative(0.09f, 0.2f, 0.19f, 0.4f, 0.3f, 0.6f)
                        curveToRelative(1.66f, 2.87f, 5.33f, 3.85f, 8.2f, 2.2f)
                        curveToRelative(2.67f, -1.54f, 3.7f, -4.84f, 2.5f, -7.6f)
                        curveTo(17.41f, 9.4f, 17.31f, 9.2f, 17.2f, 9f)
                        close()
                        moveTo(12f, 16f)
                        curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                        reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                        reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                        reflectiveCurveTo(14.21f, 16f, 12f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 8f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        reflectiveCurveTo(14.21f, 8f, 12f, 8f)
                        close()
                        moveTo(12f, 14f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        reflectiveCurveTo(13.1f, 14f, 12f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.93f, 8f)
                        curveTo(16.72f, 4.18f, 11.82f, 2.87f, 8f, 5.07f)
                        curveToRelative(-1.41f, 0.82f, -2.48f, 2f, -3.16f, 3.37f)
                        curveTo(4.71f, 6.24f, 5.06f, 4.04f, 5.86f, 2f)
                        horizontalLineTo(3.74f)
                        curveTo(2.2f, 6.49f, 2.52f, 11.58f, 5.07f, 16f)
                        curveToRelative(1.1f, 1.91f, 2.88f, 3.19f, 4.86f, 3.72f)
                        curveToRelative(1.98f, 0.53f, 4.16f, 0.31f, 6.07f, -0.79f)
                        curveToRelative(1.41f, -0.82f, 2.48f, -2f, 3.16f, -3.37f)
                        curveToRelative(0.13f, 2.2f, -0.21f, 4.4f, -1.01f, 6.44f)
                        horizontalLineToRelative(2.11f)
                        curveTo(21.79f, 17.51f, 21.48f, 12.42f, 18.93f, 8f)
                        close()
                        moveTo(15f, 17.2f)
                        curveToRelative(-2.87f, 1.65f, -6.54f, 0.67f, -8.2f, -2.2f)
                        curveToRelative(-0.11f, -0.2f, -0.21f, -0.4f, -0.3f, -0.6f)
                        curveTo(5.3f, 11.64f, 6.33f, 8.34f, 9f, 6.8f)
                        curveToRelative(2.86f, -1.65f, 6.54f, -0.67f, 8.2f, 2.2f)
                        curveToRelative(0.11f, 0.2f, 0.21f, 0.4f, 0.3f, 0.6f)
                        curveTo(18.7f, 12.36f, 17.67f, 15.66f, 15f, 17.2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Storm!!
    }

private var _Storm: ImageVector? = null

