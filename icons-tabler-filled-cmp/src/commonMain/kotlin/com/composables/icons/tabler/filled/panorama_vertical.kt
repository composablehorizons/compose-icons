package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PanoramaVertical: ImageVector
    get() {
        if (_PanoramaVertical != null) return _PanoramaVertical!!
        
        _PanoramaVertical = ImageVector.Builder(
            name = "panorama-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.53f, 2f)
                curveToRelative(1.39f, 0f, 2.364f, 1.389f, 1.87f, 2.692f)
                lineToRelative(-0.013f, 0.026f)
                lineToRelative(-0.156f, 0.431f)
                curveToRelative(-1.623f, 4.572f, -1.622f, 9.123f, 0.003f, 13.703f)
                lineToRelative(0.168f, 0.458f)
                arcToRelative(2f, 2f, 0f, false, true, -1.873f, 2.69f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.386f, 0f, -2.394f, -1.386f, -1.897f, -2.694f)
                curveToRelative(1.845f, -4.879f, 1.845f, -9.734f, 0f, -14.612f)
                curveToRelative(-0.495f, -1.304f, 0.48f, -2.694f, 1.87f, -2.694f)
                close()
            }
        }.build()
        
        return _PanoramaVertical!!
    }

private var _PanoramaVertical: ImageVector? = null

