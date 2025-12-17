package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
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
                            moveTo(12.16f, 3f)
                            lineTo(11.84f, 3f)
                            lineTo(9.21f, 8.25f)
                            lineTo(14.79f, 8.25f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.46f, 8.25f)
                            horizontalLineToRelative(5.16f)
                            lineToRelative(-2.07f, -4.14f)
                            curveTo(19.21f, 3.43f, 18.52f, 3f, 17.76f, 3f)
                            horizontalLineToRelative(-3.93f)
                            lineTo(16.46f, 8.25f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.38f, 9.75f)
                            lineTo(12.75f, 9.75f)
                            lineTo(12.75f, 20.1f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.25f, 20.1f)
                            lineTo(11.25f, 9.75f)
                            lineTo(2.62f, 9.75f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7.54f, 8.25f)
                            lineTo(10.16f, 3f)
                            horizontalLineTo(6.24f)
                            curveTo(5.48f, 3f, 4.79f, 3.43f, 4.45f, 4.11f)
                            lineTo(2.38f, 8.25f)
                            horizontalLineTo(7.54f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

