package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Queue_play_next: ImageVector
    get() {
        if (_Queue_play_next != null) return _Queue_play_next!!
        
        _Queue_play_next = ImageVector.Builder(
            name = "queue_play_next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 480f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(400f, 240f)
                lineToRelative(-90f, -90f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                quadToRelative(13f, -13f, 30f, -13f)
                reflectiveQuadToRelative(30f, 13f)
                lineToRelative(122f, 122f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(810f, 870f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                lineToRelative(90f, -90f)
                close()
                moveTo(360f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(680f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Queue_play_next!!
    }

private var _Queue_play_next: ImageVector? = null

