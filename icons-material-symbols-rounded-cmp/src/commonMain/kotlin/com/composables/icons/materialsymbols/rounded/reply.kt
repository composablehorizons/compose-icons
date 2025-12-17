package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Reply: ImageVector
    get() {
        if (_Reply != null) return _Reply!!
        
        _Reply = ImageVector.Builder(
            name = "reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(273f, 480f)
                lineToRelative(116f, 116f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(388f, 652f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(332f, 652f)
                lineTo(148f, 468f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(184f, -184f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(388f, 285f)
                lineTo(273f, 400f)
                horizontalLineToRelative(367f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 720f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(273f)
                close()
            }
        }.build()
        
        return _Reply!!
    }

private var _Reply: ImageVector? = null

