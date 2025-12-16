package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Location: ImageVector
    get() {
        if (_Location != null) return _Location!!
        
        _Location = ImageVector.Builder(
            name = "location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(11.3137f, 1f, 14f, 3.68629f, 14f, 7f)
                curveTo(14f, 9.87377f, 10.9031f, 13.016f, 9.15918f, 14.5576f)
                curveTo(8.49082f, 15.1484f, 7.50918f, 15.1484f, 6.84082f, 14.5576f)
                curveTo(5.09688f, 13.016f, 2f, 9.87377f, 2f, 7f)
                curveTo(2f, 3.68629f, 4.68629f, 1f, 8f, 1f)
                close()
                moveTo(8f, 2f)
                curveTo(5.23858f, 2f, 3f, 4.23858f, 3f, 7f)
                curveTo(3f, 8.10839f, 3.61436f, 9.39536f, 4.56934f, 10.6826f)
                curveTo(5.50328f, 11.9415f, 6.65741f, 13.0603f, 7.50391f, 13.8086f)
                curveTo(7.79391f, 14.0647f, 8.20609f, 14.0647f, 8.49609f, 13.8086f)
                curveTo(9.34259f, 13.0603f, 10.4967f, 11.9415f, 11.4307f, 10.6826f)
                curveTo(12.3856f, 9.39536f, 13f, 8.10839f, 13f, 7f)
                curveTo(13f, 4.23858f, 10.7614f, 2f, 8f, 2f)
                close()
                moveTo(8f, 4.75f)
                curveTo(9.24264f, 4.75f, 10.25f, 5.75736f, 10.25f, 7f)
                curveTo(10.25f, 8.24264f, 9.24264f, 9.25f, 8f, 9.25f)
                curveTo(6.75736f, 9.25f, 5.75f, 8.24264f, 5.75f, 7f)
                curveTo(5.75f, 5.75736f, 6.75736f, 4.75f, 8f, 4.75f)
                close()
                moveTo(8f, 5.75f)
                curveTo(7.30964f, 5.75f, 6.75f, 6.30964f, 6.75f, 7f)
                curveTo(6.75f, 7.69036f, 7.30964f, 8.25f, 8f, 8.25f)
                curveTo(8.69036f, 8.25f, 9.25f, 7.69036f, 9.25f, 7f)
                curveTo(9.25f, 6.30964f, 8.69036f, 5.75f, 8f, 5.75f)
                close()
            }
        }.build()
        
        return _Location!!
    }

private var _Location: ImageVector? = null

