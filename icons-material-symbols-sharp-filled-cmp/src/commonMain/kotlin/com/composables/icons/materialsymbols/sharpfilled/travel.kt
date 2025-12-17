package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Travel: ImageVector
    get() {
        if (_Travel != null) return _Travel!!
        
        _Travel = ImageVector.Builder(
            name = "travel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(274f, 686f)
                lineToRelative(-128f, -70f)
                lineToRelative(42f, -42f)
                lineToRelative(100f, 14f)
                lineToRelative(156f, -156f)
                lineToRelative(-312f, -170f)
                lineToRelative(56f, -56f)
                lineToRelative(382f, 98f)
                lineToRelative(157f, -155f)
                quadToRelative(17f, -17f, 42.5f, -17f)
                reflectiveQuadToRelative(42.5f, 17f)
                quadToRelative(17f, 17f, 17f, 42.5f)
                reflectiveQuadTo(812f, 234f)
                lineTo(656f, 390f)
                lineToRelative(98f, 382f)
                lineToRelative(-56f, 56f)
                lineToRelative(-170f, -312f)
                lineToRelative(-156f, 156f)
                lineToRelative(14f, 100f)
                lineToRelative(-42f, 42f)
                lineToRelative(-70f, -128f)
                close()
            }
        }.build()
        
        return _Travel!!
    }

private var _Travel: ImageVector? = null

