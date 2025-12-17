package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Box_edit: ImageVector
    get() {
        if (_Box_edit != null) return _Box_edit!!
        
        _Box_edit = ImageVector.Builder(
            name = "box_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(139f)
                quadToRelative(-33f, 0f, -62.5f, 8f)
                reflectiveQuadTo(725f, 440f)
                lineToRelative(-85f, 85f)
                verticalLineToRelative(-205f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                lineToRelative(160f, -80f)
                lineToRelative(83f, 42f)
                lineToRelative(-83f, 82f)
                verticalLineToRelative(156f)
                horizontalLineTo(200f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(903f, 620f)
                lineTo(683f, 840f)
                horizontalLineTo(560f)
                close()
                moveToRelative(263f, -224f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
                moveTo(216f, 240f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
            }
        }.build()
        
        return _Box_edit!!
    }

private var _Box_edit: ImageVector? = null

