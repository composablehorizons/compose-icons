package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bedtime: ImageVector
    get() {
        if (_Bedtime != null) return _Bedtime!!
        
        _Bedtime = ImageVector.Builder(
            name = "bedtime",
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
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.34f, 2.02f)
                        curveTo(6.59f, 1.82f, 2f, 6.42f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(3.71f, 0f, 6.93f, -2.02f, 8.66f, -5.02f)
                        curveTo(13.15f, 16.73f, 8.57f, 8.55f, 12.34f, 2.02f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedtime!!
    }

private var _Bedtime: ImageVector? = null

