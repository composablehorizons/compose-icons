package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.StarFilled: ImageVector
    get() {
        if (_StarFilled != null) return _StarFilled!!
        
        _StarFilled = ImageVector.Builder(
            name = "star-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22257f, 0.665927f)
                curveTo(7.32508f, 0.419634f, 7.67476f, 0.419617f, 7.77726f, 0.665927f)
                lineTo(9.413f, 4.6005f)
                curveTo(9.45615f, 4.70425f, 9.55396f, 4.77497f, 9.66593f, 4.78409f)
                lineTo(13.914f, 5.12491f)
                curveTo(14.1799f, 5.14635f, 14.2875f, 5.47869f, 14.0849f, 5.65226f)
                lineTo(10.8485f, 8.42374f)
                curveTo(10.7632f, 8.49693f, 10.7258f, 8.61221f, 10.7519f, 8.72159f)
                lineTo(11.7411f, 12.8661f)
                curveTo(11.803f, 13.1256f, 11.5206f, 13.331f, 11.2929f, 13.1923f)
                lineTo(7.65616f, 10.9706f)
                curveTo(7.56022f, 10.9121f, 7.43961f, 10.9121f, 7.34366f, 10.9706f)
                lineTo(3.70694f, 13.1923f)
                curveTo(3.47926f, 13.3311f, 3.19681f, 13.1256f, 3.2587f, 12.8661f)
                lineTo(4.24796f, 8.72159f)
                curveTo(4.27405f, 8.61223f, 4.23661f, 8.49693f, 4.15128f, 8.42374f)
                lineTo(0.914951f, 5.65226f)
                curveTo(0.712311f, 5.47867f, 0.819914f, 5.1463f, 1.08585f, 5.12491f)
                lineTo(5.3339f, 4.78409f)
                curveTo(5.44584f, 4.77494f, 5.54368f, 4.70422f, 5.58683f, 4.6005f)
                lineTo(7.22257f, 0.665927f)
                close()
            }
        }.build()
        
        return _StarFilled!!
    }

private var _StarFilled: ImageVector? = null

