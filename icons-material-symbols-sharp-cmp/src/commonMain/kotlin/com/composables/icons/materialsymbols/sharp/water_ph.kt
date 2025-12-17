package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Water_ph: ImageVector
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
                moveTo(360f, 878f)
                quadTo(238f, 864f, 159f, 773f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(161f, 137f, 240.5f, 254.5f)
                reflectiveQuadTo(720f, 552f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -73f, -60.5f, -165f)
                reflectiveQuadTo(400f, 186f)
                quadTo(281f, 295f, 220.5f, 387f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, 97f, 56f, 164f)
                reflectiveQuadToRelative(144f, 81f)
                verticalLineToRelative(81f)
                close()
                moveToRelative(40f, -387f)
                close()
                moveToRelative(40f, 389f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineTo(500f)
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
            }
        }.build()
        
        return _Water_ph!!
    }

private var _Water_ph: ImageVector? = null

