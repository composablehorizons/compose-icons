package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandSketch: ImageVector
    get() {
        if (_BrandSketch != null) return _BrandSketch!!
        
        _BrandSketch = ImageVector.Builder(
            name = "brand-sketch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.554f, 3.004f)
                horizontalLineToRelative(8.929f)
                arcToRelative(2f, 2f, 0f, false, true, 1.647f, 0.873f)
                lineToRelative(3.536f, 5.193f)
                arcToRelative(2.006f, 2.006f, 0f, false, true, -0.173f, 2.48f)
                lineToRelative(-8f, 8.79f)
                arcToRelative(2.007f, 2.007f, 0f, false, true, -2.97f, 0f)
                lineToRelative(-8f, -8.789f)
                arcToRelative(1f, 1f, 0f, false, true, -0.13f, -0.175f)
                lineToRelative(-0.012f, -0.026f)
                lineToRelative(-0.051f, -0.072f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, -0.056f, -2.063f)
                lineToRelative(0.09f, -0.146f)
                lineToRelative(3.541f, -5.193f)
                curveToRelative(0.372f, -0.544f, 0.987f, -0.87f, 1.649f, -0.872f)
            }
        }.build()
        
        return _BrandSketch!!
    }

private var _BrandSketch: ImageVector? = null

