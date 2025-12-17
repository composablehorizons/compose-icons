package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Raw_off: ImageVector
    get() {
        if (_Raw_off != null) return _Raw_off!!
        
        _Raw_off = ImageVector.Builder(
            name = "raw_off",
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
                        moveTo(20.55f, 9f)
                        curveToRelative(-0.33f, 0f, -0.63f, 0.23f, -0.71f, 0.55f)
                        lineTo(19.24f, 12f)
                        lineToRelative(-0.56f, -2.26f)
                        curveTo(18.58f, 9.3f, 18.19f, 9f, 17.74f, 9f)
                        reflectiveCurveTo(16.9f, 9.3f, 16.8f, 9.74f)
                        lineTo(16.24f, 12f)
                        lineToRelative(-0.6f, -2.45f)
                        curveTo(15.56f, 9.23f, 15.27f, 9f, 14.93f, 9f)
                        curveToRelative(-0.47f, 0f, -0.82f, 0.44f, -0.71f, 0.9f)
                        lineToRelative(0.5f, 1.99f)
                        lineToRelative(2.42f, 2.42f)
                        curveToRelative(0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f)
                        lineToRelative(0.58f, -2.32f)
                        lineToRelative(0.58f, 2.32f)
                        curveTo(18.43f, 14.7f, 18.81f, 15f, 19.24f, 15f)
                        reflectiveCurveToRelative(0.81f, -0.3f, 0.92f, -0.72f)
                        lineToRelative(1.09f, -4.38f)
                        curveTo(21.37f, 9.44f, 21.02f, 9f, 20.55f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.51f, 3.51f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineTo(6.17f, 9f)
                        horizontalLineTo(4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4.31f)
                        curveTo(3f, 14.69f, 3.31f, 15f, 3.69f, 15f)
                        horizontalLineToRelative(0.11f)
                        curveToRelative(0.38f, 0f, 0.69f, -0.31f, 0.69f, -0.69f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.72f, 1.59f)
                        curveTo(6.43f, 14.84f, 6.68f, 15f, 6.95f, 15f)
                        curveToRelative(0.5f, 0f, 0.83f, -0.51f, 0.64f, -0.97f)
                        lineTo(7.1f, 12.9f)
                        curveTo(7.6f, 12.6f, 8f, 12.1f, 8f, 11.5f)
                        verticalLineToRelative(-0.67f)
                        lineToRelative(1.43f, 1.43f)
                        lineTo(8.98f, 14.1f)
                        curveTo(8.86f, 14.56f, 9.21f, 15f, 9.68f, 15f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.33f, 0f, 0.62f, -0.23f, 0.7f, -0.55f)
                        lineToRelative(0.24f, -0.95f)
                        horizontalLineToRelative(0.04f)
                        lineToRelative(8.4f, 8.4f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        close()
                        moveTo(6.5f, 11.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Raw_off!!
    }

private var _Raw_off: ImageVector? = null

