package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Table_edit: ImageVector
    get() {
        if (_Table_edit != null) return _Table_edit!!
        
        _Table_edit = ImageVector.Builder(
            name = "table_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveTo(560f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -16f, 6.5f, -30.5f)
                reflectiveQuadTo(544f, 734f)
                lineToRelative(197f, -197f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(863f, 660f)
                lineTo(666f, 857f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadTo(610f, 880f)
                horizontalLineToRelative(-50f)
                close()
                moveToRelative(223f, -224f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(92f)
                quadToRelative(-38f, -17f, -81f, -10f)
                reflectiveQuadToRelative(-75f, 39f)
                lineToRelative(-79f, 79f)
                horizontalLineToRelative(-85f)
                close()
            }
        }.build()
        
        return _Table_edit!!
    }

private var _Table_edit: ImageVector? = null

