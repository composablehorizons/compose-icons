package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Disabled_by_default: ImageVector
    get() {
        if (_Disabled_by_default != null) return _Disabled_by_default!!
        
        _Disabled_by_default = ImageVector.Builder(
            name = "disabled_by_default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(216f, -160f)
                lineToRelative(144f, -144f)
                lineToRelative(144f, 144f)
                lineToRelative(56f, -56f)
                lineToRelative(-144f, -144f)
                lineToRelative(144f, -144f)
                lineToRelative(-56f, -56f)
                lineToRelative(-144f, 144f)
                lineToRelative(-144f, -144f)
                lineToRelative(-56f, 56f)
                lineToRelative(144f, 144f)
                lineToRelative(-144f, 144f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(-136f, 80f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Disabled_by_default!!
    }

private var _Disabled_by_default: ImageVector? = null

