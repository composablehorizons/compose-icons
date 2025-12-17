package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Polyline: ImageVector
    get() {
        if (_Polyline != null) return _Polyline!!
        
        _Polyline = ImageVector.Builder(
            name = "polyline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 880f)
                verticalLineToRelative(-100f)
                lineTo(320f, 640f)
                horizontalLineTo(120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(172f)
                lineToRelative(108f, -124f)
                verticalLineToRelative(-196f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(468f)
                lineTo(360f, 444f)
                verticalLineToRelative(126f)
                lineToRelative(240f, 120f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Polyline!!
    }

private var _Polyline: ImageVector? = null

