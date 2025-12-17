package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Female: ImageVector
    get() {
        if (_Female != null) return _Female!!
        
        _Female = ImageVector.Builder(
            name = "female",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-84f)
                quadToRelative(-79f, -14f, -129.5f, -75.5f)
                reflectiveQuadTo(260f, 378f)
                quadToRelative(0f, -91f, 64.5f, -154.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(91f, 0f, 155.5f, 63.5f)
                reflectiveQuadTo(700f, 378f)
                quadToRelative(0f, 81f, -50.5f, 142.5f)
                reflectiveQuadTo(520f, 596f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -320f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
            }
        }.build()
        
        return _Female!!
    }

private var _Female: ImageVector? = null

