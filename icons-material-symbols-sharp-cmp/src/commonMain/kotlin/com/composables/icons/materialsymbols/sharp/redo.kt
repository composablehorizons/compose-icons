package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!
        
        _Redo = ImageVector.Builder(
            name = "redo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(396f, 760f)
                quadToRelative(-97f, 0f, -166.5f, -63f)
                reflectiveQuadTo(160f, 540f)
                quadToRelative(0f, -94f, 69.5f, -157f)
                reflectiveQuadTo(396f, 320f)
                horizontalLineToRelative(252f)
                lineTo(544f, 216f)
                lineToRelative(56f, -56f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                lineToRelative(-56f, -56f)
                lineToRelative(104f, -104f)
                horizontalLineTo(396f)
                quadToRelative(-63f, 0f, -109.5f, 40f)
                reflectiveQuadTo(240f, 540f)
                quadToRelative(0f, 60f, 46.5f, 100f)
                reflectiveQuadTo(396f, 680f)
                horizontalLineToRelative(284f)
                verticalLineToRelative(80f)
                horizontalLineTo(396f)
                close()
            }
        }.build()
        
        return _Redo!!
    }

private var _Redo: ImageVector? = null

