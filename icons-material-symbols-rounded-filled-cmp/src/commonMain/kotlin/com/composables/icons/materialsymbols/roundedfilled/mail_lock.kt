package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mail_lock: ImageVector
    get() {
        if (_Mail_lock != null) return _Mail_lock!!
        
        _Mail_lock = ImageVector.Builder(
            name = "mail_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                lineTo(212f, 272f)
                quadToRelative(-17f, -11f, -34.5f, -1f)
                reflectiveQuadTo(160f, 301f)
                quadToRelative(0f, 9f, 4f, 16.5f)
                reflectiveQuadToRelative(12f, 12.5f)
                lineToRelative(283f, 177f)
                quadToRelative(10f, 6f, 21f, 6f)
                reflectiveQuadToRelative(21f, -6f)
                lineToRelative(283f, -177f)
                quadToRelative(8f, -5f, 12f, -12.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(0f, -20f, -17.5f, -30f)
                reflectiveQuadToRelative(-34.5f, 1f)
                lineTo(480f, 440f)
                close()
                moveToRelative(280f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 560f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(960f, 640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 800f)
                horizontalLineTo(760f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(40f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(640f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Mail_lock!!
    }

private var _Mail_lock: ImageVector? = null

