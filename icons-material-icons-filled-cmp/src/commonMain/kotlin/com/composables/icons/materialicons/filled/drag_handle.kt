package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Drag_handle: ImageVector
    get() {
        if (_Drag_handle != null) return _Drag_handle!!
        
        _Drag_handle = ImageVector.Builder(
            name = "drag_handle",
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
                            moveTo(20f, 9f)
                            horizontalLineTo(4f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(16f)
                            verticalLineTo(9f)
                            close()
                            moveTo(4f, 15f)
                            horizontalLineToRelative(16f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(4f)
                            verticalLineTo(15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Drag_handle!!
    }

private var _Drag_handle: ImageVector? = null

