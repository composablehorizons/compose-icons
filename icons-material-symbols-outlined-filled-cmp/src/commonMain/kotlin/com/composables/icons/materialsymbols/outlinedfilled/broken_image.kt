package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Broken_image: ImageVector
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-264f)
                lineToRelative(120f, 120f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(160f, -160f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(184f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -720f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(263f)
                lineTo(720f, 343f)
                lineTo(560f, 503f)
                lineTo(400f, 343f)
                lineTo(240f, 503f)
                lineTo(120f, 383f)
                verticalLineToRelative(-183f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                close()
            }
        }.build()
        
        return _Broken_image!!
    }

private var _Broken_image: ImageVector? = null

