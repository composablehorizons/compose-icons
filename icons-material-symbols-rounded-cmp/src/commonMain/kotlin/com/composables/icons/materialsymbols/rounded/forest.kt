package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineTo(73f)
                quadToRelative(-24f, 0f, -35f, -21f)
                reflectiveQuadToRelative(2f, -41f)
                lineToRelative(114f, -178f)
                quadToRelative(-23f, 0f, -34.5f, -20.5f)
                reflectiveQuadTo(122f, 419f)
                lineToRelative(205f, -292f)
                quadToRelative(12f, -17f, 33f, -17f)
                reflectiveQuadToRelative(33f, 17f)
                lineToRelative(87f, 125f)
                lineToRelative(87f, -125f)
                quadToRelative(12f, -17f, 33f, -17f)
                reflectiveQuadToRelative(33f, 17f)
                lineToRelative(205f, 292f)
                quadToRelative(14f, 20f, 2.5f, 40.5f)
                reflectiveQuadTo(806f, 480f)
                lineToRelative(114f, 178f)
                quadToRelative(13f, 20f, 2f, 41f)
                reflectiveQuadToRelative(-35f, 21f)
                horizontalLineTo(680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                close()
                moveToRelative(389f, -200f)
                horizontalLineToRelative(145f)
                lineTo(659f, 400f)
                horizontalLineToRelative(67f)
                lineTo(600f, 220f)
                lineToRelative(-71f, 101f)
                lineToRelative(69f, 98f)
                quadToRelative(14f, 20f, 2.5f, 40.5f)
                reflectiveQuadTo(566f, 480f)
                lineToRelative(103f, 160f)
                close()
                moveToRelative(-523f, 0f)
                horizontalLineToRelative(428f)
                lineTo(419f, 400f)
                horizontalLineToRelative(67f)
                lineTo(360f, 220f)
                lineTo(234f, 400f)
                horizontalLineToRelative(67f)
                lineTo(146f, 640f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(155f)
                horizontalLineToRelative(-67f)
                horizontalLineToRelative(252f)
                horizontalLineToRelative(-67f)
                horizontalLineToRelative(155f)
                horizontalLineToRelative(-428f)
                close()
                moveToRelative(523f, 0f)
                horizontalLineTo(566f)
                horizontalLineToRelative(74f)
                horizontalLineToRelative(-111f)
                horizontalLineToRelative(197f)
                horizontalLineToRelative(-67f)
                horizontalLineToRelative(155f)
                horizontalLineToRelative(-145f)
                close()
                moveToRelative(-149f, 80f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
                moveToRelative(201f, 0f)
                close()
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

