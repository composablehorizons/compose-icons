package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Range_hood: ImageVector
    get() {
        if (_Range_hood != null) return _Range_hood!!
        
        _Range_hood = ImageVector.Builder(
            name = "range_hood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(122f, 480f)
                horizontalLineToRelative(718f)
                lineTo(680f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                verticalLineToRelative(200f)
                lineTo(122f, 480f)
                close()
                moveToRelative(38f, 320f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(880f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(160f, 800f)
                close()
                moveToRelative(240f, -132f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Range_hood!!
    }

private var _Range_hood: ImageVector? = null

