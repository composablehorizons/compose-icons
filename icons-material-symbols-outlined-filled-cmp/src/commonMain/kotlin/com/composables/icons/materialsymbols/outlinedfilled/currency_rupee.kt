package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Currency_rupee: ImageVector
    get() {
        if (_Currency_rupee != null) return _Currency_rupee!!
        
        _Currency_rupee = ImageVector.Builder(
            name = "currency_rupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(549f, 840f)
                lineTo(280f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                quadToRelative(53f, 0f, 91.5f, -34.5f)
                reflectiveQuadTo(558f, 360f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(306f)
                quadToRelative(-17f, -35f, -50.5f, -57.5f)
                reflectiveQuadTo(420f, 200f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(590f)
                quadToRelative(14f, 17f, 25f, 37f)
                reflectiveQuadToRelative(17f, 43f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-81f)
                quadToRelative(-8f, 85f, -70f, 142.5f)
                reflectiveQuadTo(420f, 560f)
                horizontalLineToRelative(-29f)
                lineToRelative(269f, 280f)
                horizontalLineTo(549f)
                close()
            }
        }.build()
        
        return _Currency_rupee!!
    }

private var _Currency_rupee: ImageVector? = null

