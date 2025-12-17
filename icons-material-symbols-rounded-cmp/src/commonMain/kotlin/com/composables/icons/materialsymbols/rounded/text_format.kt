package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Text_format: ImageVector
    get() {
        if (_Text_format != null) return _Text_format!!
        
        _Text_format = ImageVector.Builder(
            name = "text_format",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 680f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineTo(240f)
                close()
                moveToRelative(54f, -208f)
                lineToRelative(137f, -368f)
                quadToRelative(4f, -11f, 13.5f, -17.5f)
                reflectiveQuadTo(466f, 160f)
                horizontalLineToRelative(28f)
                quadToRelative(12f, 0f, 21.5f, 6.5f)
                reflectiveQuadTo(529f, 184f)
                lineToRelative(137f, 369f)
                quadToRelative(6f, 17f, -4f, 32f)
                reflectiveQuadToRelative(-28f, 15f)
                quadToRelative(-11f, 0f, -20.5f, -6.5f)
                reflectiveQuadTo(600f, 576f)
                lineToRelative(-30f, -88f)
                horizontalLineTo(392f)
                lineToRelative(-32f, 89f)
                quadToRelative(-4f, 11f, -13f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(294f, 552f)
                close()
                moveToRelative(120f, -128f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
            }
        }.build()
        
        return _Text_format!!
    }

private var _Text_format: ImageVector? = null

