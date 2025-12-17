package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Utensils: ImageVector
    get() {
        if (_Utensils != null) return _Utensils!!
        
        _Utensils = ImageVector.Builder(
            name = "utensils",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 416f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(207.9f, 15.2f)
                curveToRelative(0.8f, 4.7f, 16.1f, 94.5f, 16.1f, 128.8f)
                curveToRelative(0f, 52.3f, -27.8f, 89.6f, -68.9f, 104.6f)
                lineTo(168f, 486.7f)
                curveToRelative(0.7f, 13.7f, -10.2f, 25.3f, -24f, 25.3f)
                horizontalLineTo(80f)
                curveToRelative(-13.7f, 0f, -24.7f, -11.5f, -24f, -25.3f)
                lineToRelative(12.9f, -238.1f)
                curveTo(27.7f, 233.6f, 0f, 196.2f, 0f, 144f)
                curveTo(0f, 109.6f, 15.3f, 19.9f, 16.1f, 15.2f)
                curveTo(19.3f, -5.1f, 61.4f, -5.4f, 64f, 16.3f)
                verticalLineToRelative(141.2f)
                curveToRelative(1.3f, 3.4f, 15.1f, 3.2f, 16f, 0f)
                curveToRelative(1.4f, -25.3f, 7.9f, -139.2f, 8f, -141.8f)
                curveToRelative(3.3f, -20.8f, 44.7f, -20.8f, 47.9f, 0f)
                curveToRelative(0.2f, 2.7f, 6.6f, 116.5f, 8f, 141.8f)
                curveToRelative(0.9f, 3.2f, 14.8f, 3.4f, 16f, 0f)
                verticalLineTo(16.3f)
                curveToRelative(2.6f, -21.6f, 44.8f, -21.4f, 48f, -1.1f)
                close()
                moveToRelative(119.2f, 285.7f)
                lineToRelative(-15f, 185.1f)
                curveToRelative(-1.2f, 14f, 9.9f, 26f, 23.9f, 26f)
                horizontalLineToRelative(56f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.2f, -10.7f, -24f, -24f, -24f)
                curveToRelative(-82.5f, 0f, -221.4f, 178.5f, -64.9f, 300.9f)
                close()
            }
        }.build()
        
        return _Utensils!!
    }

private var _Utensils: ImageVector? = null

