package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Earthquake: ImageVector
    get() {
        if (_Earthquake != null) return _Earthquake!!
        
        _Earthquake = ImageVector.Builder(
            name = "earthquake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(331f, 880f)
                lineTo(220f, 520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(199f)
                lineToRelative(75f, 243f)
                lineToRelative(134f, -603f)
                horizontalLineToRelative(64f)
                lineToRelative(94f, 407f)
                lineToRelative(65f, -207f)
                horizontalLineToRelative(57f)
                lineToRelative(60f, 160f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(80f)
                horizontalLineTo(772f)
                lineToRelative(-29f, -77f)
                lineToRelative(-74f, 237f)
                horizontalLineToRelative(-61f)
                lineToRelative(-88f, -379f)
                lineTo(392f, 880f)
                horizontalLineToRelative(-61f)
                close()
            }
        }.build()
        
        return _Earthquake!!
    }

private var _Earthquake: ImageVector? = null

