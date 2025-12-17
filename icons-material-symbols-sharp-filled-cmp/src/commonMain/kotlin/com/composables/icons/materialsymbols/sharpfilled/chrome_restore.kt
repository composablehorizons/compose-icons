package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chrome_restore: ImageVector
    get() {
        if (_Chrome_restore != null) return _Chrome_restore!!
        
        _Chrome_restore = ImageVector.Builder(
            name = "chrome_restore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 736f)
                verticalLineTo(256f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(480f)
                horizontalLineTo(320f)
                close()
                moveTo(160f, 896f)
                verticalLineTo(437f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(379f)
                horizontalLineToRelative(379f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Chrome_restore!!
    }

private var _Chrome_restore: ImageVector? = null

