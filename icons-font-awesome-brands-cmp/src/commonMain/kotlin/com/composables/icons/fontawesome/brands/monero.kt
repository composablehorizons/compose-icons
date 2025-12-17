package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Monero: ImageVector
    get() {
        if (_Monero != null) return _Monero!!
        
        _Monero = ImageVector.Builder(
            name = "monero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 384f)
                horizontalLineToRelative(108.4f)
                curveTo(417f, 455.9f, 338.1f, 504f, 248f, 504f)
                reflectiveCurveTo(79f, 455.9f, 35.6f, 384f)
                horizontalLineTo(144f)
                verticalLineTo(256.2f)
                lineTo(248f, 361f)
                lineToRelative(104f, -105f)
                verticalLineToRelative(128f)
                close()
                moveTo(88f, 336f)
                verticalLineTo(128f)
                lineToRelative(159.4f, 159.4f)
                lineTo(408f, 128f)
                verticalLineToRelative(208f)
                horizontalLineToRelative(74.8f)
                curveToRelative(8.5f, -25.1f, 13.2f, -52f, 13.2f, -80f)
                curveTo(496f, 119f, 385f, 8f, 248f, 8f)
                reflectiveCurveTo(0f, 119f, 0f, 256f)
                curveToRelative(0f, 28f, 4.6f, 54.9f, 13.2f, 80f)
                horizontalLineTo(88f)
                close()
            }
        }.build()
        
        return _Monero!!
    }

private var _Monero: ImageVector? = null

