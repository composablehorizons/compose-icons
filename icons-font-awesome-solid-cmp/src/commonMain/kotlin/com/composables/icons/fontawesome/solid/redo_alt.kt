package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RedoAlt: ImageVector
    get() {
        if (_RedoAlt != null) return _RedoAlt!!
        
        _RedoAlt = ImageVector.Builder(
            name = "redo-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256.455f, 8f)
                curveToRelative(66.269f, 0.119f, 126.437f, 26.233f, 170.859f, 68.685f)
                lineToRelative(35.715f, -35.715f)
                curveTo(478.149f, 25.851f, 504f, 36.559f, 504f, 57.941f)
                verticalLineTo(192f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(345.941f)
                curveToRelative(-21.382f, 0f, -32.09f, -25.851f, -16.971f, -40.971f)
                lineToRelative(41.75f, -41.75f)
                curveToRelative(-30.864f, -28.899f, -70.801f, -44.907f, -113.23f, -45.273f)
                curveToRelative(-92.398f, -0.798f, -170.283f, 73.977f, -169.484f, 169.442f)
                curveTo(88.764f, 348.009f, 162.184f, 424f, 256f, 424f)
                curveToRelative(41.127f, 0f, 79.997f, -14.678f, 110.629f, -41.556f)
                curveToRelative(4.743f, -4.161f, 11.906f, -3.908f, 16.368f, 0.553f)
                lineToRelative(39.662f, 39.662f)
                curveToRelative(4.872f, 4.872f, 4.631f, 12.815f, -0.482f, 17.433f)
                curveTo(378.202f, 479.813f, 319.926f, 504f, 256f, 504f)
                curveTo(119.034f, 504f, 8.001f, 392.967f, 8f, 256.002f)
                curveTo(7.999f, 119.193f, 119.646f, 7.755f, 256.455f, 8f)
                close()
            }
        }.build()
        
        return _RedoAlt!!
    }

private var _RedoAlt: ImageVector? = null

