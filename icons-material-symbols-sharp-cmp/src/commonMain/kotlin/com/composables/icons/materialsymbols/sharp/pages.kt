package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pages: ImageVector
    get() {
        if (_Pages != null) return _Pages!!
        
        _Pages = ImageVector.Builder(
            name = "pages",
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
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
                moveToRelative(163f, 450f)
                lineToRelative(117f, -71f)
                lineToRelative(117f, 71f)
                lineToRelative(-31f, -133f)
                lineToRelative(104f, -90f)
                lineToRelative(-137f, -11f)
                lineToRelative(-53f, -126f)
                lineToRelative(-53f, 126f)
                lineToRelative(-137f, 11f)
                lineToRelative(104f, 90f)
                lineToRelative(-31f, 133f)
                close()
            }
        }.build()
        
        return _Pages!!
    }

private var _Pages: ImageVector? = null

