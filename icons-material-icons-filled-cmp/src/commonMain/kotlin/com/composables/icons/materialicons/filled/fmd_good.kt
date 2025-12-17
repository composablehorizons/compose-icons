package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fmd_good: ImageVector
    get() {
        if (_Fmd_good != null) return _Fmd_good!!
        
        _Fmd_good = ImageVector.Builder(
            name = "fmd_good",
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
                    moveTo(12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                    curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                    curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 12f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    curveTo(14f, 11.1f, 13.1f, 12f, 12f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Fmd_good!!
    }

private var _Fmd_good: ImageVector? = null

