package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Church: ImageVector
    get() {
        if (_Church != null) return _Church!!
        
        _Church = ImageVector.Builder(
            name = "church",
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
                        moveTo(18f, 12.22f)
                        verticalLineToRelative(-1.99f)
                        curveToRelative(0f, -0.76f, -0.43f, -1.45f, -1.11f, -1.79f)
                        lineTo(13f, 6.5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(2f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        curveTo(9.45f, 3f, 9f, 3.45f, 9f, 4f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(1.5f)
                        lineTo(7.11f, 8.45f)
                        curveTo(6.43f, 8.79f, 6f, 9.48f, 6f, 10.24f)
                        verticalLineToRelative(1.99f)
                        lineToRelative(-2.81f, 1.25f)
                        curveTo(2.47f, 13.79f, 2f, 14.51f, 2f, 15.3f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6f)
                        lineToRelative(0f, -2.89f)
                        curveToRelative(0f, -1f, 0.68f, -1.92f, 1.66f, -2.08f)
                        curveTo(12.92f, 16.82f, 14f, 17.79f, 14f, 19f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(6f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4.7f)
                        curveToRelative(0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f)
                        lineTo(18f, 12.22f)
                        close()
                        moveTo(12f, 13.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(12.83f, 13.5f, 12f, 13.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Church!!
    }

private var _Church: ImageVector? = null

