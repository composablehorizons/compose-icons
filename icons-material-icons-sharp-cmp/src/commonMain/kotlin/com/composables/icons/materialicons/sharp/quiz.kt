package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Quiz: ImageVector
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
                        lineTo(2f, 6f)
                        lineTo(2f, 22f)
                        lineTo(18f, 22f)
                        lineTo(18f, 20f)
                        lineTo(4f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 2f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(2f)
                        horizontalLineTo(6f)
                        close()
                        moveTo(13.51f, 10.16f)
                        curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                        curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                        curveToRelative(-0.88f, 0f, -1.32f, 0.67f, -1.5f, 1.23f)
                        lineToRelative(-1.37f, -0.57f)
                        curveTo(11.51f, 5.96f, 12.52f, 5f, 13.99f, 5f)
                        curveToRelative(1.23f, 0f, 2.08f, 0.56f, 2.51f, 1.26f)
                        curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f)
                        curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                        curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f)
                        horizontalLineToRelative(-1.52f)
                        curveTo(13.26f, 11.41f, 13.19f, 10.74f, 13.51f, 10.16f)
                        close()
                        moveTo(12.95f, 13.95f)
                        curveToRelative(0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                        curveToRelative(0.59f, 0f, 1.04f, 0.45f, 1.04f, 1.04f)
                        curveToRelative(0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f)
                        curveTo(13.42f, 15f, 12.95f, 14.53f, 12.95f, 13.95f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Quiz!!
    }

private var _Quiz: ImageVector? = null

