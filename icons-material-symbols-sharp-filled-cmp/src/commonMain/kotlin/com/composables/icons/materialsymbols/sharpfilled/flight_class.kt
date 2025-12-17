package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Flight_class: ImageVector
    get() {
        if (_Flight_class != null) return _Flight_class!!
        
        _Flight_class = ImageVector.Builder(
            name = "flight_class",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(480f)
                close()
                moveToRelative(240f, 200f)
                horizontalLineTo(320f)
                lineTo(200f, 320f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                lineToRelative(100f, 320f)
                horizontalLineToRelative(340f)
                verticalLineToRelative(80f)
                close()
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Flight_class!!
    }

private var _Flight_class: ImageVector? = null

