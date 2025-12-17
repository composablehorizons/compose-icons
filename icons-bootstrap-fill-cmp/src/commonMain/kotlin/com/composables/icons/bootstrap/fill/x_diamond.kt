package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.XDiamond: ImageVector
    get() {
        if (_XDiamond != null) return _XDiamond!!
        
        _XDiamond = ImageVector.Builder(
            name = "x-diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineTo(4.047f, 3.339f)
                lineTo(8f, 7.293f)
                lineToRelative(3.954f, -3.954f)
                lineTo(9.049f, 0.435f)
                close()
                moveToRelative(3.61f, 3.611f)
                lineTo(8.708f, 8f)
                lineToRelative(3.954f, 3.954f)
                lineToRelative(2.904f, -2.905f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0f, -2.098f)
                lineToRelative(-2.904f, -2.905f)
                close()
                moveToRelative(-0.706f, 8.614f)
                lineTo(8f, 8.708f)
                lineToRelative(-3.954f, 3.954f)
                lineToRelative(2.905f, 2.904f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0f)
                lineToRelative(2.905f, -2.904f)
                close()
                moveToRelative(-8.614f, -0.706f)
                lineTo(7.292f, 8f)
                lineTo(3.339f, 4.046f)
                lineTo(0.435f, 6.951f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0f, 2.098f)
                close()
            }
        }.build()
        
        return _XDiamond!!
    }

private var _XDiamond: ImageVector? = null

