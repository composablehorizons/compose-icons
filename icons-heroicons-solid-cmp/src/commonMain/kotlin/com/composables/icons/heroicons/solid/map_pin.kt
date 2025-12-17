package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.MapPin: ImageVector
    get() {
        if (_MapPin != null) return _MapPin!!
        
        _MapPin = ImageVector.Builder(
            name = "map-pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.54f, 22.351f)
                lineToRelative(0.07f, 0.04f)
                lineToRelative(0.028f, 0.016f)
                arcToRelative(0.76f, 0.76f, 0f, false, false, 0.723f, 0f)
                lineToRelative(0.028f, -0.015f)
                lineToRelative(0.071f, -0.041f)
                arcToRelative(16.975f, 16.975f, 0f, false, false, 1.144f, -0.742f)
                arcToRelative(19.58f, 19.58f, 0f, false, false, 2.683f, -2.282f)
                curveToRelative(1.944f, -1.99f, 3.963f, -4.98f, 3.963f, -8.827f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, -16.5f, 0f)
                curveToRelative(0f, 3.846f, 2.02f, 6.837f, 3.963f, 8.827f)
                arcToRelative(19.58f, 19.58f, 0f, false, false, 2.682f, 2.282f)
                arcToRelative(16.975f, 16.975f, 0f, false, false, 1.145f, 0.742f)
                close()
                moveTo(12f, 13.5f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
            }
        }.build()
        
        return _MapPin!!
    }

private var _MapPin: ImageVector? = null

