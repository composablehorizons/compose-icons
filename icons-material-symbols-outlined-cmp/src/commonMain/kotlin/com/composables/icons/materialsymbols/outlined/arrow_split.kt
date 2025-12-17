package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_split: ImageVector
    get() {
        if (_Arrow_split != null) return _Arrow_split!!
        
        _Arrow_split = ImageVector.Builder(
            name = "arrow_split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(304f)
                lineToRelative(200f, -200f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(496f, 520f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(104f)
                lineTo(536f, 594f)
                lineToRelative(58f, -58f)
                lineToRelative(126f, 128f)
                verticalLineToRelative(-104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Arrow_split!!
    }

private var _Arrow_split: ImageVector? = null

