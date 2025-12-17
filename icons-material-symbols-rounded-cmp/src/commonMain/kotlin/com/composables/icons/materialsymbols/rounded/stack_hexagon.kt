package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stack_hexagon: ImageVector
    get() {
        if (_Stack_hexagon != null) return _Stack_hexagon!!
        
        _Stack_hexagon = ImageVector.Builder(
            name = "stack_hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 529f)
                lineToRelative(100f, -57f)
                quadToRelative(9f, -5f, 14.5f, -14.5f)
                reflectiveQuadTo(720f, 437f)
                verticalLineToRelative(-114f)
                quadToRelative(0f, -11f, -5.5f, -20.5f)
                reflectiveQuadTo(700f, 288f)
                lineToRelative(-100f, -57f)
                quadToRelative(-9f, -5f, -20f, -5f)
                reflectiveQuadToRelative(-20f, 5f)
                lineToRelative(-100f, 57f)
                quadToRelative(-9f, 5f, -14.5f, 14.5f)
                reflectiveQuadTo(440f, 323f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 11f, 5.5f, 20.5f)
                reflectiveQuadTo(460f, 472f)
                lineToRelative(100f, 57f)
                quadToRelative(9f, 5f, 20f, 5f)
                reflectiveQuadToRelative(20f, -5f)
                close()
                moveTo(360f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(360f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(220f, -220f)
                close()
                moveTo(218f, 796f)
                close()
                moveToRelative(10f, 79f)
                quadToRelative(-33f, 4f, -59.5f, -16f)
                reflectiveQuadTo(138f, 806f)
                lineTo(85f, 369f)
                quadToRelative(-4f, -33f, 17f, -59f)
                reflectiveQuadToRelative(54f, -31f)
                horizontalLineToRelative(2f)
                quadToRelative(17f, -3f, 30.5f, 9f)
                reflectiveQuadToRelative(13.5f, 30f)
                quadToRelative(0f, 15f, -10.5f, 26f)
                reflectiveQuadTo(166f, 358f)
                horizontalLineToRelative(-1f)
                lineToRelative(54f, 438f)
                lineToRelative(474f, -58f)
                quadToRelative(17f, -2f, 30f, 8f)
                reflectiveQuadToRelative(15f, 27f)
                quadToRelative(2f, 17f, -8f, 29.5f)
                reflectiveQuadTo(703f, 817f)
                lineTo(228f, 875f)
                close()
            }
        }.build()
        
        return _Stack_hexagon!!
    }

private var _Stack_hexagon: ImageVector? = null

