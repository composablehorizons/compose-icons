package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Park: ImageVector
    get() {
        if (_Park != null) return _Park!!
        
        _Park = ImageVector.Builder(
            name = "park",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17f, 12f)
                            lineTo(19f, 12f)
                            lineTo(12f, 2f)
                            lineTo(5.05f, 12f)
                            lineTo(7f, 12f)
                            lineTo(3.1f, 18f)
                            lineTo(10.02f, 18f)
                            lineTo(10.02f, 22f)
                            lineTo(13.98f, 22f)
                            lineTo(13.98f, 18f)
                            lineTo(21f, 18f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Park!!
    }

private var _Park: ImageVector? = null

