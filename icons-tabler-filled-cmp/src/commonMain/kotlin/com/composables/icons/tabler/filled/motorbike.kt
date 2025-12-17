package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Motorbike: ImageVector
    get() {
        if (_Motorbike != null) return _Motorbike!!
        
        _Motorbike = ImageVector.Builder(
            name = "motorbike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.894f, 0.553f)
                lineToRelative(3.225f, 6.449f)
                lineToRelative(0.08f, 0.003f)
                arcToRelative(4f, 4f, 0f, true, true, -4.199f, 3.995f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 2.111f, -3.33f)
                lineToRelative(-0.557f, -1.115f)
                lineToRelative(-3.352f, 3.352f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-3.626f)
                quadToRelative(0.124f, 0.481f, 0.126f, 1f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 6.33f, -3.049f)
                lineToRelative(1.749f, -1.751f)
                horizontalLineToRelative(-3.084f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(9.381f)
                lineToRelative(-1f, -2f)
                horizontalLineToRelative(-1.381f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Motorbike!!
    }

private var _Motorbike: ImageVector? = null

