package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Quiz: ImageVector
    get() {
        if (_Quiz != null) return _Quiz!!
        
        _Quiz = ImageVector.Builder(
            name = "quiz",
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
                        moveTo(4f, 6f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(8f)
                        curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(14.01f, 15f)
                        curveToRelative(-0.59f, 0f, -1.05f, -0.47f, -1.05f, -1.05f)
                        curveToRelative(0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                        curveToRelative(0.59f, 0f, 1.04f, 0.45f, 1.04f, 1.04f)
                        curveTo(15.04f, 14.53f, 14.6f, 15f, 14.01f, 15f)
                        close()
                        moveTo(16.51f, 8.83f)
                        curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                        curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f)
                        horizontalLineToRelative(-1.52f)
                        curveToRelative(0f, -0.41f, -0.06f, -1.08f, 0.26f, -1.65f)
                        curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                        curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                        curveToRelative(-0.88f, 0f, -1.32f, 0.67f, -1.5f, 1.23f)
                        lineToRelative(-1.37f, -0.57f)
                        curveTo(11.51f, 5.96f, 12.52f, 5f, 13.99f, 5f)
                        curveToRelative(1.23f, 0f, 2.08f, 0.56f, 2.51f, 1.26f)
                        curveTo(16.87f, 6.87f, 17.08f, 7.99f, 16.51f, 8.83f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Quiz!!
    }

private var _Quiz: ImageVector? = null

