package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Assistant_direction: ImageVector
    get() {
        if (_Assistant_direction != null) return _Assistant_direction!!
        
        _Assistant_direction = ImageVector.Builder(
            name = "assistant_direction",
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
                        moveTo(12f, 3f)
                        curveToRelative(-4.99f, 0f, -9f, 4.01f, -9f, 9f)
                        reflectiveCurveToRelative(4.01f, 9f, 9f, 9f)
                        reflectiveCurveToRelative(9f, -4.01f, 9f, -9f)
                        reflectiveCurveTo(16.99f, 3f, 12f, 3f)
                        close()
                        moveTo(12.54f, 19.8f)
                        curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0f)
                        lineTo(4.2f, 12.58f)
                        curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0f, -1.16f)
                        lineToRelative(7.19f, -7.22f)
                        curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0f)
                        lineToRelative(7.19f, 7.22f)
                        curveToRelative(0.36f, 0.27f, 0.36f, 0.8f, 0f, 1.16f)
                        lineTo(12.54f, 19.8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 1f)
                        curveTo(5.9f, 1f, 1f, 5.9f, 1f, 12f)
                        reflectiveCurveToRelative(4.9f, 11f, 11f, 11f)
                        reflectiveCurveToRelative(11f, -4.9f, 11f, -11f)
                        reflectiveCurveTo(18.1f, 1f, 12f, 1f)
                        close()
                        moveTo(12f, 21f)
                        curveToRelative(-4.99f, 0f, -9f, -4.01f, -9f, -9f)
                        reflectiveCurveToRelative(4.01f, -9f, 9f, -9f)
                        reflectiveCurveToRelative(9f, 4.01f, 9f, 9f)
                        reflectiveCurveTo(16.99f, 21f, 12f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.73f, 11.42f)
                        lineTo(12.54f, 4.2f)
                        curveToRelative(-0.36f, -0.27f, -0.8f, -0.27f, -1.15f, 0f)
                        lineTo(4.2f, 11.42f)
                        curveToRelative(-0.27f, 0.36f, -0.27f, 0.8f, 0f, 1.16f)
                        lineToRelative(7.19f, 7.22f)
                        curveToRelative(0.36f, 0.27f, 0.8f, 0.27f, 1.15f, 0f)
                        lineToRelative(7.19f, -7.22f)
                        curveTo(20.09f, 12.22f, 20.09f, 11.69f, 19.73f, 11.42f)
                        close()
                        moveTo(13.5f, 14.5f)
                        verticalLineTo(12f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.6f, 0.4f, -1f, 1f, -1f)
                        horizontalLineToRelative(4.5f)
                        verticalLineTo(7.5f)
                        lineTo(17f, 11f)
                        lineTo(13.5f, 14.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Assistant_direction!!
    }

private var _Assistant_direction: ImageVector? = null

