package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Propane: ImageVector
    get() {
        if (_Propane != null) return _Propane!!
        
        _Propane = ImageVector.Builder(
            name = "propane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-40f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-80f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Propane!!
    }

private var _Propane: ImageVector? = null

