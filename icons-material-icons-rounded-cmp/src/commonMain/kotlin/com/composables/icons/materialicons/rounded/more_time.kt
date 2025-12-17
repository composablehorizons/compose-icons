package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.More_time: ImageVector
    get() {
        if (_More_time != null) return _More_time!!
        
        _More_time = ImageVector.Builder(
            name = "more_time",
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
                        moveTo(10.75f, 8f)
                        curveTo(10.34f, 8f, 10f, 8.34f, 10f, 8.75f)
                        verticalLineToRelative(4.69f)
                        curveToRelative(0f, 0.35f, 0.18f, 0.67f, 0.47f, 0.85f)
                        lineToRelative(3.64f, 2.24f)
                        curveToRelative(0.33f, 0.2f, 0.76f, 0.11f, 0.97f, -0.21f)
                        curveToRelative(0.23f, -0.34f, 0.12f, -0.8f, -0.23f, -1.01f)
                        lineTo(11.5f, 13.3f)
                        verticalLineTo(8.75f)
                        curveTo(11.5f, 8.34f, 11.16f, 8f, 10.75f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.92f, 12f)
                        curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                        curveToRelative(0f, 3.9f, -3.1f, 7f, -7f, 7f)
                        reflectiveCurveToRelative(-7f, -3.1f, -7f, -7f)
                        curveToRelative(0f, -3.9f, 3.1f, -7f, 7f, -7f)
                        curveToRelative(0.7f, 0f, 1.37f, 0.1f, 2f, 0.29f)
                        verticalLineTo(4.23f)
                        curveTo(12.36f, 4.08f, 11.69f, 4f, 11f, 4f)
                        curveToRelative(-5f, 0f, -9f, 4f, -9f, 9f)
                        reflectiveCurveToRelative(4f, 9f, 9f, 9f)
                        reflectiveCurveToRelative(9f, -4f, 9f, -9f)
                        curveToRelative(0f, -0.34f, -0.02f, -0.67f, -0.06f, -1f)
                        horizontalLineTo(17.92f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 5f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(23f, 5.45f, 22.55f, 5f, 22f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _More_time!!
    }

private var _More_time: ImageVector? = null

