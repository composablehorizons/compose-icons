package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_to_drive: ImageVector
    get() {
        if (_Add_to_drive != null) return _Add_to_drive!!
        
        _Add_to_drive = ImageVector.Builder(
            name = "add_to_drive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 860f)
                quadToRelative(-17f, 0f, -34.5f, -10.5f)
                reflectiveQuadTo(160f, 825f)
                lineTo(60f, 650f)
                quadToRelative(-8f, -14f, -8f, -34.5f)
                reflectiveQuadToRelative(8f, -34.5f)
                lineToRelative(260f, -446f)
                quadToRelative(8f, -14f, 25.5f, -24.5f)
                reflectiveQuadTo(380f, 100f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 34.5f, 10.5f)
                reflectiveQuadTo(640f, 135f)
                lineToRelative(182f, 312f)
                quadToRelative(-23f, -6f, -47.5f, -8f)
                reflectiveQuadToRelative(-48.5f, 2f)
                lineTo(574f, 180f)
                horizontalLineTo(386f)
                lineTo(132f, 616f)
                lineToRelative(94f, 164f)
                horizontalLineToRelative(316f)
                quadToRelative(11f, 23f, 25.5f, 43f)
                reflectiveQuadToRelative(33.5f, 37f)
                horizontalLineTo(220f)
                close()
                moveToRelative(70f, -180f)
                lineToRelative(-29f, -51f)
                lineToRelative(183f, -319f)
                horizontalLineToRelative(72f)
                lineToRelative(101f, 176f)
                quadToRelative(-17f, 13f, -31.5f, 28.5f)
                reflectiveQuadTo(560f, 547f)
                lineToRelative(-80f, -139f)
                lineToRelative(-110f, 192f)
                horizontalLineToRelative(164f)
                quadToRelative(-7f, 19f, -10.5f, 39f)
                reflectiveQuadToRelative(-3.5f, 41f)
                horizontalLineTo(290f)
                close()
                moveToRelative(430f, 160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Add_to_drive!!
    }

private var _Add_to_drive: ImageVector? = null

