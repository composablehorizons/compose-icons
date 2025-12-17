package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_top_left: ImageVector
    get() {
        if (_Arrow_top_left != null) return _Arrow_top_left!!
        
        _Arrow_top_left = ImageVector.Builder(
            name = "arrow_top_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313f, 400f)
                lineToRelative(116f, 116f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(429f, 572f)
                quadToRelative(-12f, 12f, -28f, 12.5f)
                reflectiveQuadTo(373f, 573f)
                lineTo(188f, 388f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(183f, -183f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(313f, 320f)
                horizontalLineToRelative(367f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 760f)
                verticalLineToRelative(-360f)
                horizontalLineTo(313f)
                close()
            }
        }.build()
        
        return _Arrow_top_left!!
    }

private var _Arrow_top_left: ImageVector? = null

