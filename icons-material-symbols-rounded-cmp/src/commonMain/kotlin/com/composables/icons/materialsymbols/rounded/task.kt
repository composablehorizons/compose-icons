package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Task: ImageVector
    get() {
        if (_Task != null) return _Task!!
        
        _Task = ImageVector.Builder(
            name = "task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(437f, 605f)
                lineToRelative(-56f, -56f)
                quadToRelative(-6f, -6f, -13f, -9f)
                reflectiveQuadToRelative(-14.5f, -3f)
                quadToRelative(-7.5f, 0f, -15f, 3f)
                reflectiveQuadToRelative(-13.5f, 9f)
                quadToRelative(-12f, 12f, -12f, 28.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                lineToRelative(85f, 86f)
                quadToRelative(6f, 6f, 13f, 8.5f)
                reflectiveQuadToRelative(15f, 2.5f)
                quadToRelative(8f, 0f, 15f, -2.5f)
                reflectiveQuadToRelative(13f, -8.5f)
                lineToRelative(169f, -169f)
                quadToRelative(12f, -12f, 12f, -29f)
                reflectiveQuadToRelative(-12f, -29f)
                quadToRelative(-12f, -12f, -29f, -12f)
                reflectiveQuadToRelative(-29f, 12f)
                lineTo(437f, 605f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Task!!
    }

private var _Task: ImageVector? = null

