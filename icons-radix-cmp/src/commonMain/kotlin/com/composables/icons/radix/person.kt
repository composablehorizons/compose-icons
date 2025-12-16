package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Person: ImageVector
    get() {
        if (_Person != null) return _Person!!
        
        _Person = ImageVector.Builder(
            name = "person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50061f, 0.875f)
                curveTo(9.50223f, 0.87533f, 11.1254f, 2.49835f, 11.1256f, 4.5f)
                curveTo(11.1254f, 6.15524f, 10.0147f, 7.54948f, 8.49866f, 7.9834f)
                curveTo(9.69596f, 8.12806f, 10.7226f, 8.55058f, 11.4957f, 9.3125f)
                curveTo(12.4775f, 10.2802f, 12.9743f, 11.7208f, 12.9742f, 13.6006f)
                curveTo(12.9739f, 13.8626f, 12.7617f, 14.0752f, 12.4996f, 14.0752f)
                curveTo(12.2377f, 14.075f, 12.0254f, 13.8625f, 12.025f, 13.6006f)
                curveTo(12.0251f, 11.8806f, 11.5718f, 10.7206f, 10.8287f, 9.98828f)
                curveTo(10.0843f, 9.25473f, 8.97269f, 8.87501f, 7.49963f, 8.875f)
                curveTo(6.02676f, 8.87507f, 4.91492f, 9.25482f, 4.17053f, 9.98828f)
                curveTo(3.42772f, 10.7206f, 2.97424f, 11.8809f, 2.97424f, 13.6006f)
                curveTo(2.9739f, 13.8626f, 2.76176f, 14.0752f, 2.49963f, 14.0752f)
                curveTo(2.23769f, 14.075f, 2.02537f, 13.8625f, 2.02502f, 13.6006f)
                curveTo(2.02502f, 11.7211f, 2.52208f, 10.2802f, 3.50354f, 9.3125f)
                curveTo(4.27606f, 8.55116f, 5.30254f, 8.12935f, 6.49866f, 7.98438f)
                curveTo(4.98407f, 7.5496f, 3.87578f, 6.15428f, 3.87561f, 4.5f)
                curveTo(3.87582f, 2.49815f, 5.49871f, 0.875f, 7.50061f, 0.875f)
                close()
                moveTo(7.50061f, 1.82422f)
                curveTo(6.02338f, 1.82422f, 4.82504f, 3.02282f, 4.82483f, 4.5f)
                curveTo(4.82504f, 5.97718f, 6.02338f, 7.1748f, 7.50061f, 7.1748f)
                curveTo(8.97756f, 7.17447f, 10.1752f, 5.97698f, 10.1754f, 4.5f)
                curveTo(10.1752f, 3.02302f, 8.97756f, 1.82455f, 7.50061f, 1.82422f)
                close()
            }
        }.build()
        
        return _Person!!
    }

private var _Person: ImageVector? = null

