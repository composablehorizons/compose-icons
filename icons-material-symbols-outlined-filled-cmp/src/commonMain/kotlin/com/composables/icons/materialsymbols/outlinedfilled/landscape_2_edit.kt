package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Landscape_2_edit: ImageVector
    get() {
        if (_Landscape_2_edit != null) return _Landscape_2_edit!!
        
        _Landscape_2_edit = ImageVector.Builder(
            name = "landscape_2_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 840f)
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
                moveTo(240f, 400f)
                quadToRelative(-50f, 0f, -85f, -35.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 49f, -35f, 84.5f)
                reflectiveQuadTo(240f, 400f)
                close()
                moveTo(46f, 800f)
                lineToRelative(138f, -276f)
                quadToRelative(10f, -20f, 28.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                quadToRelative(24f, 0f, 44f, 12.5f)
                reflectiveQuadToRelative(29f, 35.5f)
                quadToRelative(2f, 6f, 13.5f, 33f)
                reflectiveQuadToRelative(13.5f, 33f)
                quadToRelative(2f, 6f, 9f, 5.5f)
                reflectiveQuadToRelative(9f, -6.5f)
                lineToRelative(86f, -287f)
                quadToRelative(14f, -48f, 53.5f, -77f)
                reflectiveQuadToRelative(89.5f, -29f)
                quadToRelative(49f, 0f, 87.5f, 28.5f)
                reflectiveQuadTo(742f, 303f)
                lineToRelative(36f, 104f)
                quadToRelative(-15f, 5f, -28.5f, 13f)
                reflectiveQuadTo(724f, 440f)
                lineTo(480f, 684f)
                verticalLineToRelative(116f)
                horizontalLineTo(46f)
                close()
            }
        }.build()
        
        return _Landscape_2_edit!!
    }

private var _Landscape_2_edit: ImageVector? = null

