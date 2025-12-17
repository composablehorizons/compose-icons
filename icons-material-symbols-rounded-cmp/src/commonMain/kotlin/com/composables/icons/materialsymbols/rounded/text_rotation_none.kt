package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Text_rotation_none: ImageVector
    get() {
        if (_Text_rotation_none != null) return _Text_rotation_none!!
        
        _Text_rotation_none = ImageVector.Builder(
            name = "text_rotation_none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(688f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(488f)
                lineToRelative(-14f, -14f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(82f, 82f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-82f, 82f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(14f, -14f)
                close()
                moveTo(392f, 448f)
                lineToRelative(-32f, 89f)
                quadToRelative(-4f, 11f, -13f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(294f, 512f)
                lineToRelative(137f, -368f)
                quadToRelative(4f, -11f, 13.5f, -17.5f)
                reflectiveQuadTo(466f, 120f)
                horizontalLineToRelative(28f)
                quadToRelative(12f, 0f, 21.5f, 6.5f)
                reflectiveQuadTo(529f, 144f)
                lineToRelative(137f, 369f)
                quadToRelative(6f, 17f, -4f, 32f)
                reflectiveQuadToRelative(-28f, 15f)
                quadToRelative(-11f, 0f, -20.5f, -6.5f)
                reflectiveQuadTo(600f, 536f)
                lineToRelative(-30f, -88f)
                horizontalLineTo(392f)
                close()
                moveToRelative(22f, -64f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
            }
        }.build()
        
        return _Text_rotation_none!!
    }

private var _Text_rotation_none: ImageVector? = null

