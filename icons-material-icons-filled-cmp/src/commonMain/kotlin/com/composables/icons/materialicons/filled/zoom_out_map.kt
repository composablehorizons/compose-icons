package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Zoom_out_map: ImageVector
    get() {
        if (_Zoom_out_map != null) return _Zoom_out_map!!
        
        _Zoom_out_map = ImageVector.Builder(
            name = "zoom_out_map",
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
                            moveTo(15f, 3f)
                            lineToRelative(2.3f, 2.3f)
                            lineToRelative(-2.89f, 2.87f)
                            lineToRelative(1.42f, 1.42f)
                            lineTo(18.7f, 6.7f)
                            lineTo(21f, 9f)
                            verticalLineTo(3f)
                            horizontalLineTo(15f)
                            close()
                            moveTo(3f, 9f)
                            lineToRelative(2.3f, -2.3f)
                            lineToRelative(2.87f, 2.89f)
                            lineToRelative(1.42f, -1.42f)
                            lineTo(6.7f, 5.3f)
                            lineTo(9f, 3f)
                            horizontalLineTo(3f)
                            verticalLineTo(9f)
                            close()
                            moveTo(9f, 21f)
                            lineToRelative(-2.3f, -2.3f)
                            lineToRelative(2.89f, -2.87f)
                            lineToRelative(-1.42f, -1.42f)
                            lineTo(5.3f, 17.3f)
                            lineTo(3f, 15f)
                            verticalLineToRelative(6f)
                            horizontalLineTo(9f)
                            close()
                            moveTo(21f, 15f)
                            lineToRelative(-2.3f, 2.3f)
                            lineToRelative(-2.87f, -2.89f)
                            lineToRelative(-1.42f, 1.42f)
                            lineToRelative(2.89f, 2.87f)
                            lineTo(15f, 21f)
                            horizontalLineToRelative(6f)
                            verticalLineTo(15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Zoom_out_map!!
    }

private var _Zoom_out_map: ImageVector? = null

