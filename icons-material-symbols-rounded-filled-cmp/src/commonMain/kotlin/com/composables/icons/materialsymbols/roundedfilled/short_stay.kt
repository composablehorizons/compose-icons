package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Short_stay: ImageVector
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
                moveTo(700f, 672f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 2f, 6f, 14f)
                lineToRelative(67f, 67f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-61f, -61f)
                close()
                moveTo(380f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(300f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(380f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(380f, 360f)
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
                moveToRelative(-480f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(213f)
                quadToRelative(0f, 13f, -8f, 23f)
                reflectiveQuadToRelative(-21f, 13f)
                quadToRelative(-14f, 4f, -26.5f, 8.5f)
                reflectiveQuadTo(560f, 427f)
                verticalLineToRelative(-267f)
                horizontalLineTo(200f)
                verticalLineToRelative(261f)
                quadToRelative(18f, -11f, 38f, -16f)
                reflectiveQuadToRelative(42f, -5f)
                horizontalLineToRelative(286f)
                verticalLineToRelative(24f)
                quadToRelative(-51f, 23f, -88.5f, 62f)
                reflectiveQuadTo(420f, 576f)
                verticalLineToRelative(-16f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(260f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(300f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 760f)
                quadToRelative(8f, 0f, 16f, -3f)
                reflectiveQuadToRelative(13f, -9f)
                quadToRelative(5f, 20f, 13f, 40f)
                reflectiveQuadToRelative(19f, 38f)
                quadToRelative(11f, 18f, 2f, 36f)
                reflectiveQuadToRelative(-28f, 18f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Short_stay!!
    }

private var _Short_stay: ImageVector? = null

