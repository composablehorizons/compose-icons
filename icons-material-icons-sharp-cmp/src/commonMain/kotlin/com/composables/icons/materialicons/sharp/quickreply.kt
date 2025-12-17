package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Quickreply: ImageVector
    get() {
        if (_Quickreply != null) return _Quickreply!!
        
        _Quickreply = ImageVector.Builder(
            name = "quickreply",
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
                            moveTo(22f, 2f)
                            lineTo(2f, 2f)
                            lineTo(2f, 22f)
                            lineTo(6f, 18f)
                            lineTo(15f, 18f)
                            lineTo(15f, 10f)
                            lineTo(22f, 10f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(22.5f, 16f)
                            lineTo(20.3f, 16f)
                            lineTo(22f, 12f)
                            lineTo(17f, 12f)
                            lineTo(17f, 18f)
                            lineTo(19f, 18f)
                            lineTo(19f, 23f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Quickreply!!
    }

private var _Quickreply: ImageVector? = null

