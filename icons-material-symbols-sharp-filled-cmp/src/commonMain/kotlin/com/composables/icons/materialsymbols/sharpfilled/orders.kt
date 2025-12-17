package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Orders: ImageVector
    get() {
        if (_Orders != null) return _Orders!!
        
        _Orders = ImageVector.Builder(
            name = "orders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-516f)
                lineTo(82f, 114f)
                lineToRelative(72f, -34f)
                lineToRelative(94f, 202f)
                horizontalLineToRelative(464f)
                lineToRelative(94f, -202f)
                lineToRelative(72f, 34f)
                lineToRelative(-78f, 170f)
                verticalLineToRelative(516f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -280f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                close()
            }
        }.build()
        
        return _Orders!!
    }

private var _Orders: ImageVector? = null

