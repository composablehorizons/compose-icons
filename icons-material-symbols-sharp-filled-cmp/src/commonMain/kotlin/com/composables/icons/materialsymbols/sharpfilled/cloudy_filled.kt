package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Cloudy_filled: ImageVector
    get() {
        if (_Cloudy_filled != null) return _Cloudy_filled!!
        
        _Cloudy_filled = ImageVector.Builder(
            name = "cloudy_filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 20f)
                quadToRelative(-2.275f, 0f, -3.887f, -1.575f)
                quadTo(1f, 16.85f, 1f, 14.575f)
                quadToRelative(0f, -1.95f, 1.175f, -3.475f)
                quadTo(3.35f, 9.575f, 5.25f, 9.15f)
                quadToRelative(0.625f, -2.3f, 2.5f, -3.725f)
                quadTo(9.625f, 4f, 12f, 4f)
                quadToRelative(2.925f, 0f, 4.962f, 2.037f)
                quadTo(19f, 8.075f, 19f, 11f)
                quadToRelative(1.725f, 0.2f, 2.863f, 1.487f)
                quadTo(23f, 13.775f, 23f, 15.5f)
                quadToRelative(0f, 1.875f, -1.312f, 3.188f)
                quadTo(20.375f, 20f, 18.5f, 20f)
                close()
            }
        }.build()
        
        return _Cloudy_filled!!
    }

private var _Cloudy_filled: ImageVector? = null

