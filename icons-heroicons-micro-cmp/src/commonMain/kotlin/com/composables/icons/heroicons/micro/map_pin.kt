package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.MapPin: ImageVector
    get() {
        if (_MapPin != null) return _MapPin!!
        
        _MapPin = ImageVector.Builder(
            name = "map-pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.539f, 14.841f)
                lineToRelative(0.003f, 0.003f)
                lineToRelative(0.002f, 0.002f)
                arcToRelative(0.755f, 0.755f, 0f, false, false, 0.912f, 0f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(0.012f, -0.009f)
                arcToRelative(5.57f, 5.57f, 0f, false, false, 0.19f, -0.153f)
                arcToRelative(15.588f, 15.588f, 0f, false, false, 2.046f, -2.082f)
                curveToRelative(1.101f, -1.362f, 2.291f, -3.342f, 2.291f, -5.597f)
                arcTo(5f, 5f, 0f, false, false, 3f, 7f)
                curveToRelative(0f, 2.255f, 1.19f, 4.235f, 2.292f, 5.597f)
                arcToRelative(15.591f, 15.591f, 0f, false, false, 2.046f, 2.082f)
                arcToRelative(8.916f, 8.916f, 0f, false, false, 0.189f, 0.153f)
                lineToRelative(0.012f, 0.01f)
                close()
                moveTo(8f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                close()
            }
        }.build()
        
        return _MapPin!!
    }

private var _MapPin: ImageVector? = null

