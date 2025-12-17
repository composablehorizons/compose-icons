package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_bold: ImageVector
    get() {
        if (_Format_bold != null) return _Format_bold!!
        
        _Format_bold = ImageVector.Builder(
            name = "format_bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(272f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(352f, 200f)
                horizontalLineToRelative(141f)
                quadToRelative(65f, 0f, 120f, 40f)
                reflectiveQuadToRelative(55f, 111f)
                quadToRelative(0f, 51f, -23f, 78.5f)
                reflectiveQuadTo(602f, 469f)
                quadToRelative(25f, 11f, 55.5f, 41f)
                reflectiveQuadToRelative(30.5f, 90f)
                quadToRelative(0f, 89f, -65f, 124.5f)
                reflectiveQuadTo(501f, 760f)
                horizontalLineTo(352f)
                close()
                moveToRelative(41f, -112f)
                horizontalLineToRelative(104f)
                quadToRelative(48f, 0f, 58.5f, -24.5f)
                reflectiveQuadTo(566f, 588f)
                quadToRelative(0f, -11f, -10.5f, -35.5f)
                reflectiveQuadTo(494f, 528f)
                horizontalLineTo(393f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, -228f)
                horizontalLineToRelative(93f)
                quadToRelative(33f, 0f, 48f, -17f)
                reflectiveQuadToRelative(15f, -38f)
                quadToRelative(0f, -24f, -17f, -39f)
                reflectiveQuadToRelative(-44f, -15f)
                horizontalLineToRelative(-95f)
                verticalLineToRelative(109f)
                close()
            }
        }.build()
        
        return _Format_bold!!
    }

private var _Format_bold: ImageVector? = null

