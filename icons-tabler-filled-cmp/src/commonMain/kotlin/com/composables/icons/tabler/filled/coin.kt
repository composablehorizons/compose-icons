package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Coin: ImageVector
    get() {
        if (_Coin != null) return _Coin!!
        
        _Coin = ImageVector.Builder(
            name = "coin",
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
                moveToRelative(-5f, 2.66f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                verticalLineToRelative(2f)
                arcToRelative(1.024f, 1.024f, 0f, false, true, -0.866f, -0.398f)
                lineToRelative(-0.068f, -0.101f)
                arcToRelative(1f, 1f, 0f, false, false, -1.732f, 0.998f)
                arcToRelative(3f, 3f, 0f, false, false, 2.505f, 1.5f)
                horizontalLineToRelative(0.161f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.994f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                lineToRelative(0.176f, -0.005f)
                arcToRelative(3f, 3f, 0f, false, false, -0.176f, -5.995f)
                verticalLineToRelative(-2f)
                curveToRelative(0.358f, -0.012f, 0.671f, 0.14f, 0.866f, 0.398f)
                lineToRelative(0.068f, 0.101f)
                arcToRelative(1f, 1f, 0f, false, false, 1.732f, -0.998f)
                arcToRelative(3f, 3f, 0f, false, false, -2.505f, -1.501f)
                horizontalLineToRelative(-0.161f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(1f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(-2f, -4f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
        }.build()
        
        return _Coin!!
    }

private var _Coin: ImageVector? = null

