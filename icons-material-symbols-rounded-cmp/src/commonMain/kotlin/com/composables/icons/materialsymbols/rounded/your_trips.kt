package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Your_trips: ImageVector
    get() {
        if (_Your_trips != null) return _Your_trips!!
        
        _Your_trips = ImageVector.Builder(
            name = "your_trips",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 640f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -85f, 44.5f, -152f)
                reflectiveQuadTo(360f, 228f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(28f)
                quadToRelative(71f, 33f, 115.5f, 100f)
                reflectiveQuadTo(760f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(160f, -596f)
                quadToRelative(11f, -2f, 20f, -3f)
                reflectiveQuadToRelative(20f, -1f)
                quadToRelative(11f, 0f, 20f, 1f)
                reflectiveQuadToRelative(20f, 3f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                verticalLineToRelative(4f)
                close()
                moveTo(280f, 800f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
                moveToRelative(200f, -276f)
                lineToRelative(49f, 37f)
                quadToRelative(6f, 5f, 12f, 0.5f)
                reflectiveQuadToRelative(4f, -11.5f)
                lineToRelative(-19f, -61f)
                lineToRelative(49f, -35f)
                quadToRelative(6f, -5f, 4f, -11.5f)
                reflectiveQuadToRelative(-10f, -6.5f)
                horizontalLineToRelative(-60f)
                lineToRelative(-19f, -65f)
                quadToRelative(-2f, -7f, -10f, -7f)
                reflectiveQuadToRelative(-10f, 7f)
                lineToRelative(-19f, 65f)
                horizontalLineToRelative(-60f)
                quadToRelative(-8f, 0f, -10f, 6.5f)
                reflectiveQuadToRelative(4f, 11.5f)
                lineToRelative(49f, 35f)
                lineToRelative(-19f, 61f)
                quadToRelative(-2f, 7f, 4f, 11.5f)
                reflectiveQuadToRelative(12f, -0.5f)
                lineToRelative(49f, -37f)
                close()
            }
        }.build()
        
        return _Your_trips!!
    }

private var _Your_trips: ImageVector? = null

