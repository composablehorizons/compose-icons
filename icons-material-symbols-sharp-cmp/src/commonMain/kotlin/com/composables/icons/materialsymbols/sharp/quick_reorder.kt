package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Quick_reorder: ImageVector
    get() {
        if (_Quick_reorder != null) return _Quick_reorder!!
        
        _Quick_reorder = ImageVector.Builder(
            name = "quick_reorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(122f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(118f)
                verticalLineToRelative(-118f)
                lineToRelative(-78f, -168f)
                lineToRelative(72f, -34f)
                lineToRelative(94f, 200f)
                horizontalLineToRelative(464f)
                lineToRelative(-78f, -166f)
                lineToRelative(72f, -34f)
                lineToRelative(94f, 200f)
                verticalLineToRelative(520f)
                horizontalLineTo(40f)
                close()
                moveToRelative(440f, -280f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                horizontalLineTo(480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(320f, 720f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                horizontalLineTo(320f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-360f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Quick_reorder!!
    }

private var _Quick_reorder: ImageVector? = null

