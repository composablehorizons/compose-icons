package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Sunset: ImageVector
    get() {
        if (_Sunset != null) return _Sunset!!
        
        _Sunset = ImageVector.Builder(
            name = "sunset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.307f, 9.893f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.414f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.107f, 9.893f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3.584f)
                lineToRelative(1.293f, -1.291f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, -0.767f, 0.293f)
                lineToRelative(-0.124f, -0.017f)
                lineToRelative(-0.127f, -0.032f)
                lineToRelative(-0.104f, -0.04f)
                lineToRelative(-0.115f, -0.063f)
                arcToRelative(1f, 1f, 0f, false, true, -0.151f, -0.114f)
                lineToRelative(-3.026f, -3.027f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.292f)
                verticalLineToRelative(-3.585f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                arcToRelative(5f, 5f, 0f, false, true, 4.583f, 7.002f)
                horizontalLineToRelative(-9.166f)
                arcToRelative(5f, 5f, 0f, false, true, 4.583f, -7.002f)
            }
        }.build()
        
        return _Sunset!!
    }

private var _Sunset: ImageVector? = null

