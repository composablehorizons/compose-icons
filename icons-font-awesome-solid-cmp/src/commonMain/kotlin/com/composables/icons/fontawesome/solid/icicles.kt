package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Icicles: ImageVector
    get() {
        if (_Icicles != null) return _Icicles!!
        
        _Icicles = ImageVector.Builder(
            name = "icicles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(511.4f, 37.9f)
                curveTo(515.1f, 18.2f, 500f, 0f, 480f, 0f)
                horizontalLineTo(32f)
                curveTo(10.6f, 0f, -4.8f, 20.7f, 1.4f, 41.2f)
                lineToRelative(87.1f, 273.4f)
                curveToRelative(2.5f, 7.2f, 12.7f, 7.2f, 15.1f, 0f)
                lineTo(140f, 190.5f)
                lineToRelative(44.2f, 187.3f)
                curveToRelative(1.9f, 8.3f, 13.7f, 8.3f, 15.6f, 0f)
                lineToRelative(46.5f, -196.9f)
                lineToRelative(34.1f, 133.4f)
                curveToRelative(2.3f, 7.6f, 13f, 7.6f, 15.3f, 0f)
                lineToRelative(45.8f, -172.5f)
                lineToRelative(66.7f, 363.8f)
                curveToRelative(1.7f, 8.6f, 14f, 8.6f, 15.7f, 0f)
                lineToRelative(87.5f, -467.7f)
                close()
            }
        }.build()
        
        return _Icicles!!
    }

private var _Icicles: ImageVector? = null

