package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
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
                        moveTo(14.14f, 12f)
                        horizontalLineToRelative(-0.06f)
                        curveToRelative(0.81f, 0f, 1.28f, -0.91f, 0.82f, -1.57f)
                        lineTo(9.82f, 3.17f)
                        curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0f)
                        lineTo(3.1f, 10.43f)
                        curveTo(2.64f, 11.09f, 3.11f, 12f, 3.92f, 12f)
                        horizontalLineTo(3.86f)
                        lineToRelative(-2.87f, 4.46f)
                        curveTo(0.56f, 17.12f, 1.04f, 18f, 1.83f, 18f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(5.17f)
                        curveToRelative(0.79f, 0f, 1.27f, -0.88f, 0.84f, -1.54f)
                        lineTo(14.14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23.01f, 16.46f)
                        lineTo(20.14f, 12f)
                        horizontalLineToRelative(-0.06f)
                        curveToRelative(0.81f, 0f, 1.28f, -0.91f, 0.82f, -1.57f)
                        lineToRelative(-5.08f, -7.26f)
                        curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0f)
                        lineToRelative(-1.57f, 2.24f)
                        lineToRelative(3.11f, 4.44f)
                        curveToRelative(0.43f, 0.61f, 0.48f, 1.41f, 0.14f, 2.07f)
                        curveToRelative(-0.08f, 0.16f, -0.18f, 0.3f, -0.3f, 0.43f)
                        lineToRelative(2.29f, 3.57f)
                        curveToRelative(0.4f, 0.62f, 0.42f, 1.4f, 0.07f, 2.04f)
                        curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.04f)
                        horizontalLineToRelative(4.28f)
                        curveTo(22.96f, 18f, 23.44f, 17.12f, 23.01f, 16.46f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 20f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

