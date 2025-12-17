package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Liquor: ImageVector
    get() {
        if (_Liquor != null) return _Liquor!!
        
        _Liquor = ImageVector.Builder(
            name = "liquor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-128f)
                quadToRelative(-35f, -12f, -57.5f, -42.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(280f, 672f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-518f)
                lineToRelative(120f, -44f)
                verticalLineToRelative(-238f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(238f)
                lineToRelative(120f, 44f)
                verticalLineToRelative(518f)
                horizontalLineTo(440f)
                close()
                moveToRelative(200f, -680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveTo(520f, 480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-62f)
                lineToRelative(-120f, -44f)
                verticalLineToRelative(-94f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(94f)
                lineToRelative(-120f, 44f)
                verticalLineToRelative(62f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Liquor!!
    }

private var _Liquor: ImageVector? = null

