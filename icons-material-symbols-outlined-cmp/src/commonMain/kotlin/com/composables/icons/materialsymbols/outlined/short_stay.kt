package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Short_stay: ImageVector
    get() {
        if (_Short_stay != null) return _Short_stay!!
        
        _Short_stay = ImageVector.Builder(
            name = "short_stay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                horizontalLineToRelative(147f)
                horizontalLineToRelative(-227f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(-80f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(243f)
                quadToRelative(-20f, 3f, -40f, 9f)
                reflectiveQuadToRelative(-40f, 15f)
                verticalLineToRelative(-267f)
                horizontalLineTo(200f)
                verticalLineToRelative(261f)
                quadToRelative(18f, -11f, 38f, -16f)
                reflectiveQuadToRelative(42f, -5f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(27f)
                quadToRelative(-22f, 11f, -41f, 24f)
                reflectiveQuadToRelative(-35f, 29f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(227f)
                quadToRelative(11f, 24f, 25.5f, 44f)
                reflectiveQuadTo(484f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(180f, -520f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(300f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(380f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(380f, 360f)
                close()
                moveToRelative(-40f, 400f)
                horizontalLineToRelative(71f)
                quadToRelative(-5f, -20f, -8f, -40f)
                reflectiveQuadToRelative(-3f, -40f)
                quadToRelative(0f, -26f, 5f, -52f)
                reflectiveQuadToRelative(15f, -52f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(67f, -105f)
                lineToRelative(28f, -28f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(87f, 87f)
                close()
            }
        }.build()
        
        return _Short_stay!!
    }

private var _Short_stay: ImageVector? = null

