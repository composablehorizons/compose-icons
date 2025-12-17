package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Destruction: ImageVector
    get() {
        if (_Destruction != null) return _Destruction!!
        
        _Destruction = ImageVector.Builder(
            name = "destruction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 560f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(61f, -380f)
                lineTo(60f, 386f)
                lineToRelative(240f, -40f)
                lineToRelative(-65f, -235f)
                lineToRelative(199f, 141f)
                lineToRelative(120f, -212f)
                lineToRelative(40f, 240f)
                lineToRelative(235f, -65f)
                lineToRelative(-141f, 199f)
                lineToRelative(152f, 86f)
                horizontalLineTo(261f)
                close()
            }
        }.build()
        
        return _Destruction!!
    }

private var _Destruction: ImageVector? = null

