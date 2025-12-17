package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Data_exploration: ImageVector
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
                lineToRelative(103f, 88f)
                quadToRelative(12f, 11f, 27.5f, 10f)
                reflectiveQuadToRelative(26.5f, -12f)
                lineToRelative(158f, -157f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 480f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 400f)
                horizontalLineToRelative(23f)
                lineTo(452f, 531f)
                lineToRelative(-104f, -87f)
                quadToRelative(-12f, -10f, -27.5f, -9.5f)
                reflectiveQuadTo(294f, 446f)
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
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Data_exploration!!
    }

private var _Data_exploration: ImageVector? = null

