package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fit_page_width: ImageVector
    get() {
        if (_Fit_page_width != null) return _Fit_page_width!!
        
        _Fit_page_width = ImageVector.Builder(
            name = "fit_page_width",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 600f)
                verticalLineToRelative(-240f)
                lineTo(240f, 480f)
                lineToRelative(120f, 120f)
                close()
                moveToRelative(360f, -120f)
                lineTo(600f, 360f)
                verticalLineToRelative(240f)
                lineToRelative(120f, -120f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, -560f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(-640f, 0f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Fit_page_width!!
    }

private var _Fit_page_width: ImageVector? = null

