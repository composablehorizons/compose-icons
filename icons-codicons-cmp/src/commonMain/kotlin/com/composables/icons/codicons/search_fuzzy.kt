package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SearchFuzzy: ImageVector
    get() {
        if (_SearchFuzzy != null) return _SearchFuzzy!!
        
        _SearchFuzzy = ImageVector.Builder(
            name = "search-fuzzy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.8541f, 13.146f)
                lineTo(10.0161f, 9.30802f)
                curveTo(10.6321f, 8.53802f, 11.0001f, 7.56202f, 11.0001f, 6.49902f)
                curveTo(11.0001f, 4.01402f, 8.98505f, 1.99902f, 6.50005f, 1.99902f)
                curveTo(4.01505f, 1.99902f, 2.00005f, 4.01402f, 2.00005f, 6.49902f)
                curveTo(2.00005f, 8.98402f, 4.01505f, 10.999f, 6.50005f, 10.999f)
                curveTo(7.56205f, 10.999f, 8.53905f, 10.631f, 9.30905f, 10.015f)
                lineTo(13.1471f, 13.853f)
                curveTo(13.3421f, 14.048f, 13.6591f, 14.048f, 13.8541f, 13.853f)
                curveTo(14.0491f, 13.658f, 14.0491f, 13.341f, 13.8541f, 13.146f)
                close()
                moveTo(6.50005f, 10f)
                curveTo(4.56705f, 10f, 3.00005f, 8.43302f, 3.00005f, 6.50002f)
                curveTo(3.00005f, 4.56702f, 4.56705f, 3.00002f, 6.50005f, 3.00002f)
                curveTo(8.43305f, 3.00002f, 10.0001f, 4.56702f, 10.0001f, 6.50002f)
                curveTo(10.0001f, 8.43302f, 8.43305f, 10f, 6.50005f, 10f)
                close()
                moveTo(10.8531f, 15.147f)
                curveTo(11.0481f, 15.342f, 11.0481f, 15.659f, 10.8531f, 15.854f)
                curveTo(10.6581f, 16.049f, 10.3411f, 16.049f, 10.1461f, 15.854f)
                lineTo(8.50105f, 14.208f)
                lineTo(6.85505f, 15.854f)
                curveTo(6.66805f, 16.042f, 6.33605f, 16.042f, 6.14805f, 15.854f)
                lineTo(4.50205f, 14.208f)
                lineTo(2.85405f, 15.854f)
                curveTo(2.75605f, 15.951f, 2.62805f, 16f, 2.50005f, 16f)
                curveTo(2.37205f, 16f, 2.24405f, 15.952f, 2.14605f, 15.854f)
                lineTo(0.144053f, 13.854f)
                curveTo(-0.0509473f, 13.659f, -0.0509473f, 13.342f, 0.144053f, 13.147f)
                curveTo(0.339053f, 12.952f, 0.656053f, 12.952f, 0.851053f, 13.147f)
                lineTo(2.49905f, 14.794f)
                lineTo(4.14705f, 13.147f)
                curveTo(4.34205f, 12.952f, 4.65905f, 12.952f, 4.85405f, 13.147f)
                lineTo(6.50005f, 14.793f)
                lineTo(8.14605f, 13.147f)
                curveTo(8.24005f, 13.054f, 8.36705f, 13.001f, 8.50005f, 13.001f)
                curveTo(8.63305f, 13.001f, 8.76005f, 13.053f, 8.85405f, 13.147f)
                lineTo(10.8531f, 15.147f)
                close()
            }
        }.build()
        
        return _SearchFuzzy!!
    }

private var _SearchFuzzy: ImageVector? = null

