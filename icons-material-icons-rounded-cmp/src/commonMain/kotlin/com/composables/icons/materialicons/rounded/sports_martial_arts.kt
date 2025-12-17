package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports_martial_arts: ImageVector
    get() {
        if (_Sports_martial_arts != null) return _Sports_martial_arts!!
        
        _Sports_martial_arts = ImageVector.Builder(
            name = "sports_martial_arts",
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
                        moveTo(19.06f, 2.6f)
                        lineTo(11.6f, 8.7f)
                        lineToRelative(-1.21f, -1.04f)
                        lineToRelative(2.48f, -1.43f)
                        curveToRelative(0.57f, -0.33f, 0.67f, -1.11f, 0.21f, -1.57f)
                        lineToRelative(-2.95f, -2.95f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(2.03f, 2.03f)
                        lineTo(5.35f, 8.26f)
                        curveToRelative(-0.23f, 0.13f, -0.39f, 0.35f, -0.46f, 0.6f)
                        lineToRelative(-0.96f, 3.49f)
                        curveToRelative(-0.07f, 0.26f, -0.04f, 0.53f, 0.1f, 0.77f)
                        lineToRelative(1.74f, 3.02f)
                        curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f)
                        lineToRelative(-1.53f, -2.66f)
                        lineToRelative(0.36f, -1.29f)
                        lineTo(9.5f, 13f)
                        lineToRelative(0.44f, 8f)
                        curveToRelative(0.03f, 0.56f, 0.49f, 1f, 1.05f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.56f, 0f, 1.02f, -0.44f, 1.05f, -1f)
                        lineToRelative(0.45f, -9f)
                        lineToRelative(7.87f, -7.96f)
                        curveToRelative(0.36f, -0.36f, 0.38f, -0.93f, 0.05f, -1.32f)
                        lineToRelative(0f, 0f)
                        curveTo(20.07f, 2.32f, 19.47f, 2.27f, 19.06f, 2.6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 5f)
                        arcTo(2f, 2f, 0f, false, true, 5f, 7f)
                        arcTo(2f, 2f, 0f, false, true, 3f, 5f)
                        arcTo(2f, 2f, 0f, false, true, 7f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_martial_arts!!
    }

private var _Sports_martial_arts: ImageVector? = null

