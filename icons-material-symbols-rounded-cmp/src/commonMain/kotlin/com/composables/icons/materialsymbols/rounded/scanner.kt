package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Scanner: ImageVector
    get() {
        if (_Scanner != null) return _Scanner!!
        
        _Scanner = ImageVector.Builder(
            name = "scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(704f, 480f)
                lineTo(178f, 290f)
                quadToRelative(-16f, -6f, -23f, -21f)
                reflectiveQuadToRelative(-1f, -31f)
                quadToRelative(6f, -16f, 21f, -23f)
                reflectiveQuadToRelative(31f, -1f)
                lineToRelative(586f, 214f)
                quadToRelative(20f, 8f, 34f, 28f)
                reflectiveQuadToRelative(14f, 44f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 480f)
                horizontalLineToRelative(504f)
                close()
                moveToRelative(56f, 240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(560f)
                close()
                moveToRelative(-320f, -40f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 600f)
                horizontalLineTo(440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(440f, 680f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                close()
                moveToRelative(-80f, 40f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Scanner!!
    }

private var _Scanner: ImageVector? = null

