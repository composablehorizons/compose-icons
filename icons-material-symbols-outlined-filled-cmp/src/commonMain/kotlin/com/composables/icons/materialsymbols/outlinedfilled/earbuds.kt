package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Earbuds: ImageVector
    get() {
        if (_Earbuds != null) return _Earbuds!!
        
        _Earbuds = ImageVector.Builder(
            name = "earbuds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(120f, 640f)
                verticalLineToRelative(-392f)
                quadToRelative(0f, -54f, 33f, -91f)
                reflectiveQuadToRelative(87f, -37f)
                quadToRelative(54f, 0f, 87f, 33f)
                reflectiveQuadToRelative(33f, 87f)
                quadToRelative(0f, 51f, -34.5f, 85.5f)
                reflectiveQuadTo(240f, 360f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(840f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 51f, -38.5f, 85.5f)
                reflectiveQuadTo(712f, 840f)
                quadToRelative(-51f, 0f, -81.5f, -34.5f)
                reflectiveQuadTo(600f, 720f)
                quadToRelative(0f, -51f, 34.5f, -85.5f)
                reflectiveQuadTo(720f, 600f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(320f, 840f)
                close()
            }
        }.build()
        
        return _Earbuds!!
    }

private var _Earbuds: ImageVector? = null

