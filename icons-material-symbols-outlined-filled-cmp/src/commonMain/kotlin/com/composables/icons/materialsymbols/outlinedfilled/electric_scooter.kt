package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Electric_scooter: ImageVector
    get() {
        if (_Electric_scooter != null) return _Electric_scooter!!
        
        _Electric_scooter = ImageVector.Builder(
            name = "electric_scooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 720f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(312f, 560f)
                horizontalLineToRelative(212f)
                quadToRelative(11f, -68f, 56.5f, -119f)
                reflectiveQuadTo(692f, 370f)
                lineToRelative(-56f, -250f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(156f)
                quadToRelative(27f, 0f, 49.5f, 17.5f)
                reflectiveQuadTo(714f, 102f)
                lineToRelative(76f, 338f)
                horizontalLineToRelative(-30f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineTo(312f)
                quadToRelative(-12f, 35f, -42.5f, 57.5f)
                reflectiveQuadTo(200f, 720f)
                close()
                moveToRelative(560f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(520f, 920f)
                lineTo(280f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                lineToRelative(240f, 120f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Electric_scooter!!
    }

private var _Electric_scooter: ImageVector? = null

