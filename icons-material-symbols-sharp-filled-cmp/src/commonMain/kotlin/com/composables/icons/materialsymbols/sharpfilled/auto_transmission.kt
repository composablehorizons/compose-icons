package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_transmission: ImageVector
    get() {
        if (_Auto_transmission != null) return _Auto_transmission!!
        
        _Auto_transmission = ImageVector.Builder(
            name = "auto_transmission",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -70f)
                reflectiveQuadToRelative(57.5f, -43f)
                verticalLineToRelative(-254f)
                quadToRelative(-35f, -12f, -57.5f, -43f)
                reflectiveQuadTo(40f, 240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 70f)
                reflectiveQuadTo(200f, 353f)
                verticalLineToRelative(87f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-87f)
                quadToRelative(-35f, -12f, -57.5f, -43f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 70f)
                reflectiveQuadTo(520f, 353f)
                verticalLineToRelative(87f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-87f)
                quadToRelative(-35f, -12f, -57.5f, -43f)
                reflectiveQuadTo(680f, 240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 70f)
                reflectiveQuadTo(840f, 353f)
                verticalLineToRelative(167f)
                horizontalLineTo(520f)
                verticalLineToRelative(87f)
                quadToRelative(35f, 12f, 57.5f, 43f)
                reflectiveQuadToRelative(22.5f, 70f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -70f)
                reflectiveQuadToRelative(57.5f, -43f)
                verticalLineToRelative(-87f)
                horizontalLineTo(200f)
                verticalLineToRelative(87f)
                quadToRelative(35f, 12f, 57.5f, 43f)
                reflectiveQuadToRelative(22.5f, 70f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Auto_transmission!!
    }

private var _Auto_transmission: ImageVector? = null

