package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Social_distance: ImageVector
    get() {
        if (_Social_distance != null) return _Social_distance!!
        
        _Social_distance = ImageVector.Builder(
            name = "social_distance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(232f, 720f)
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(108f, 708f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-36f, 36f)
                horizontalLineToRelative(496f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(748f, 812f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(36f, -36f)
                horizontalLineTo(232f)
                close()
                moveTo(80f, 440f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -24f, 13f, -44f)
                reflectiveQuadToRelative(36f, -30f)
                quadToRelative(26f, -11f, 53.5f, -17f)
                reflectiveQuadToRelative(57.5f, -6f)
                quadToRelative(30f, 0f, 57.5f, 6f)
                reflectiveQuadToRelative(53.5f, 17f)
                quadToRelative(23f, 10f, 36f, 30f)
                reflectiveQuadToRelative(13f, 44f)
                verticalLineToRelative(23f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -24f, 13f, -44f)
                reflectiveQuadToRelative(36f, -30f)
                quadToRelative(26f, -11f, 53.5f, -17f)
                reflectiveQuadToRelative(57.5f, -6f)
                quadToRelative(30f, 0f, 57.5f, 6f)
                reflectiveQuadToRelative(53.5f, 17f)
                quadToRelative(23f, 10f, 36f, 30f)
                reflectiveQuadToRelative(13f, 44f)
                verticalLineToRelative(23f)
                horizontalLineTo(560f)
                close()
                moveTo(240f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 280f)
                close()
                moveToRelative(480f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 280f)
                close()
            }
        }.build()
        
        return _Social_distance!!
    }

private var _Social_distance: ImageVector? = null

