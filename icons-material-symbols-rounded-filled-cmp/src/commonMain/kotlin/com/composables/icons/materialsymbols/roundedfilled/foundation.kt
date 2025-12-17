package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Foundation: ImageVector
    get() {
        if (_Foundation != null) return _Foundation!!
        
        _Foundation = ImageVector.Builder(
            name = "foundation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 600f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-166f)
                lineToRelative(-80f, 61f)
                quadToRelative(-14f, 10f, -30f, 8.5f)
                reflectiveQuadTo(64f, 488f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(16f, -26f)
                lineToRelative(359f, -275f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(359f, 275f)
                quadToRelative(13f, 10f, 15.5f, 26f)
                reflectiveQuadToRelative(-7.5f, 30f)
                quadToRelative(-10f, 14f, -26f, 15.5f)
                reflectiveQuadToRelative(-30f, -8.5f)
                lineToRelative(-80f, -61f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-349f)
                lineTo(280f, 373f)
                verticalLineToRelative(227f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-227f)
                lineTo(520f, 251f)
                verticalLineToRelative(349f)
                close()
            }
        }.build()
        
        return _Foundation!!
    }

private var _Foundation: ImageVector? = null

