package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Telegram: ImageVector
    get() {
        if (_Telegram != null) return _Telegram!!
        
        _Telegram = ImageVector.Builder(
            name = "telegram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(121.8f, 169.9f)
                lineToRelative(-40.7f, 191.8f)
                curveToRelative(-3f, 13.6f, -11.1f, 16.9f, -22.4f, 10.5f)
                lineToRelative(-62f, -45.7f)
                lineToRelative(-29.9f, 28.8f)
                curveToRelative(-3.3f, 3.3f, -6.1f, 6.1f, -12.5f, 6.1f)
                lineToRelative(4.4f, -63.1f)
                lineToRelative(114.9f, -103.8f)
                curveToRelative(5f, -4.4f, -1.1f, -6.9f, -7.7f, -2.5f)
                lineToRelative(-142f, 89.4f)
                lineToRelative(-61.2f, -19.1f)
                curveToRelative(-13.3f, -4.2f, -13.6f, -13.3f, 2.8f, -19.7f)
                lineToRelative(239.1f, -92.2f)
                curveToRelative(11.1f, -4f, 20.8f, 2.7f, 17.2f, 19.5f)
                close()
            }
        }.build()
        
        return _Telegram!!
    }

private var _Telegram: ImageVector? = null

