package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Adjustments: ImageVector
    get() {
        if (_Adjustments != null) return _Adjustments!!
        
        _Adjustments = ImageVector.Builder(
            name = "adjustments",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(3.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, 0f, 5.658f)
                verticalLineToRelative(7.171f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-7.17f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, -1.995f, -2.654f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-3.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, 0f, 5.658f)
                verticalLineToRelative(1.171f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.17f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, -1.995f, -2.654f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-9.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(0.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, 0f, 5.658f)
                verticalLineToRelative(10.171f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-10.17f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, -1.995f, -2.654f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-0.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Adjustments!!
    }

private var _Adjustments: ImageVector? = null

