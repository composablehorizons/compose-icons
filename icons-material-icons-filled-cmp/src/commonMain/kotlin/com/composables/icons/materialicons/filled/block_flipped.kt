package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Block_flipped: ImageVector
    get() {
        if (_Block_flipped != null) return _Block_flipped!!
        
        _Block_flipped = ImageVector.Builder(
            name = "block_flipped",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 12f)
                    curveToRelative(0f, -5.5f, -4.5f, -10f, -10f, -10f)
                    reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                    reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                    reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                    close()
                    moveTo(5.7f, 7.1f)
                    lineToRelative(11.2f, 11.2f)
                    curveToRelative(-1.3f, 1.1f, -3f, 1.7f, -4.9f, 1.7f)
                    curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                    curveTo(4f, 10.1f, 4.6f, 8.4f, 5.7f, 7.1f)
                    close()
                    moveTo(20f, 12f)
                    curveToRelative(0f, 1.9f, -0.6f, 3.6f, -1.7f, 4.9f)
                    lineTo(7.1f, 5.7f)
                    curveTo(8.4f, 4.6f, 10.1f, 4f, 12f, 4f)
                    curveTo(16.4f, 4f, 20f, 7.6f, 20f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Block_flipped!!
    }

private var _Block_flipped: ImageVector? = null

