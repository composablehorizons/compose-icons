package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareNumber5: ImageVector
    get() {
        if (_SquareNumber5 != null) return _SquareNumber5!!
        
        _SquareNumber5 = ImageVector.Builder(
            name = "square-number-5",
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
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1.993f, 0.117f)
                arcToRelative(2f, 2f, 0f, false, false, 1.85f, 1.995f)
                lineToRelative(0.15f, 0.005f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.995f, -1.85f)
                lineToRelative(0.005f, -0.15f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -1.85f, -1.995f)
                lineToRelative(-0.15f, -0.005f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()
        
        return _SquareNumber5!!
    }

private var _SquareNumber5: ImageVector? = null

