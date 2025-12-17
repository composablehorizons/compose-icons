package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Science_off: ImageVector
    get() {
        if (_Science_off != null) return _Science_off!!
        
        _Science_off = ImageVector.Builder(
            name = "science_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 487f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-207f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(127f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(287f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(448f)
                lineTo(402f, 514f)
                lineTo(200f, 760f)
                close()
                moveTo(792f, 904f)
                lineToRelative(-64f, -64f)
                horizontalLineTo(200f)
                quadToRelative(-51f, 0f, -72.5f, -45.5f)
                reflectiveQuadTo(138f, 710f)
                lineToRelative(208f, -252f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(402f, 514f)
                close()
                moveToRelative(78f, -147f)
                close()
            }
        }.build()
        
        return _Science_off!!
    }

private var _Science_off: ImageVector? = null

