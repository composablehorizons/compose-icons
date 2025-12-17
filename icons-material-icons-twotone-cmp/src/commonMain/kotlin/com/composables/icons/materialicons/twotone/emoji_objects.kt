package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Emoji_objects: ImageVector
    get() {
        if (_Emoji_objects != null) return _Emoji_objects!!
        
        _Emoji_objects = ImageVector.Builder(
            name = "emoji_objects",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 18f)
                        horizontalLineTo(14f)
                        verticalLineTo(19f)
                        horizontalLineTo(10f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 16f)
                        horizontalLineTo(14f)
                        verticalLineTo(17f)
                        horizontalLineTo(10f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 3f)
                        curveToRelative(-0.46f, 0f, -0.93f, 0.04f, -1.4f, 0.14f)
                        curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f)
                        curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f)
                        curveTo(7.77f, 15.6f, 8f, 16.13f, 8f, 16.69f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(0.28f)
                        curveToRelative(0.35f, 0.6f, 0.98f, 1f, 1.72f, 1f)
                        reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1f)
                        horizontalLineTo(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2.31f)
                        curveToRelative(0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f)
                        curveTo(18.09f, 13.95f, 19f, 12.08f, 19f, 10f)
                        curveTo(19f, 6.13f, 15.87f, 3f, 12f, 3f)
                        close()
                        moveTo(14f, 19f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(19f)
                        close()
                        moveTo(14f, 17f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(17f)
                        close()
                        moveTo(15.31f, 13.74f)
                        curveToRelative(-0.09f, 0.08f, -0.16f, 0.18f, -0.24f, 0.26f)
                        horizontalLineTo(8.92f)
                        curveToRelative(-0.08f, -0.09f, -0.15f, -0.19f, -0.24f, -0.27f)
                        curveToRelative(-1.32f, -1.18f, -1.91f, -2.94f, -1.59f, -4.7f)
                        curveToRelative(0.36f, -1.94f, 1.96f, -3.55f, 3.89f, -3.93f)
                        curveTo(11.32f, 5.03f, 11.66f, 5f, 12f, 5f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        curveTo(17f, 11.43f, 16.39f, 12.79f, 15.31f, 13.74f)
                        close()
                    }
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 11f)
                        horizontalLineTo(12.5f)
                        verticalLineTo(14f)
                        horizontalLineTo(11.5f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.672398f, 9.58082f)
                        lineTo(10.379498f, 8.87372f)
                        lineTo(12.500797f, 10.99502f)
                        lineTo(11.793697f, 11.70212f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.208099f, 11.712282f)
                        lineTo(11.500999f, 11.005182f)
                        lineTo(13.622299f, 8.883881f)
                        lineTo(14.329399f, 9.590981f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_objects!!
    }

private var _Emoji_objects: ImageVector? = null

