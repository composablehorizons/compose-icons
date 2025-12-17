package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Table_lamp: ImageVector
    get() {
        if (_Table_lamp != null) return _Table_lamp!!
        
        _Table_lamp = ImageVector.Builder(
            name = "table_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 280f)
                horizontalLineTo(440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 440f)
                horizontalLineTo(160f)
                quadToRelative(-22f, 0f, -34f, -18f)
                reflectiveQuadToRelative(-3f, -38f)
                lineToRelative(95f, -216f)
                quadToRelative(10f, -22f, 29.5f, -35f)
                reflectiveQuadToRelative(43.5f, -13f)
                horizontalLineToRelative(69f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 200f)
                horizontalLineToRelative(160f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Table_lamp!!
    }

private var _Table_lamp: ImageVector? = null

