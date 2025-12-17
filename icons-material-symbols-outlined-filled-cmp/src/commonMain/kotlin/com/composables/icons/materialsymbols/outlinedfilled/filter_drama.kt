package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Filter_drama: ImageVector
    get() {
        if (_Filter_drama != null) return _Filter_drama!!
        
        _Filter_drama = ImageVector.Builder(
            name = "filter_drama",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadTo(40f, 580f)
                quadToRelative(0f, -73f, 53.5f, -126.5f)
                reflectiveQuadTo(220f, 400f)
                quadToRelative(73f, 0f, 126.5f, 53.5f)
                reflectiveQuadTo(400f, 580f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -103f, -64f, -172.5f)
                reflectiveQuadTo(250f, 320f)
                quadToRelative(18f, -74f, 81.5f, -117f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(118f, 0f, 199f, 81f)
                reflectiveQuadToRelative(81f, 199f)
                quadToRelative(63f, 0f, 111.5f, 56f)
                reflectiveQuadTo(920f, 620f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(740f, 800f)
                horizontalLineTo(260f)
                close()
            }
        }.build()
        
        return _Filter_drama!!
    }

private var _Filter_drama: ImageVector? = null

