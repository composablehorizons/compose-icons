package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Assistant_direction: ImageVector
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
                        moveTo(13.5f, 10f)
                        horizontalLineTo(9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3.5f)
                        verticalLineToRelative(1.29f)
                        curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                        lineToRelative(2.29f, -2.29f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(-2.29f, -2.29f)
                        curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                        verticalLineTo(10f)
                        close()
                        moveTo(12f, 1f)
                        curveTo(5.9f, 1f, 1f, 5.9f, 1f, 12f)
                        reflectiveCurveToRelative(4.9f, 11f, 11f, 11f)
                        reflectiveCurveToRelative(11f, -4.9f, 11f, -11f)
                        reflectiveCurveTo(18.1f, 1f, 12f, 1f)
                        close()
                        moveTo(19.73f, 12.58f)
                        lineToRelative(-7.19f, 7.22f)
                        curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0f)
                        lineTo(4.2f, 12.58f)
                        curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0f, -1.16f)
                        lineToRelative(7.19f, -7.22f)
                        curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0f)
                        lineToRelative(7.19f, 7.22f)
                        curveTo(20.09f, 11.69f, 20.09f, 12.22f, 19.73f, 12.58f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Assistant_direction!!
    }

private var _Assistant_direction: ImageVector? = null

