package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_delete: ImageVector
    get() {
        if (_Auto_delete != null) return _Auto_delete!!
        
        _Auto_delete = ImageVector.Builder(
            name = "auto_delete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(172f)
                quadToRelative(-17f, -5f, -39.5f, -8.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(-18f, 0f, -40.5f, 3f)
                reflectiveQuadToRelative(-39.5f, 8f)
                verticalLineToRelative(-91f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(130f)
                quadToRelative(-22f, 16f, -44f, 39.5f)
                reflectiveQuadTo(440f, 536f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, 39f, 14f, 83.5f)
                reflectiveQuadToRelative(36f, 76.5f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(320f, 360f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(-20f, 80f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Auto_delete!!
    }

private var _Auto_delete: ImageVector? = null

