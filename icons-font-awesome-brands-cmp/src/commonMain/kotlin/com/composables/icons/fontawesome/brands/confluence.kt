package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Confluence: ImageVector
    get() {
        if (_Confluence != null) return _Confluence!!
        
        _Confluence = ImageVector.Builder(
            name = "confluence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.3f, 412.2f)
                curveToRelative(-4.5f, 7.6f, -2.1f, 17.5f, 5.5f, 22.2f)
                lineToRelative(105.9f, 65.2f)
                curveToRelative(7.7f, 4.7f, 17.7f, 2.4f, 22.4f, -5.3f)
                curveToRelative(0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.2f)
                curveToRelative(67.1f, -112.2f, 80.5f, -95.9f, 280.9f, -0.7f)
                curveToRelative(8.1f, 3.9f, 17.8f, 0.4f, 21.7f, -7.7f)
                curveToRelative(0.1f, -0.1f, 0.1f, -0.3f, 0.2f, -0.4f)
                lineToRelative(50.4f, -114.1f)
                curveToRelative(3.6f, -8.1f, -0.1f, -17.6f, -8.1f, -21.3f)
                curveToRelative(-22.2f, -10.4f, -66.2f, -31.2f, -105.9f, -50.3f)
                curveTo(127.5f, 179f, 44.6f, 345.3f, 2.3f, 412.2f)
                close()
                moveToRelative(507.4f, -312.1f)
                curveToRelative(4.5f, -7.6f, 2.1f, -17.5f, -5.5f, -22.2f)
                lineTo(398.4f, 12.8f)
                curveToRelative(-7.5f, -5f, -17.6f, -3.1f, -22.6f, 4.4f)
                curveToRelative(-0.2f, 0.3f, -0.4f, 0.6f, -0.6f, 1f)
                curveToRelative(-67.3f, 112.6f, -81.1f, 95.6f, -280.6f, 0.9f)
                curveToRelative(-8.1f, -3.9f, -17.8f, -0.4f, -21.7f, 7.7f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.3f, -0.2f, 0.4f)
                lineTo(22.2f, 141.3f)
                curveToRelative(-3.6f, 8.1f, 0.1f, 17.6f, 8.1f, 21.3f)
                curveToRelative(22.2f, 10.4f, 66.3f, 31.2f, 106f, 50.4f)
                curveToRelative(248f, 120f, 330.8f, -45.4f, 373.4f, -112.9f)
                close()
            }
        }.build()
        
        return _Confluence!!
    }

private var _Confluence: ImageVector? = null

