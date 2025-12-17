package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CoinRupee: ImageVector
    get() {
        if (_CoinRupee != null) return _CoinRupee!!
        
        _CoinRupee = ImageVector.Builder(
            name = "coin-rupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-2f, 3.66f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.287f, 0f, -1.332f, 1.864f, -0.133f, 1.993f)
                lineToRelative(0.133f, 0.007f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 1.732f, 1f)
                horizontalLineToRelative(-2.732f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                lineToRelative(2.732f, 0.001f)
                arcToRelative(2f, 2f, 0f, false, true, -1.732f, 0.999f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.89f, 0f, -1.337f, 1.077f, -0.707f, 1.707f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-1.484f, -1.485f)
                lineToRelative(0.113f, -0.037f)
                arcToRelative(4.009f, 4.009f, 0f, false, false, 2.538f, -2.77f)
                lineToRelative(1.126f, -0.001f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-1.126f)
                arcToRelative(3.973f, 3.973f, 0f, false, false, -0.33f, -0.855f)
                lineToRelative(-0.079f, -0.145f)
                horizontalLineToRelative(1.535f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _CoinRupee!!
    }

private var _CoinRupee: ImageVector? = null

