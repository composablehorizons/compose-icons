package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareF3: ImageVector
    get() {
        if (_SquareF3 != null) return _SquareF3!!
        
        _SquareF3 = ImageVector.Builder(
            name = "square-f3",
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
                horizontalLineToRelative(-1f)
                lineToRelative(-0.144f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.356f, 1.493f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.727f, -0.457f)
                lineToRelative(0.02f, -0.036f)
                horizontalLineToRelative(0.636f)
                lineToRelative(0.09f, 0.008f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.984f)
                lineToRelative(-0.09f, 0.008f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.133f, 0.007f)
                curveToRelative(-1.156f, 0.124f, -1.156f, 1.862f, 0f, 1.986f)
                lineToRelative(0.133f, 0.007f)
                horizontalLineToRelative(0.5f)
                lineToRelative(0.09f, 0.008f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.41f, 0.492f)
                lineToRelative(-0.008f, 0.09f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.492f, 0.41f)
                horizontalLineToRelative(-0.635f)
                lineToRelative(-0.02f, -0.036f)
                arcToRelative(1f, 1f, 0f, false, false, -1.845f, 0.536f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                lineToRelative(0.164f, -0.005f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.336f, -2.495f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.487f, 2.487f, 0f, false, false, -0.477f, -1.312f)
                lineToRelative(-0.019f, -0.024f)
                lineToRelative(0.126f, -0.183f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.125f, -3.817f)
                close()
                moveToRelative(-4.5f, 0f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(6f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, 0.883f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
            }
        }.build()
        
        return _SquareF3!!
    }

private var _SquareF3: ImageVector? = null

