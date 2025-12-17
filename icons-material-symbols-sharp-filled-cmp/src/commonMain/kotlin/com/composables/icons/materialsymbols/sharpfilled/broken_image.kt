package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Broken_image: ImageVector
    get() {
        if (_Broken_image != null) return _Broken_image!!
        
        _Broken_image = ImageVector.Builder(
            name = "broken_image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-344f)
                lineToRelative(120f, 120f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(160f, -160f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(264f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(343f)
                lineTo(720f, 343f)
                lineTo(560f, 503f)
                lineTo(400f, 343f)
                lineTo(240f, 503f)
                lineTo(120f, 383f)
                verticalLineToRelative(-263f)
                close()
            }
        }.build()
        
        return _Broken_image!!
    }

private var _Broken_image: ImageVector? = null

