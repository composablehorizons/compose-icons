package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) return _Hexagon!!
        
        _Hexagon = ImageVector.Builder(
            name = "hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.425f, 1.414f)
                lineToRelative(-6.775f, 3.996f)
                arcToRelative(3.21f, 3.21f, 0f, false, false, -1.65f, 2.807f)
                verticalLineToRelative(7.285f)
                arcToRelative(3.226f, 3.226f, 0f, false, false, 1.678f, 2.826f)
                lineToRelative(6.695f, 4.237f)
                curveToRelative(1.034f, 0.57f, 2.22f, 0.57f, 3.2f, 0.032f)
                lineToRelative(6.804f, -4.302f)
                curveToRelative(0.98f, -0.537f, 1.623f, -1.618f, 1.623f, -2.793f)
                verticalLineToRelative(-7.284f)
                lineToRelative(-0.005f, -0.204f)
                arcToRelative(3.223f, 3.223f, 0f, false, false, -1.284f, -2.39f)
                lineToRelative(-0.107f, -0.075f)
                lineToRelative(-0.007f, -0.007f)
                arcToRelative(1.074f, 1.074f, 0f, false, false, -0.181f, -0.133f)
                lineToRelative(-6.776f, -3.995f)
                arcToRelative(3.33f, 3.33f, 0f, false, false, -3.216f, 0f)
                close()
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

