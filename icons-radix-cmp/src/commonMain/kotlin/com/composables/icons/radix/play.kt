package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.24219f, 2.32213f)
                curveTo(3.39223f, 2.23169f, 3.57845f, 2.22573f, 3.7334f, 2.30748f)
                lineTo(12.7334f, 7.05748f)
                curveTo(12.8974f, 7.14403f, 13f, 7.31443f, 13f, 7.49986f)
                curveTo(13f, 7.68529f, 12.8974f, 7.85569f, 12.7334f, 7.94224f)
                lineTo(3.7334f, 12.6922f)
                curveTo(3.57845f, 12.774f, 3.39223f, 12.768f, 3.24219f, 12.6776f)
                curveTo(3.09211f, 12.5871f, 3f, 12.4251f, 3f, 12.2499f)
                verticalLineTo(2.74986f)
                curveTo(3f, 2.57461f, 3.09211f, 2.41261f, 3.24219f, 2.32213f)
                close()
                moveTo(4f, 11.4198f)
                lineTo(11.4277f, 7.49986f)
                lineTo(4f, 3.57896f)
                verticalLineTo(11.4198f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

