package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_wifi_gale: ImageVector
    get() {
        if (_Nest_wifi_gale != null) return _Nest_wifi_gale!!
        
        _Nest_wifi_gale = ImageVector.Builder(
            name = "nest_wifi_gale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 20f)
                lineToRelative(-0.325f, -1f)
                horizontalLineTo(4.15f)
                quadToRelative(-0.875f, 0f, -1.462f, -0.625f)
                quadToRelative(-0.588f, -0.625f, -0.538f, -1.5f)
                lineToRelative(0.725f, -11f)
                quadToRelative(0.05f, -0.8f, 0.625f, -1.338f)
                quadTo(4.075f, 4f, 4.875f, 4f)
                horizontalLineToRelative(14.25f)
                quadToRelative(0.8f, 0f, 1.375f, 0.537f)
                quadToRelative(0.575f, 0.538f, 0.625f, 1.338f)
                lineToRelative(0.725f, 11f)
                quadToRelative(0.05f, 0.875f, -0.538f, 1.5f)
                quadToRelative(-0.587f, 0.625f, -1.462f, 0.625f)
                horizontalLineToRelative(-0.525f)
                lineTo(19f, 20f)
                close()
                moveToRelative(-0.4f, -10f)
                horizontalLineToRelative(14.8f)
                lineToRelative(-0.275f, -4f)
                horizontalLineTo(4.875f)
                close()
                moveToRelative(-0.45f, 7f)
                horizontalLineToRelative(15.7f)
                lineToRelative(-0.325f, -5f)
                horizontalLineTo(4.475f)
                lineToRelative(-0.325f, 5f)
                close()
            }
        }.build()
        
        return _Nest_wifi_gale!!
    }

private var _Nest_wifi_gale: ImageVector? = null

