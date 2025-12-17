package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Local_drink: ImageVector
    get() {
        if (_Local_drink != null) return _Local_drink!!
        
        _Local_drink = ImageVector.Builder(
            name = "local_drink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 880f)
                lineToRelative(-88f, -800f)
                horizontalLineToRelative(720f)
                lineTo(752f, 880f)
                horizontalLineTo(208f)
                close()
                moveToRelative(18f, -560f)
                horizontalLineToRelative(508f)
                lineToRelative(16f, -160f)
                horizontalLineTo(210f)
                lineToRelative(16f, 160f)
                close()
                moveToRelative(254f, 440f)
                quadToRelative(48f, 0f, 81f, -33f)
                reflectiveQuadToRelative(33f, -81f)
                quadToRelative(0f, -41f, -26.5f, -89f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-61f, 69f, -87.5f, 117f)
                reflectiveQuadTo(366f, 646f)
                quadToRelative(0f, 48f, 33f, 81f)
                reflectiveQuadToRelative(81f, 33f)
                close()
            }
        }.build()
        
        return _Local_drink!!
    }

private var _Local_drink: ImageVector? = null

