package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Surgical: ImageVector
    get() {
        if (_Surgical != null) return _Surgical!!
        
        _Surgical = ImageVector.Builder(
            name = "surgical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 614f)
                lineTo(346f, 464f)
                lineToRelative(361f, -361f)
                lineToRelative(150f, 150f)
                lineToRelative(-361f, 361f)
                close()
                moveToRelative(-56f, 226f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                close()
                moveToRelative(-237f, 0f)
                quadToRelative(-46f, 0f, -88.5f, -18f)
                reflectiveQuadTo(40f, 772f)
                lineToRelative(265f, -264f)
                lineToRelative(175f, 174f)
                lineToRelative(-90f, 90f)
                quadToRelative(-32f, 32f, -74.5f, 50f)
                reflectiveQuadTo(227f, 840f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.build()
        
        return _Surgical!!
    }

private var _Surgical: ImageVector? = null

