package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareF0: ImageVector
    get() {
        if (_SquareF0 != null) return _SquareF0!!
        
        _SquareF0 = ImageVector.Builder(
            name = "square-f0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.333f, 2f)
                curveToRelative(1.96f, 0f, 3.56f, 1.537f, 3.662f, 3.472f)
                lineToRelative(0.005f, 0.195f)
                verticalLineToRelative(12.666f)
                curveToRelative(0f, 1.96f, -1.537f, 3.56f, -3.472f, 3.662f)
                lineToRelative(-0.195f, 0.005f)
                horizontalLineToRelative(-12.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, -3.662f, -3.472f)
                lineToRelative(-0.005f, -0.195f)
                verticalLineToRelative(-12.666f)
                curveToRelative(0f, -1.96f, 1.537f, -3.56f, 3.472f, -3.662f)
                lineToRelative(0.195f, -0.005f)
                horizontalLineToRelative(12.666f)
                close()
                moveToRelative(-3.833f, 6f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.495f, 2.336f)
                lineToRelative(-0.005f, 0.164f)
                verticalLineToRelative(3f)
                lineToRelative(0.005f, 0.164f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 4.99f, 0f)
                lineToRelative(0.005f, -0.164f)
                verticalLineToRelative(-3f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.495f, -2.336f)
                close()
                moveToRelative(-4.5f, 0f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.876f, 0.876f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(6f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.876f, -0.876f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveToRelative(4.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.492f, 0.41f)
                lineToRelative(0.008f, 0.09f)
                verticalLineToRelative(3f)
                lineToRelative(-0.008f, 0.09f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.984f, 0f)
                lineToRelative(-0.008f, -0.09f)
                verticalLineToRelative(-3f)
                lineToRelative(0.008f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.492f, -0.41f)
                close()
            }
        }.build()
        
        return _SquareF0!!
    }

private var _SquareF0: ImageVector? = null

