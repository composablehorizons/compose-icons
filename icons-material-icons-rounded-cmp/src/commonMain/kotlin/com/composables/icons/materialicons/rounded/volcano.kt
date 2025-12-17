package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Volcano: ImageVector
    get() {
        if (_Volcano != null) return _Volcano!!
        
        _Volcano = ImageVector.Builder(
            name = "volcano",
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
                            moveTo(16.49f, 8f)
                            horizontalLineToRelative(-4.14f)
                            curveToRelative(-0.82f, 0f, -1.55f, 0.5f, -1.86f, 1.26f)
                            lineTo(9f, 13f)
                            horizontalLineTo(7.3f)
                            curveToRelative(-0.79f, 0f, -1.51f, 0.47f, -1.83f, 1.19f)
                            lineToRelative(-2.22f, 5f)
                            curveTo(2.66f, 20.51f, 3.63f, 22f, 5.08f, 22f)
                            horizontalLineToRelative(14.27f)
                            curveToRelative(1.33f, 0f, 2.29f, -1.27f, 1.92f, -2.55f)
                            lineToRelative(-2.86f, -10f)
                            curveTo(18.17f, 8.59f, 17.38f, 8f, 16.49f, 8f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14f, 1f)
                            lineTo(14f, 1f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(2f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(0f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineTo(2f)
                            curveTo(15f, 1.45f, 14.55f, 1f, 14f, 1f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19.66f, 3.34f)
                            lineTo(19.66f, 3.34f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(-1.41f, 1.41f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            verticalLineToRelative(0f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(1.41f, -1.41f)
                            curveTo(20.05f, 4.37f, 20.05f, 3.73f, 19.66f, 3.34f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.17f, 4.76f)
                            lineTo(9.76f, 3.34f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(0f, 0f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(1.41f, 1.41f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(0f, 0f)
                            curveTo(11.56f, 5.78f, 11.56f, 5.15f, 11.17f, 4.76f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Volcano!!
    }

private var _Volcano: ImageVector? = null

