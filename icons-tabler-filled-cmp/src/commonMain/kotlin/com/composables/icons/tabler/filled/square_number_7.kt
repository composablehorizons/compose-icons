package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareNumber7: ImageVector
    get() {
        if (_SquareNumber7 != null) return _SquareNumber7!!
        
        _SquareNumber7 = ImageVector.Builder(
            name = "square-number-7",
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
                moveToRelative(-4.333f, 5f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.876f, 0.876f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(2.718f)
                lineToRelative(-1.688f, 6.757f)
                lineToRelative(-0.022f, 0.115f)
                arcToRelative(1f, 1f, 0f, false, false, 1.927f, 0.482f)
                lineToRelative(0.035f, -0.111f)
                lineToRelative(2f, -8f)
                lineToRelative(0.021f, -0.112f)
                arcToRelative(1f, 1f, 0f, false, false, -0.878f, -1.125f)
                lineToRelative(-0.113f, -0.006f)
                close()
            }
        }.build()
        
        return _SquareNumber7!!
    }

private var _SquareNumber7: ImageVector? = null

