package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Water_orp: ImageVector
    get() {
        if (_Water_orp != null) return _Water_orp!!
        
        _Water_orp = ImageVector.Builder(
            name = "water_orp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 80f)
                quadToRelative(161f, 137f, 240.5f, 254.5f)
                reflectiveQuadTo(720f, 552f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -73f, -60.5f, -165f)
                reflectiveQuadTo(400f, 186f)
                quadTo(281f, 295f, 220.5f, 387f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, 28f, 5f, 54f)
                reflectiveQuadToRelative(15f, 49f)
                verticalLineToRelative(139f)
                quadToRelative(-47f, -45f, -73.5f, -107f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(400f, 80f)
                close()
                moveToRelative(0f, 341f)
                close()
                moveTo(260f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(240f)
                horizontalLineTo(260f)
                close()
                moveToRelative(60f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(160f, 60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(156f)
                horizontalLineToRelative(-36f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-34f, -80f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineTo(780f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(540f, 740f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Water_orp!!
    }

private var _Water_orp: ImageVector? = null

