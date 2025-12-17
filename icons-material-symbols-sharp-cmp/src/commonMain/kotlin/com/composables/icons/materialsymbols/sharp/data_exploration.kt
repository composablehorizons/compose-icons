package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Data_exploration: ImageVector
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
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
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
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 23f, 3f, 45f)
                reflectiveQuadToRelative(9f, 43f)
                lineToRelative(148f, -148f)
                lineToRelative(132f, 111f)
                lineToRelative(131f, -131f)
                horizontalLineToRelative(-63f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-63f)
                lineTo(456f, 640f)
                lineTo(325f, 528f)
                lineTo(207f, 646f)
                quadToRelative(42f, 69f, 113.5f, 111.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(300f, 20f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(820f, 780f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(780f, 740f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(740f, 780f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(780f, 820f)
                close()
                moveTo(455f, 480f)
                close()
            }
        }.build()
        
        return _Data_exploration!!
    }

private var _Data_exploration: ImageVector? = null

