package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Signal_cellular_nodata: ImageVector
    get() {
        if (_Signal_cellular_nodata != null) return _Signal_cellular_nodata!!
        
        _Signal_cellular_nodata = ImageVector.Builder(
            name = "signal_cellular_nodata",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 13f)
                        horizontalLineToRelative(-9f)
                        verticalLineToRelative(9f)
                        horizontalLineTo(2f)
                        lineTo(22f, 2f)
                        verticalLineTo(13f)
                        close()
                        moveTo(21f, 15.41f)
                        lineTo(19.59f, 14f)
                        lineToRelative(-2.09f, 2.09f)
                        lineTo(15.41f, 14f)
                        lineTo(14f, 15.41f)
                        lineToRelative(2.09f, 2.09f)
                        lineTo(14f, 19.59f)
                        lineTo(15.41f, 21f)
                        lineToRelative(2.09f, -2.08f)
                        lineTo(19.59f, 21f)
                        lineTo(21f, 19.59f)
                        lineToRelative(-2.08f, -2.09f)
                        lineTo(21f, 15.41f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_cellular_nodata!!
    }

private var _Signal_cellular_nodata: ImageVector? = null

