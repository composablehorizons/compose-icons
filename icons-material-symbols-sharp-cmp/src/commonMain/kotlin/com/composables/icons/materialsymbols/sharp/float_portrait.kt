package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Float_portrait: ImageVector
    get() {
        if (_Float_portrait != null) return _Float_portrait!!
        
        _Float_portrait = ImageVector.Builder(
            name = "float_portrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 976f)
                verticalLineTo(176f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                verticalLineTo(256f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                verticalLineTo(696f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(600f)
                close()
                moveTo(480f, 576f)
                close()
            }
        }.build()
        
        return _Float_portrait!!
    }

private var _Float_portrait: ImageVector? = null

