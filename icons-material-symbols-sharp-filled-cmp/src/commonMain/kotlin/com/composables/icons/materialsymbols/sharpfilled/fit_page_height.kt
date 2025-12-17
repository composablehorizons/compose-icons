package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fit_page_height: ImageVector
    get() {
        if (_Fit_page_height != null) return _Fit_page_height!!
        
        _Fit_page_height = ImageVector.Builder(
            name = "fit_page_height",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 360f)
                horizontalLineToRelative(240f)
                lineTo(480f, 240f)
                lineTo(360f, 360f)
                close()
                moveToRelative(120f, 360f)
                lineToRelative(120f, -120f)
                horizontalLineTo(360f)
                lineToRelative(120f, 120f)
                close()
                moveTo(800f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                close()
            }
        }.build()
        
        return _Fit_page_height!!
    }

private var _Fit_page_height: ImageVector? = null

