package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Your_trips: ImageVector
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
                moveTo(320f, 720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
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
                moveToRelative(160f, -676f)
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
                moveToRelative(-34f, 376f)
                lineToRelative(74f, -56f)
                lineToRelative(74f, 56f)
                lineToRelative(-28f, -91f)
                lineToRelative(74f, -53f)
                horizontalLineToRelative(-91f)
                lineToRelative(-29f, -96f)
                lineToRelative(-29f, 96f)
                horizontalLineToRelative(-91f)
                lineToRelative(74f, 53f)
                lineToRelative(-28f, 91f)
                close()
            }
        }.build()
        
        return _Your_trips!!
    }

private var _Your_trips: ImageVector? = null

