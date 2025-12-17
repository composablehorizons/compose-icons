package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Ioxhost: ImageVector
    get() {
        if (_Ioxhost != null) return _Ioxhost!!
        
        _Ioxhost = ImageVector.Builder(
            name = "ioxhost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(616f, 160f)
                horizontalLineToRelative(-67.3f)
                curveTo(511.2f, 70.7f, 422.9f, 8f, 320f, 8f)
                curveTo(183f, 8f, 72f, 119f, 72f, 256f)
                curveToRelative(0f, 16.4f, 1.6f, 32.5f, 4.7f, 48f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, 10.8f, -24f, 24f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(67.3f)
                curveToRelative(37.5f, 89.3f, 125.8f, 152f, 228.7f, 152f)
                curveToRelative(137f, 0f, 248f, -111f, 248f, -248f)
                curveToRelative(0f, -16.4f, -1.6f, -32.5f, -4.7f, -48f)
                horizontalLineTo(616f)
                curveToRelative(13.3f, 0f, 24f, -10.8f, 24f, -24f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(-96f, 96f)
                curveToRelative(0f, 110.5f, -89.5f, 200f, -200f, 200f)
                curveToRelative(-75.7f, 0f, -141.6f, -42f, -175.5f, -104f)
                horizontalLineTo(424f)
                curveToRelative(13.3f, 0f, 24f, -10.8f, 24f, -24f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(125.8f)
                curveToRelative(-3.8f, -15.4f, -5.8f, -31.4f, -5.8f, -48f)
                curveToRelative(0f, -110.5f, 89.5f, -200f, 200f, -200f)
                curveToRelative(75.7f, 0f, 141.6f, 42f, 175.5f, 104f)
                horizontalLineTo(216f)
                curveToRelative(-13.3f, 0f, -24f, 10.8f, -24f, 24f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(298.2f)
                curveToRelative(3.8f, 15.4f, 5.8f, 31.4f, 5.8f, 48f)
                close()
                moveToRelative(-304f, -24f)
                horizontalLineToRelative(208f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                curveToRelative(0f, 13.2f, -10.7f, 24f, -24f, 24f)
                horizontalLineTo(216f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                curveToRelative(0f, -13.2f, 10.7f, -24f, 24f, -24f)
                close()
            }
        }.build()
        
        return _Ioxhost!!
    }

private var _Ioxhost: ImageVector? = null

