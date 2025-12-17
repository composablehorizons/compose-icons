package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareF9: ImageVector
    get() {
        if (_SquareF9 != null) return _SquareF9!!
        
        _SquareF9 = ImageVector.Builder(
            name = "square-f9",
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
                moveToRelative(-3.083f, 6f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.144f, 0.006f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -1.606f, 1.744f)
                verticalLineToRelative(1.5f)
                lineToRelative(0.006f, 0.144f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, 1.744f, 1.606f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.033f)
                lineToRelative(-0.025f, -0.087f)
                arcToRelative(1f, 1f, 0f, false, false, -1.942f, 0.337f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.144f, -0.006f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, 1.606f, -1.744f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.006f, -0.144f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -1.744f, -1.606f)
                close()
                moveToRelative(-5.25f, 0f)
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
                moveToRelative(5f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _SquareF9!!
    }

private var _SquareF9: ImageVector? = null

