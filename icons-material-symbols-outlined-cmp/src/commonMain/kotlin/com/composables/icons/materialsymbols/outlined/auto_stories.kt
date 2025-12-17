package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Auto_stories: ImageVector
    get() {
        if (_Auto_stories != null) return _Auto_stories!!
        
        _Auto_stories = ImageVector.Builder(
            name = "auto_stories",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-42f, 0f, -82.5f, 11f)
                reflectiveQuadTo(100f, 762f)
                quadToRelative(-21f, 11f, -40.5f, -1f)
                reflectiveQuadTo(40f, 726f)
                verticalLineToRelative(-482f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadTo(62f, 208f)
                quadToRelative(46f, -24f, 96f, -36f)
                reflectiveQuadToRelative(102f, -12f)
                quadToRelative(58f, 0f, 113.5f, 15f)
                reflectiveQuadTo(480f, 220f)
                verticalLineToRelative(484f)
                quadToRelative(51f, -32f, 107f, -48f)
                reflectiveQuadToRelative(113f, -16f)
                quadToRelative(36f, 0f, 70.5f, 6f)
                reflectiveQuadToRelative(69.5f, 18f)
                verticalLineToRelative(-480f)
                quadToRelative(15f, 5f, 29.5f, 10.5f)
                reflectiveQuadTo(898f, 208f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(482f)
                quadToRelative(0f, 23f, -19.5f, 35f)
                reflectiveQuadToRelative(-40.5f, 1f)
                quadToRelative(-37f, -20f, -77.5f, -31f)
                reflectiveQuadTo(700f, 720f)
                quadToRelative(-60f, 0f, -116f, 21f)
                reflectiveQuadToRelative(-104f, 59f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(-380f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(400f)
                lineTo(560f, 600f)
                close()
                moveToRelative(-160f, 65f)
                verticalLineToRelative(-396f)
                quadToRelative(-33f, -14f, -68.5f, -21.5f)
                reflectiveQuadTo(260f, 240f)
                quadToRelative(-37f, 0f, -72f, 7f)
                reflectiveQuadToRelative(-68f, 21f)
                verticalLineToRelative(397f)
                quadToRelative(35f, -13f, 69.5f, -19f)
                reflectiveQuadToRelative(70.5f, -6f)
                quadToRelative(36f, 0f, 70.5f, 6f)
                reflectiveQuadToRelative(69.5f, 19f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-396f)
                verticalLineToRelative(396f)
                close()
            }
        }.build()
        
        return _Auto_stories!!
    }

private var _Auto_stories: ImageVector? = null

