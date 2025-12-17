package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stack_star: ImageVector
    get() {
        if (_Stack_star != null) return _Stack_star!!
        
        _Stack_star = ImageVector.Builder(
            name = "stack_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 685f)
                lineToRelative(71f, 43f)
                quadToRelative(6f, 4f, 11.5f, 0f)
                reflectiveQuadToRelative(3.5f, -11f)
                lineToRelative(-19f, -81f)
                lineToRelative(62f, -53f)
                quadToRelative(5f, -5f, 3f, -11f)
                reflectiveQuadToRelative(-9f, -7f)
                lineToRelative(-81f, -7f)
                lineToRelative(-33f, -77f)
                quadToRelative(-2f, -6f, -9f, -6f)
                reflectiveQuadToRelative(-9f, 6f)
                lineToRelative(-33f, 77f)
                lineToRelative(-81f, 7f)
                quadToRelative(-7f, 1f, -9f, 7f)
                reflectiveQuadToRelative(3f, 11f)
                lineToRelative(62f, 53f)
                lineToRelative(-19f, 81f)
                quadToRelative(-2f, 7f, 3.5f, 11f)
                reflectiveQuadToRelative(11.5f, 0f)
                lineToRelative(71f, -43f)
                close()
                moveToRelative(-440f, -45f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 560f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 200f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 320f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(200f, -200f)
                close()
            }
        }.build()
        
        return _Stack_star!!
    }

private var _Stack_star: ImageVector? = null

