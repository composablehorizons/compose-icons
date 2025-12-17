package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sports_hockey: ImageVector
    get() {
        if (_Sports_hockey != null) return _Sports_hockey!!
        
        _Sports_hockey = ImageVector.Builder(
            name = "sports_hockey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 640f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                close()
                moveToRelative(120f, 40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                lineToRelative(34f, -78f)
                lineToRelative(64f, 140f)
                lineToRelative(-34f, 76f)
                quadToRelative(-5f, 11f, -15f, 16.5f)
                reflectiveQuadToRelative(-21f, 5.5f)
                horizontalLineTo(200f)
                close()
                moveToRelative(680f, -40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-120f, 40f)
                horizontalLineTo(572f)
                quadToRelative(-11f, 0f, -21f, -5.5f)
                reflectiveQuadTo(536f, 778f)
                lineTo(293f, 246f)
                quadToRelative(-14f, -30f, 4f, -58f)
                reflectiveQuadToRelative(51f, -28f)
                quadToRelative(18f, 0f, 33f, 9.5f)
                reflectiveQuadToRelative(23f, 26.5f)
                lineToRelative(76f, 172f)
                lineToRelative(76f, -172f)
                quadToRelative(8f, -17f, 22.5f, -26.5f)
                reflectiveQuadTo(611f, 160f)
                quadToRelative(33f, 0f, 51.5f, 28f)
                reflectiveQuadToRelative(4.5f, 58f)
                lineTo(544f, 514f)
                lineToRelative(56f, 126f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Sports_hockey!!
    }

private var _Sports_hockey: ImageVector? = null

