package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Inventory_2: ImageVector
    get() {
        if (_Inventory_2 != null) return _Inventory_2!!
        
        _Inventory_2 = ImageVector.Builder(
            name = "inventory_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-451f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(80f, 280f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(840f, 349f)
                verticalLineToRelative(451f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-40f, -600f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(240f, 280f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 480f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 560f)
                close()
            }
        }.build()
        
        return _Inventory_2!!
    }

private var _Inventory_2: ImageVector? = null

