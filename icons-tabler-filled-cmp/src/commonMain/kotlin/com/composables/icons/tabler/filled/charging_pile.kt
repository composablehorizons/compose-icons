package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChargingPile: ImageVector
    get() {
        if (_ChargingPile != null) return _ChargingPile!!
        
        _ChargingPile = ImageVector.Builder(
            name = "charging-pile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-6.585f)
                lineToRelative(-1f, -1f)
                lineToRelative(-0.293f, 0.292f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(0.292f, -0.293f)
                lineToRelative(-0.292f, -0.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(7f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                verticalLineToRelative(-13f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-2.486f, 7.643f)
                arcToRelative(1f, 1f, 0f, false, false, -1.371f, 0.343f)
                lineToRelative(-1.5f, 2.5f)
                lineToRelative(-0.054f, 0.1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.911f, 1.414f)
                horizontalLineToRelative(1.233f)
                lineToRelative(-0.59f, 0.986f)
                arcToRelative(1f, 1f, 0f, false, false, 1.714f, 1.028f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(0.054f, -0.1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.911f, -1.414f)
                horizontalLineToRelative(-1.235f)
                lineToRelative(0.592f, -0.986f)
                arcToRelative(1f, 1f, 0f, false, false, -0.343f, -1.371f)
                moveToRelative(2.486f, -5.643f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _ChargingPile!!
    }

private var _ChargingPile: ImageVector? = null

