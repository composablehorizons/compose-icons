package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Float_landscape: ImageVector
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
                moveTo(680f, 896f)
                verticalLineTo(616f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-520f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 336f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                verticalLineToRelative(360f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Float_landscape!!
    }

private var _Float_landscape: ImageVector? = null

