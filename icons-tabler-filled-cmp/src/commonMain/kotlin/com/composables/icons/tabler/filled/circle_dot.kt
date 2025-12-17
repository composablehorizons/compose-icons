package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleDot: ImageVector
    get() {
        if (_CircleDot != null) return _CircleDot!!
        
        _CircleDot = ImageVector.Builder(
            name = "circle-dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-5f, 6.66f)
                arcToRelative(2f, 2f, 0f, false, false, -1.977f, 1.697f)
                lineToRelative(-0.018f, 0.154f)
                lineToRelative(-0.005f, 0.149f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 1.995f, -2.15f)
                close()
            }
        }.build()
        
        return _CircleDot!!
    }

private var _CircleDot: ImageVector? = null

