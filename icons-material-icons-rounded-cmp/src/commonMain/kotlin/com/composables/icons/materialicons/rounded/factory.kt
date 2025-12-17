package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Factory: ImageVector
    get() {
        if (_Factory != null) return _Factory!!
        
        _Factory = ImageVector.Builder(
            name = "factory",
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
                        moveTo(14f, 10f)
                        verticalLineTo(8.48f)
                        curveToRelative(0f, -0.71f, -0.71f, -1.19f, -1.37f, -0.93f)
                        lineTo(9f, 9f)
                        verticalLineTo(8.52f)
                        curveTo(9f, 7.8f, 8.27f, 7.31f, 7.61f, 7.6f)
                        lineTo(3.21f, 9.48f)
                        curveTo(2.48f, 9.8f, 2f, 10.52f, 2f, 11.32f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(10f)
                        horizontalLineTo(14f)
                        close()
                        moveTo(9f, 17f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(17f)
                        close()
                        moveTo(13f, 17f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(17f)
                        close()
                        moveTo(17f, 17f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.12f, 2f)
                        horizontalLineToRelative(-1.23f)
                        curveToRelative(-0.51f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                        lineTo(17.2f, 8.5f)
                        horizontalLineToRelative(4.6f)
                        lineToRelative(-0.69f, -5.62f)
                        curveTo(21.05f, 2.38f, 20.62f, 2f, 20.12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Factory!!
    }

private var _Factory: ImageVector? = null

