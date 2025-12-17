package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Table_restaurant: ImageVector
    get() {
        if (_Table_restaurant != null) return _Table_restaurant!!
        
        _Table_restaurant = ImageVector.Builder(
            name = "table_restaurant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(672f, 440f)
                horizontalLineTo(289f)
                lineToRelative(-11f, 80f)
                horizontalLineToRelative(404f)
                lineToRelative(-10f, -80f)
                close()
                moveTo(166f, 755f)
                lineToRelative(43f, -315f)
                horizontalLineToRelative(-89f)
                quadToRelative(-20f, 0f, -31.5f, -16f)
                reflectiveQuadTo(82f, 389f)
                lineToRelative(57f, -200f)
                quadToRelative(4f, -13f, 14f, -21f)
                reflectiveQuadToRelative(24f, -8f)
                horizontalLineToRelative(606f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 21f)
                lineToRelative(57f, 200f)
                quadToRelative(5f, 19f, -6.5f, 35f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineToRelative(-88f)
                lineToRelative(42f, 315f)
                quadToRelative(2f, 18f, -9.5f, 31.5f)
                reflectiveQuadTo(755f, 800f)
                quadToRelative(-15f, 0f, -26.5f, -9.5f)
                reflectiveQuadTo(715f, 766f)
                lineToRelative(-22f, -166f)
                horizontalLineTo(267f)
                lineToRelative(-22f, 166f)
                quadToRelative(-2f, 15f, -13.5f, 24.5f)
                reflectiveQuadTo(205f, 800f)
                quadToRelative(-18f, 0f, -29.5f, -13.5f)
                reflectiveQuadTo(166f, 755f)
                close()
            }
        }.build()
        
        return _Table_restaurant!!
    }

private var _Table_restaurant: ImageVector? = null

