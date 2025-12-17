package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Household_supplies: ImageVector
    get() {
        if (_Household_supplies != null) return _Household_supplies!!
        
        _Household_supplies = ImageVector.Builder(
            name = "household_supplies",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-252f)
                quadToRelative(0f, -74f, 21f, -142.5f)
                reflectiveQuadTo(327f, 349f)
                quadToRelative(-38f, -9f, -62.5f, -41f)
                reflectiveQuadTo(240f, 236f)
                verticalLineToRelative(-42f)
                quadToRelative(0f, -48f, 41.5f, -80.5f)
                reflectiveQuadTo(368f, 86f)
                lineToRelative(392f, 39f)
                verticalLineToRelative(191f)
                lineToRelative(-72f, 8f)
                quadToRelative(14f, 49f, 37f, 88f)
                reflectiveQuadToRelative(55f, 56f)
                lineToRelative(-40f, 70f)
                quadToRelative(-53f, -31f, -82f, -85.5f)
                reflectiveQuadTo(612f, 331f)
                lineToRelative(-44f, 4f)
                quadToRelative(8f, 50f, 30.5f, 101f)
                reflectiveQuadToRelative(45.5f, 92f)
                quadToRelative(18f, 32f, 27f, 67f)
                reflectiveQuadToRelative(9f, 71f)
                verticalLineToRelative(214f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -676f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 18f, 13f, 29f)
                reflectiveQuadToRelative(31f, 9f)
                lineToRelative(316f, -30f)
                verticalLineToRelative(-48f)
                lineToRelative(-316f, -30f)
                quadToRelative(-18f, -2f, -31f, 9f)
                reflectiveQuadToRelative(-13f, 29f)
                close()
            }
        }.build()
        
        return _Household_supplies!!
    }

private var _Household_supplies: ImageVector? = null

