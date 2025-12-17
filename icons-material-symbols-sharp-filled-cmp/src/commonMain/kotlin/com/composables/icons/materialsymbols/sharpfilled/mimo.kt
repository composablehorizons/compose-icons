package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mimo: ImageVector
    get() {
        if (_Mimo != null) return _Mimo!!
        
        _Mimo = ImageVector.Builder(
            name = "mimo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(40f, -40f)
                horizontalLineTo(80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineTo(680f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Mimo!!
    }

private var _Mimo: ImageVector? = null

