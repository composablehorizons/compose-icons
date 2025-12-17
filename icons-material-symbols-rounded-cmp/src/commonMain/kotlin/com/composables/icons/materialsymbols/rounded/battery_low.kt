package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_low: ImageVector
    get() {
        if (_Battery_low != null) return _Battery_low!!
        
        _Battery_low = ImageVector.Builder(
            name = "battery_low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(200f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Battery_low!!
    }

private var _Battery_low: ImageVector? = null

