package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.King_bed: ImageVector
    get() {
        if (_King_bed != null) return _King_bed!!
        
        _King_bed = ImageVector.Builder(
            name = "king_bed",
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
                    path(
                        fill = SolidColor(Color.Transparent)
                    ) {
                        moveTo(6f, 7f)
                        horizontalLineTo(11f)
                        verticalLineTo(10f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color.Transparent)
                    ) {
                        moveTo(13f, 7f)
                        horizontalLineTo(18f)
                        verticalLineTo(10f)
                        horizontalLineTo(13f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 10f)
                        verticalLineTo(5f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(1.33f)
                        lineTo(4f, 19f)
                        horizontalLineToRelative(1f)
                        lineToRelative(0.67f, -2f)
                        horizontalLineToRelative(12.67f)
                        lineTo(19f, 19f)
                        horizontalLineToRelative(1f)
                        lineToRelative(0.67f, -2f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(-7f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(11f, 10f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(10f)
                        close()
                        moveTo(18f, 10f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _King_bed!!
    }

private var _King_bed: ImageVector? = null

