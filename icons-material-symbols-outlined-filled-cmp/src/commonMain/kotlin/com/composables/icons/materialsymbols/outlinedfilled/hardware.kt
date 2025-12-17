package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hardware: ImageVector
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
                moveToRelative(40f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

