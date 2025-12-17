package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bike_dock: ImageVector
    get() {
        if (_Bike_dock != null) return _Bike_dock!!
        
        _Bike_dock = ImageVector.Builder(
            name = "bike_dock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(170f, -49f)
                lineToRelative(70f, -591f)
                horizontalLineToRelative(240f)
                lineToRelative(70f, 591f)
                lineToRelative(170f, 49f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(520f)
                close()
            }
        }.build()
        
        return _Bike_dock!!
    }

private var _Bike_dock: ImageVector? = null

