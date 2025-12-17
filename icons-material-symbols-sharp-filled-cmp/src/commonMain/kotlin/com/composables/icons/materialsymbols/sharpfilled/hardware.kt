package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hardware: ImageVector
    get() {
        if (_Hardware != null) return _Hardware!!
        
        _Hardware = ImageVector.Builder(
            name = "hardware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 440f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                lineTo(600f, 320f)
                verticalLineToRelative(120f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(320f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

