package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.StarEmpty: ImageVector
    get() {
        if (_StarEmpty != null) return _StarEmpty!!
        
        _StarEmpty = ImageVector.Builder(
            name = "star-empty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.928f, 15f)
                curveTo(11.774f, 15f, 11.625f, 14.962f, 11.484f, 14.889f)
                lineTo(8f, 13.056f)
                lineTo(4.516f, 14.888f)
                curveTo(4.132f, 15.092f, 3.623f, 14.99f, 3.339f, 14.656f)
                curveTo(3.157f, 14.438f, 3.084f, 14.164f, 3.131f, 13.883f)
                lineTo(3.797f, 10.003f)
                lineTo(0.978f, 7.25499f)
                curveTo(0.713f, 6.99699f, 0.623f, 6.63199f, 0.736f, 6.27899f)
                curveTo(0.852f, 5.92399f, 1.139f, 5.68099f, 1.506f, 5.62699f)
                lineTo(5.402f, 5.06099f)
                lineTo(7.144f, 1.53099f)
                curveTo(7.472f, 0.864994f, 8.527f, 0.864994f, 8.855f, 1.53099f)
                lineTo(10.597f, 5.06099f)
                lineTo(14.493f, 5.62699f)
                curveTo(14.861f, 5.68099f, 15.148f, 5.92299f, 15.263f, 6.27499f)
                curveTo(15.377f, 6.63099f, 15.286f, 6.99599f, 15.022f, 7.25399f)
                lineTo(12.203f, 10.002f)
                lineTo(12.869f, 13.882f)
                curveTo(12.917f, 14.164f, 12.844f, 14.437f, 12.664f, 14.653f)
                curveTo(12.479f, 14.871f, 12.204f, 15f, 11.928f, 15f)
                close()
                moveTo(7.959f, 1.97399f)
                lineTo(6.066f, 5.97499f)
                lineTo(1.65f, 6.61599f)
                lineTo(4.871f, 9.65299f)
                lineTo(4.117f, 14.05f)
                lineTo(8f, 11.925f)
                lineTo(11.892f, 13.972f)
                lineTo(11.129f, 9.65299f)
                lineTo(14.324f, 6.53799f)
                lineTo(9.934f, 5.97499f)
                lineTo(7.959f, 1.97399f)
                close()
            }
        }.build()
        
        return _StarEmpty!!
    }

private var _StarEmpty: ImageVector? = null

