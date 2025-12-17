package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Water_ph: ImageVector
    get() {
        if (_Water_ph != null) return _Water_ph!!
        
        _Water_ph = ImageVector.Builder(
            name = "water_ph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(500f, 740f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveTo(360f, 878f)
                quadTo(238f, 864f, 159f, 773f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(161f, 137f, 240.5f, 254.5f)
                reflectiveQuadTo(720f, 552f)
                verticalLineToRelative(8f)
                horizontalLineTo(440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(238f)
                close()
            }
        }.build()
        
        return _Water_ph!!
    }

private var _Water_ph: ImageVector? = null

