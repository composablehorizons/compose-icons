package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chair: ImageVector
    get() {
        if (_Chair != null) return _Chair!!
        
        _Chair = ImageVector.Builder(
            name = "chair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 440f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 840f)
                close()
                moveToRelative(80f, -320f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -55f, -33.5f, -98.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(400f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(40f)
                quadToRelative(-54f, 14f, -87f, 58.5f)
                reflectiveQuadTo(680f, 440f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Chair!!
    }

private var _Chair: ImageVector? = null

