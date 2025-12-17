package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Auto_delete: ImageVector
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
                moveTo(280f, 240f)
                verticalLineToRelative(520f)
                verticalLineToRelative(-520f)
                close()
                moveToRelative(170f, 600f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(172f)
                quadToRelative(-17f, -5f, -39.5f, -8.5f)
                reflectiveQuadTo(680f, 400f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(132f)
                quadToRelative(6f, 21f, 16f, 41.5f)
                reflectiveQuadToRelative(22f, 38.5f)
                close()
                moveToRelative(-90f, -160f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -63f, 20f, -103.5f)
                lineToRelative(20f, -40.5f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(160f, -230f)
                quadToRelative(17f, -11f, 38.5f, -22f)
                reflectiveQuadToRelative(41.5f, -16f)
                verticalLineToRelative(-92f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(130f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(66f, -106f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                close()
            }
        }.build()
        
        return _Auto_delete!!
    }

private var _Auto_delete: ImageVector? = null

