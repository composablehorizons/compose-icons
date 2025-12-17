package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Undo: ImageVector
    get() {
        if (_Undo != null) return _Undo!!
        
        _Undo = ImageVector.Builder(
            name = "undo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(284f)
                quadToRelative(63f, 0f, 109.5f, -40f)
                reflectiveQuadTo(720f, 540f)
                quadToRelative(0f, -60f, -46.5f, -100f)
                reflectiveQuadTo(564f, 400f)
                horizontalLineTo(312f)
                lineToRelative(104f, 104f)
                lineToRelative(-56f, 56f)
                lineToRelative(-200f, -200f)
                lineToRelative(200f, -200f)
                lineToRelative(56f, 56f)
                lineToRelative(-104f, 104f)
                horizontalLineToRelative(252f)
                quadToRelative(97f, 0f, 166.5f, 63f)
                reflectiveQuadTo(800f, 540f)
                quadToRelative(0f, 94f, -69.5f, 157f)
                reflectiveQuadTo(564f, 760f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Undo!!
    }

private var _Undo: ImageVector? = null

