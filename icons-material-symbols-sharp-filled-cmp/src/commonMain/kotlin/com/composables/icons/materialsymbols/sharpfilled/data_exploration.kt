package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Data_exploration: ImageVector
    get() {
        if (_Data_exploration != null) return _Data_exploration!!
        
        _Data_exploration = ImageVector.Builder(
            name = "data_exploration",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 820f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(820f, 780f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(780f, 740f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(740f, 780f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(780f, 820f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-103f, 0f, -191.5f, -49f)
                reflectiveQuadTo(149f, 704f)
                lineToRelative(176f, -176f)
                lineToRelative(131f, 112f)
                lineToRelative(184f, -183f)
                verticalLineToRelative(63f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(63f)
                lineTo(452f, 531f)
                lineTo(320f, 420f)
                lineTo(109f, 631f)
                quadToRelative(-14f, -33f, -21.5f, -74.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(400f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Data_exploration!!
    }

private var _Data_exploration: ImageVector? = null

