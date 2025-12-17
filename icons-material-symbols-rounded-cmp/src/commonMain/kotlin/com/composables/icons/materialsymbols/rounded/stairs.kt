package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stairs: ImageVector
    get() {
        if (_Stairs != null) return _Stairs!!
        
        _Stairs = ImageVector.Builder(
            name = "stairs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(417f, 587f)
                horizontalLineToRelative(63f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 547f)
                verticalLineToRelative(-93f)
                horizontalLineToRelative(63f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(623f, 414f)
                verticalLineToRelative(-94f)
                horizontalLineToRelative(57f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                horizontalLineToRelative(-97f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(543f, 280f)
                verticalLineToRelative(93f)
                horizontalLineToRelative(-63f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 413f)
                verticalLineToRelative(93f)
                horizontalLineToRelative(-63f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(337f, 546f)
                verticalLineToRelative(94f)
                horizontalLineToRelative(-57f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                horizontalLineToRelative(97f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(417f, 680f)
                verticalLineToRelative(-93f)
                close()
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Stairs!!
    }

private var _Stairs: ImageVector? = null

