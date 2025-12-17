package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chrome_maximize: ImageVector
    get() {
        if (_Chrome_maximize != null) return _Chrome_maximize!!
        
        _Chrome_maximize = ImageVector.Builder(
            name = "chrome_maximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Chrome_maximize!!
    }

private var _Chrome_maximize: ImageVector? = null

