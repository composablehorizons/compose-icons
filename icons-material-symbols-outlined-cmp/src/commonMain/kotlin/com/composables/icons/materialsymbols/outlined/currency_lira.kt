package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Currency_lira: ImageVector
    get() {
        if (_Currency_lira != null) return _Currency_lira!!
        
        _Currency_lira = ImageVector.Builder(
            name = "currency_lira",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                verticalLineToRelative(-206f)
                lineToRelative(-120f, 75f)
                verticalLineToRelative(-95f)
                lineToRelative(120f, -75f)
                verticalLineToRelative(-94f)
                lineToRelative(-120f, 75f)
                verticalLineToRelative(-94f)
                lineToRelative(120f, -76f)
                verticalLineToRelative(-230f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(180f)
                lineToRelative(160f, -100f)
                verticalLineToRelative(94f)
                lineTo(440f, 395f)
                verticalLineToRelative(94f)
                lineToRelative(160f, -100f)
                verticalLineToRelative(94f)
                lineTo(440f, 584f)
                verticalLineToRelative(176f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(640f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(440f, 840f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Currency_lira!!
    }

private var _Currency_lira: ImageVector? = null

