package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Live_help: ImageVector
    get() {
        if (_Live_help != null) return _Live_help!!
        
        _Live_help = ImageVector.Builder(
            name = "live_help",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(600f)
                lineToRelative(-92f, 92f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-92f, -92f)
                close()
                moveToRelative(-160f, -80f)
                horizontalLineToRelative(192f)
                lineToRelative(88f, 88f)
                lineToRelative(88f, -88f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, -280f)
                close()
                moveToRelative(-4f, 240f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(526f, 630f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(476f, 580f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(426f, 630f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(476f, 680f)
                close()
                moveToRelative(70f, -360f)
                quadToRelative(0f, 17f, -11f, 36.5f)
                reflectiveQuadTo(498f, 399f)
                quadToRelative(-17f, 15f, -27.5f, 28.5f)
                reflectiveQuadTo(453f, 455f)
                quadToRelative(-4f, 8f, -6f, 16f)
                reflectiveQuadToRelative(-4f, 18f)
                quadToRelative(-2f, 15f, 8f, 26f)
                reflectiveQuadToRelative(26f, 11f)
                quadToRelative(14f, 0f, 25f, -10f)
                reflectiveQuadToRelative(15f, -27f)
                quadToRelative(3f, -14f, 11.5f, -26f)
                reflectiveQuadToRelative(27.5f, -31f)
                quadToRelative(35f, -35f, 49.5f, -59f)
                reflectiveQuadToRelative(14.5f, -53f)
                quadToRelative(0f, -54f, -36.5f, -87f)
                reflectiveQuadTo(484f, 200f)
                quadToRelative(-45f, 0f, -78f, 19f)
                reflectiveQuadToRelative(-53f, 53f)
                quadToRelative(-7f, 12f, -0.5f, 25f)
                reflectiveQuadToRelative(20.5f, 18f)
                quadToRelative(13f, 5f, 26f, 0f)
                reflectiveQuadToRelative(21f, -16f)
                quadToRelative(11f, -14f, 27f, -22.5f)
                reflectiveQuadToRelative(37f, -8.5f)
                quadToRelative(26f, 0f, 44f, 14.5f)
                reflectiveQuadToRelative(18f, 37.5f)
                close()
            }
        }.build()
        
        return _Live_help!!
    }

private var _Live_help: ImageVector? = null

