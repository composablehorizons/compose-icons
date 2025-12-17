package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Data_table: ImageVector
    get() {
        if (_Data_table != null) return _Data_table!!
        
        _Data_table = ImageVector.Builder(
            name = "data_table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -507f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-133f)
                horizontalLineTo(200f)
                verticalLineToRelative(133f)
                close()
                moveToRelative(0f, 214f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-134f)
                horizontalLineTo(200f)
                verticalLineToRelative(134f)
                close()
                moveToRelative(0f, 213f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-133f)
                horizontalLineTo(200f)
                verticalLineToRelative(133f)
                close()
                moveToRelative(80f, -454f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 266f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 226f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 266f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 306f)
                close()
                moveToRelative(0f, 214f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                close()
                moveToRelative(0f, 214f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 694f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 654f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 694f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 734f)
                close()
            }
        }.build()
        
        return _Data_table!!
    }

private var _Data_table: ImageVector? = null

