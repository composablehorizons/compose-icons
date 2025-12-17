package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Directions_alt: ImageVector
    get() {
        if (_Directions_alt != null) return _Directions_alt!!
        
        _Directions_alt = ImageVector.Builder(
            name = "directions_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 912f)
                lineTo(48f, 480f)
                lineToRelative(432f, -432f)
                lineToRelative(432f, 432f)
                lineTo(480f, 912f)
                close()
                moveToRelative(0f, -232f)
                lineToRelative(200f, -200f)
                lineToRelative(-200f, -200f)
                lineToRelative(-56f, 56f)
                lineToRelative(102f, 104f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(246f)
                lineTo(424f, 624f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Directions_alt!!
    }

private var _Directions_alt: ImageVector? = null

