package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Globe: ImageVector
    get() {
        if (_Globe != null) return _Globe!!
        
        _Globe = ImageVector.Builder(
            name = "globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(4.141f, 1f, 1f, 4.141f, 1f, 8f)
                curveTo(1f, 11.859f, 4.141f, 15f, 8f, 15f)
                curveTo(11.859f, 15f, 15f, 11.859f, 15f, 8f)
                curveTo(15f, 4.141f, 11.859f, 1f, 8f, 1f)
                close()
                moveTo(8f, 14f)
                curveTo(7.422f, 14f, 6.686f, 12.906f, 6.288f, 11f)
                horizontalLineTo(9.713f)
                curveTo(9.315f, 12.906f, 8.579f, 14f, 8.001f, 14f)
                horizontalLineTo(8f)
                close()
                moveTo(6.121f, 10f)
                curveTo(6.044f, 9.392f, 6f, 8.723f, 6f, 8f)
                curveTo(6f, 7.277f, 6.044f, 6.608f, 6.121f, 6f)
                horizontalLineTo(9.878f)
                curveTo(9.955f, 6.608f, 9.999f, 7.277f, 9.999f, 8f)
                curveTo(9.999f, 8.723f, 9.955f, 9.392f, 9.878f, 10f)
                horizontalLineTo(6.121f)
                close()
                moveTo(2f, 8f)
                curveTo(2f, 7.299f, 2.121f, 6.626f, 2.343f, 6f)
                horizontalLineTo(5.121f)
                curveTo(5.041f, 6.656f, 5f, 7.332f, 5f, 8f)
                curveTo(5f, 8.668f, 5.041f, 9.344f, 5.121f, 10f)
                horizontalLineTo(2.343f)
                curveTo(2.121f, 9.374f, 2f, 8.701f, 2f, 8f)
                close()
                moveTo(8f, 2f)
                curveTo(8.578f, 2f, 9.314f, 3.094f, 9.712f, 5f)
                horizontalLineTo(6.287f)
                curveTo(6.685f, 3.094f, 7.422f, 2f, 8f, 2f)
                close()
                moveTo(10.879f, 6f)
                horizontalLineTo(13.657f)
                curveTo(13.879f, 6.626f, 14f, 7.299f, 14f, 8f)
                curveTo(14f, 8.701f, 13.879f, 9.374f, 13.657f, 10f)
                horizontalLineTo(10.879f)
                curveTo(10.959f, 9.344f, 11f, 8.668f, 11f, 8f)
                curveTo(11f, 7.332f, 10.959f, 6.656f, 10.879f, 6f)
                close()
                moveTo(13.195f, 5f)
                horizontalLineTo(10.722f)
                curveTo(10.516f, 3.938f, 10.199f, 2.98f, 9.775f, 2.268f)
                curveTo(11.228f, 2.719f, 12.446f, 3.707f, 13.195f, 5f)
                close()
                moveTo(6.226f, 2.268f)
                curveTo(5.802f, 2.98f, 5.484f, 3.938f, 5.279f, 5f)
                horizontalLineTo(2.806f)
                curveTo(3.556f, 3.707f, 4.774f, 2.718f, 6.226f, 2.268f)
                close()
                moveTo(2.805f, 11f)
                horizontalLineTo(5.278f)
                curveTo(5.484f, 12.062f, 5.801f, 13.02f, 6.225f, 13.732f)
                curveTo(4.772f, 13.281f, 3.554f, 12.293f, 2.805f, 11f)
                close()
                moveTo(9.774f, 13.732f)
                curveTo(10.198f, 13.02f, 10.516f, 12.062f, 10.721f, 11f)
                horizontalLineTo(13.194f)
                curveTo(12.444f, 12.293f, 11.226f, 13.282f, 9.774f, 13.732f)
                close()
            }
        }.build()
        
        return _Globe!!
    }

private var _Globe: ImageVector? = null

