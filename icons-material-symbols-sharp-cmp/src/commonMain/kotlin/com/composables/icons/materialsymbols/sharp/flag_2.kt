package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flag_2: ImageVector
    get() {
        if (_Flag_2 != null) return _Flag_2!!
        
        _Flag_2 = ImageVector.Builder(
            name = "flag_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-760f)
                horizontalLineToRelative(640f)
                lineToRelative(-80f, 200f)
                lineToRelative(80f, 200f)
                horizontalLineTo(280f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -440f)
                horizontalLineToRelative(442f)
                lineToRelative(-48f, -120f)
                lineToRelative(48f, -120f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Flag_2!!
    }

private var _Flag_2: ImageVector? = null

