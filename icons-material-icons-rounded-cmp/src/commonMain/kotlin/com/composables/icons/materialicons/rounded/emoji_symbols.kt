package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emoji_symbols: ImageVector
    get() {
        if (_Emoji_symbols != null) return _Emoji_symbols!!
        
        _Emoji_symbols = ImageVector.Builder(
            name = "emoji_symbols",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 5f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 5f, 3f, 5.45f, 3f, 6f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(11f, 5.45f, 10.55f, 5f, 10f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 2f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 2f, 3f, 2.45f, 3f, 3f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(10.55f, 2f, 10f, 2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.89f, 13.11f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-6.36f, 6.36f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(6.36f, -6.36f)
                        curveTo(21.28f, 14.13f, 21.28f, 13.5f, 20.89f, 13.11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 16f, 14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 19.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 19.5f, 21f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 18f, 19.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 21f, 19.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.5f, 11f)
                        curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3.51f)
                        curveTo(16.58f, 6.19f, 16.07f, 6f, 15.5f, 6f)
                        curveTo(14.12f, 6f, 13f, 7.12f, 13f, 8.5f)
                        curveTo(13f, 9.88f, 14.12f, 11f, 15.5f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.45f, 18.09f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-0.71f, 0.71f)
                        lineToRelative(-0.71f, -0.71f)
                        lineToRelative(0.35f, -0.35f)
                        curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.49f, -0.49f, -1.13f, -0.73f, -1.77f, -0.73f)
                        curveToRelative(-0.64f, 0f, -1.28f, 0.24f, -1.77f, 0.73f)
                        curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0f, 3.54f)
                        lineToRelative(0.35f, 0.35f)
                        lineToRelative(-1.06f, 1.06f)
                        curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0f, 3.54f)
                        curveTo(4.22f, 21.76f, 4.86f, 22f, 5.5f, 22f)
                        curveToRelative(0.64f, 0f, 1.28f, -0.24f, 1.77f, -0.73f)
                        lineToRelative(1.06f, -1.06f)
                        lineToRelative(0.71f, 0.71f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-0.71f, -0.71f)
                        verticalLineToRelative(0f)
                        lineTo(10.45f, 18.09f)
                        close()
                        moveTo(5.85f, 14.2f)
                        curveToRelative(0.12f, -0.12f, 0.26f, -0.15f, 0.35f, -0.15f)
                        reflectiveCurveToRelative(0.23f, 0.03f, 0.35f, 0.15f)
                        curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, 0f, 0.71f)
                        lineToRelative(-0.35f, 0.35f)
                        lineTo(5.85f, 14.9f)
                        curveToRelative(-0.12f, -0.12f, -0.15f, -0.26f, -0.15f, -0.35f)
                        reflectiveCurveTo(5.73f, 14.32f, 5.85f, 14.2f)
                        close()
                        moveTo(5.85f, 19.85f)
                        curveTo(5.73f, 19.97f, 5.59f, 20f, 5.5f, 20f)
                        reflectiveCurveToRelative(-0.23f, -0.03f, -0.35f, -0.15f)
                        curveTo(5.03f, 19.73f, 5f, 19.59f, 5f, 19.5f)
                        reflectiveCurveToRelative(0.03f, -0.23f, 0.15f, -0.35f)
                        lineToRelative(1.06f, -1.06f)
                        lineToRelative(0.71f, 0.71f)
                        lineTo(5.85f, 19.85f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_symbols!!
    }

private var _Emoji_symbols: ImageVector? = null

