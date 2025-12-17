package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Unknown_document: ImageVector
    get() {
        if (_Unknown_document != null) return _Unknown_document!!
        
        _Unknown_document = ImageVector.Builder(
            name = "unknown_document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 160f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(80f, 400f)
                horizontalLineToRelative(147f)
                quadToRelative(11f, -23f, 25.5f, -43f)
                reflectiveQuadToRelative(32.5f, -37f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(123f)
                quadToRelative(-3f, -20f, -3f, -40f)
                reflectiveQuadToRelative(3f, -40f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(92f)
                quadToRelative(-19f, -6f, -39f, -9f)
                reflectiveQuadToRelative(-41f, -3f)
                verticalLineToRelative(-40f)
                horizontalLineTo(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(227f)
                quadToRelative(11f, 23f, 25.5f, 43f)
                reflectiveQuadTo(485f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(480f, -400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(0f, 320f)
                quadToRelative(11f, 0f, 18.5f, -7.5f)
                reflectiveQuadTo(706f, 774f)
                quadToRelative(0f, -11f, -7.5f, -18.5f)
                reflectiveQuadTo(680f, 748f)
                quadToRelative(-11f, 0f, -18.5f, 7.5f)
                reflectiveQuadTo(654f, 774f)
                quadToRelative(0f, 11f, 7.5f, 18.5f)
                reflectiveQuadTo(680f, 800f)
                close()
                moveToRelative(-18f, -76f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -11f, 6f, -19.5f)
                reflectiveQuadToRelative(14f, -16.5f)
                quadToRelative(14f, -12f, 22f, -23f)
                reflectiveQuadToRelative(8f, -31f)
                quadToRelative(0f, -29f, -19f, -46.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(-23f, 0f, -41.5f, 13.5f)
                reflectiveQuadTo(612f, 610f)
                lineToRelative(32f, 14f)
                quadToRelative(3f, -12f, 12.5f, -21f)
                reflectiveQuadToRelative(23.5f, -9f)
                quadToRelative(15f, 0f, 23.5f, 7.5f)
                reflectiveQuadTo(712f, 624f)
                quadToRelative(0f, 11f, -6f, 18.5f)
                reflectiveQuadTo(692f, 658f)
                quadToRelative(-6f, 6f, -12.5f, 12f)
                reflectiveQuadTo(668f, 684f)
                quadToRelative(-3f, 6f, -4.5f, 12f)
                reflectiveQuadToRelative(-1.5f, 14f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Unknown_document!!
    }

private var _Unknown_document: ImageVector? = null

