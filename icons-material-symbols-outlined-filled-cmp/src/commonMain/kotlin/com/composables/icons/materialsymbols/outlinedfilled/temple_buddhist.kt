package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Temple_buddhist: ImageVector
    get() {
        if (_Temple_buddhist != null) return _Temple_buddhist!!
        
        _Temple_buddhist = ImageVector.Builder(
            name = "temple_buddhist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(330f, 240f)
                lineToRelative(150f, -200f)
                lineToRelative(150f, 200f)
                horizontalLineTo(330f)
                close()
                moveToRelative(-90f, 160f)
                verticalLineToRelative(-46f)
                quadToRelative(-52f, -13f, -86f, -55f)
                reflectiveQuadToRelative(-34f, -98f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 32f, 23.5f, 55.5f)
                reflectiveQuadTo(279f, 280f)
                horizontalLineToRelative(402f)
                quadToRelative(32f, 0f, 55.5f, -23.5f)
                reflectiveQuadTo(760f, 201f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 56f, -34f, 98f)
                reflectiveQuadToRelative(-86f, 55f)
                verticalLineToRelative(46f)
                horizontalLineTo(240f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-366f)
                quadToRelative(-52f, -13f, -86f, -55f)
                reflectiveQuadToRelative(-34f, -98f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 32f, 23.5f, 55.5f)
                reflectiveQuadTo(199f, 440f)
                horizontalLineToRelative(562f)
                quadToRelative(32f, 0f, 55.5f, -23.5f)
                reflectiveQuadTo(840f, 361f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 56f, -34f, 98f)
                reflectiveQuadToRelative(-86f, 55f)
                verticalLineToRelative(366f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Temple_buddhist!!
    }

private var _Temple_buddhist: ImageVector? = null

