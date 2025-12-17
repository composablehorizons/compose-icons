package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Broken_image: ImageVector
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
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -337f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(160f, -160f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(-183f)
                horizontalLineTo(200f)
                verticalLineToRelative(263f)
                lineToRelative(40f, 40f)
                close()
                moveToRelative(-40f, 257f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-264f)
                lineToRelative(-40f, -40f)
                lineToRelative(-160f, 160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(184f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-264f)
                verticalLineToRelative(80f)
                verticalLineToRelative(-376f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Broken_image!!
    }

private var _Broken_image: ImageVector? = null

