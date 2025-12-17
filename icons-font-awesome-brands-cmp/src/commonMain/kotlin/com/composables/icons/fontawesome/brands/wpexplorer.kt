package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Wpexplorer: ImageVector
    get() {
        if (_Wpexplorer != null) return _Wpexplorer!!
        
        _Wpexplorer = ImageVector.Builder(
            name = "wpexplorer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 256f)
                curveToRelative(0f, 141.2f, -114.7f, 256f, -256f, 256f)
                curveTo(114.8f, 512f, 0f, 397.3f, 0f, 256f)
                reflectiveCurveTo(114.7f, 0f, 256f, 0f)
                reflectiveCurveToRelative(256f, 114.7f, 256f, 256f)
                close()
                moveToRelative(-32f, 0f)
                curveToRelative(0f, -123.2f, -100.3f, -224f, -224f, -224f)
                curveTo(132.5f, 32f, 32f, 132.5f, 32f, 256f)
                reflectiveCurveToRelative(100.5f, 224f, 224f, 224f)
                reflectiveCurveToRelative(224f, -100.5f, 224f, -224f)
                close()
                moveTo(160.9f, 124.6f)
                lineToRelative(86.9f, 37.1f)
                lineToRelative(-37.1f, 86.9f)
                lineToRelative(-86.9f, -37.1f)
                lineToRelative(37.1f, -86.9f)
                close()
                moveToRelative(110f, 169.1f)
                lineToRelative(46.6f, 94f)
                horizontalLineToRelative(-14.6f)
                lineToRelative(-50f, -100f)
                lineToRelative(-48.9f, 100f)
                horizontalLineToRelative(-14f)
                lineToRelative(51.1f, -106.9f)
                lineToRelative(-22.3f, -9.4f)
                lineToRelative(6f, -14f)
                lineToRelative(68.6f, 29.1f)
                lineToRelative(-6f, 14.3f)
                lineToRelative(-16.5f, -7.1f)
                close()
                moveToRelative(-11.8f, -116.3f)
                lineToRelative(68.6f, 29.4f)
                lineToRelative(-29.4f, 68.3f)
                lineTo(230f, 246f)
                lineToRelative(29.1f, -68.6f)
                close()
                moveToRelative(80.3f, 42.9f)
                lineToRelative(54.6f, 23.1f)
                lineToRelative(-23.4f, 54.3f)
                lineToRelative(-54.3f, -23.1f)
                lineToRelative(23.1f, -54.3f)
                close()
            }
        }.build()
        
        return _Wpexplorer!!
    }

private var _Wpexplorer: ImageVector? = null

