package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Warning_amber: ImageVector
    get() {
        if (_Warning_amber != null) return _Warning_amber!!
        
        _Warning_amber = ImageVector.Builder(
            name = "warning_amber",
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
                            moveTo(12f, 5.99f)
                            lineTo(19.53f, 19f)
                            horizontalLineTo(4.47f)
                            lineTo(12f, 5.99f)
                            moveTo(12f, 2f)
                            lineTo(1f, 21f)
                            horizontalLineToRelative(22f)
                            lineTo(12f, 2f)
                            lineTo(12f, 2f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 16f)
                            lineTo(11f, 16f)
                            lineTo(11f, 18f)
                            lineTo(13f, 18f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 10f)
                            lineTo(11f, 10f)
                            lineTo(11f, 15f)
                            lineTo(13f, 15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Warning_amber!!
    }

private var _Warning_amber: ImageVector? = null

