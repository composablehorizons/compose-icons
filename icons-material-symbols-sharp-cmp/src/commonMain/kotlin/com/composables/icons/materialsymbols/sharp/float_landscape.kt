package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Float_landscape: ImageVector
    get() {
        if (_Float_landscape != null) return _Float_landscape!!
        
        _Float_landscape = ImageVector.Builder(
            name = "float_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineTo(336f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, 0f)
                verticalLineTo(616f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(680f)
                close()
                moveTo(480f, 576f)
                close()
            }
        }.build()
        
        return _Float_landscape!!
    }

private var _Float_landscape: ImageVector? = null

