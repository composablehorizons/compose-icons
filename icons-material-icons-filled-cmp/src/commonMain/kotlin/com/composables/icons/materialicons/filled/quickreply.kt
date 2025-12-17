package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Quickreply: ImageVector
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
                            moveTo(22f, 4f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 2f, 2.01f, 2.9f, 2.01f, 4f)
                            lineTo(2f, 22f)
                            lineToRelative(4f, -4f)
                            horizontalLineToRelative(9f)
                            verticalLineToRelative(-8f)
                            horizontalLineToRelative(7f)
                            verticalLineTo(4f)
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

