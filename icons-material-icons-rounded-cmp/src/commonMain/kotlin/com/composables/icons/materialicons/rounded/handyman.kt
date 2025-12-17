package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Handyman: ImageVector
    get() {
        if (_Handyman != null) return _Handyman!!
        
        _Handyman = ImageVector.Builder(
            name = "handyman",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.67f, 18.17f)
                            lineToRelative(-4.72f, -4.72f)
                            curveToRelative(-0.48f, -0.48f, -0.99f, -0.59f, -1.58f, -0.59f)
                            lineToRelative(-2.54f, 2.54f)
                            curveToRelative(0f, 0.59f, 0.11f, 1.11f, 0.59f, 1.58f)
                            lineToRelative(4.72f, 4.72f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(2.12f, -2.12f)
                            curveTo(22.06f, 19.2f, 22.06f, 18.56f, 21.67f, 18.17f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.63f, 9.49f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(0.71f, -0.71f)
                            lineToRelative(2.12f, 2.12f)
                            curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                            lineToRelative(-2.83f, -2.83f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(-0.71f, 0.71f)
                            verticalLineTo(2f)
                            curveToRelative(0f, -0.62f, -0.76f, -0.95f, -1.21f, -0.5f)
                            lineToRelative(-2.54f, 2.54f)
                            curveToRelative(-0.45f, 0.45f, -0.12f, 1.21f, 0.5f, 1.21f)
                            horizontalLineToRelative(2.54f)
                            lineToRelative(-0.71f, 0.71f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(0.35f, 0.35f)
                            lineToRelative(-2.89f, 2.89f)
                            lineTo(7.85f, 6.48f)
                            verticalLineToRelative(-1f)
                            curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                            lineTo(5.54f, 2.74f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineTo(2.71f, 4.16f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineTo(4.73f, 7.6f)
                            curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                            horizontalLineToRelative(1f)
                            lineToRelative(4.13f, 4.13f)
                            lineToRelative(-0.85f, 0.85f)
                            horizontalLineTo(8.42f)
                            curveToRelative(-0.53f, 0f, -1.04f, 0.21f, -1.41f, 0.59f)
                            lineToRelative(-4.72f, 4.72f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(2.12f, 2.12f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(4.72f, -4.72f)
                            curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                            verticalLineToRelative(-1.29f)
                            lineToRelative(5.15f, -5.15f)
                            lineTo(16.63f, 9.49f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Handyman!!
    }

private var _Handyman: ImageVector? = null

