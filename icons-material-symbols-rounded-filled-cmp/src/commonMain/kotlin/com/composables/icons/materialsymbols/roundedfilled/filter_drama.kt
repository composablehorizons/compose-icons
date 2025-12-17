package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Filter_drama: ImageVector
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
                quadToRelative(64f, 0f, 113.5f, 42f)
                reflectiveQuadTo(396f, 545f)
                quadToRelative(3f, 15f, 14.5f, 25f)
                reflectiveQuadToRelative(25.5f, 10f)
                quadToRelative(20f, 0f, 32f, -13.5f)
                reflectiveQuadToRelative(9f, -30.5f)
                quadToRelative(-14f, -86f, -75f, -143f)
                reflectiveQuadToRelative(-152f, -73f)
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

