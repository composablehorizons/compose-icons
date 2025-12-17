package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flatware: ImageVector
    get() {
        if (_Flatware != null) return _Flatware!!
        
        _Flatware = ImageVector.Builder(
            name = "flatware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(-212f)
                quadToRelative(0f, -12f, 8f, -20f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(12f, 0f, 20f, 8f)
                reflectiveQuadToRelative(8f, 20f)
                verticalLineToRelative(132f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -12f, 8f, -20f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(12f, 0f, 20f, 8f)
                reflectiveQuadToRelative(8f, 20f)
                verticalLineToRelative(132f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -12f, 8f, -20f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(12f, 0f, 20f, 8f)
                reflectiveQuadToRelative(8f, 20f)
                verticalLineToRelative(212f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 440f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-404f)
                quadToRelative(-42f, -20f, -61f, -62.5f)
                reflectiveQuadTo(400f, 284f)
                quadToRelative(0f, -63f, 31.5f, -113.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(57f, 0f, 88.5f, 50.5f)
                reflectiveQuadTo(640f, 284f)
                quadToRelative(0f, 47f, -19f, 89.5f)
                reflectiveQuadTo(560f, 436f)
                verticalLineToRelative(404f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-720f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Flatware!!
    }

private var _Flatware: ImageVector? = null

