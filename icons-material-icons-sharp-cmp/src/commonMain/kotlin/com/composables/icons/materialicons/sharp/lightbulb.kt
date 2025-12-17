package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 22f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            horizontalLineToRelative(-4f)
                            curveTo(10f, 21.1f, 10.9f, 22f, 12f, 22f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(8f, 17f)
                            horizontalLineTo(16f)
                            verticalLineTo(19f)
                            horizontalLineTo(8f)
                            verticalLineTo(17f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 2f)
                            curveTo(7.86f, 2f, 4.5f, 5.36f, 4.5f, 9.5f)
                            curveToRelative(0f, 3.82f, 2.66f, 5.86f, 3.77f, 6.5f)
                            horizontalLineToRelative(7.46f)
                            curveToRelative(1.11f, -0.64f, 3.77f, -2.68f, 3.77f, -6.5f)
                            curveTo(19.5f, 5.36f, 16.14f, 2f, 12f, 2f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

