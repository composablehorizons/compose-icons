package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Reset_tv: ImageVector
    get() {
        if (_Reset_tv != null) return _Reset_tv!!
        
        _Reset_tv = ImageVector.Builder(
            name = "reset_tv",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 10f)
                    lineTo(12.99f, 10f)
                    lineTo(12.99f, 7f)
                    lineTo(9f, 11f)
                    lineTo(12.99f, 15f)
                    lineTo(12.99f, 12f)
                    lineTo(20f, 12f)
                    lineTo(20f, 17f)
                    lineTo(4f, 17f)
                    lineTo(4f, 5f)
                    lineTo(20f, 5f)
                    lineTo(20f, 8f)
                    lineTo(22f, 8f)
                    lineTo(22f, 3f)
                    lineTo(2f, 3f)
                    lineTo(2f, 19f)
                    lineTo(8f, 19f)
                    lineTo(8f, 21f)
                    lineTo(16f, 21f)
                    lineTo(16f, 19f)
                    lineTo(22f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Reset_tv!!
    }

private var _Reset_tv: ImageVector? = null

