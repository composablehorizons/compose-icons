package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Money_range: ImageVector
    get() {
        if (_Money_range != null) return _Money_range!!
        
        _Money_range = ImageVector.Builder(
            name = "money_range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 900f)
                lineTo(80f, 760f)
                lineToRelative(140f, -140f)
                lineToRelative(57f, 56f)
                lineToRelative(-44f, 44f)
                horizontalLineToRelative(494f)
                lineToRelative(-43f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(140f, 140f)
                lineTo(740f, 900f)
                lineToRelative(-57f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineTo(233f)
                lineToRelative(43f, 44f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(260f, -460f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(120f, 560f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(480f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 160f)
                horizontalLineTo(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 480f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Money_range!!
    }

private var _Money_range: ImageVector? = null

