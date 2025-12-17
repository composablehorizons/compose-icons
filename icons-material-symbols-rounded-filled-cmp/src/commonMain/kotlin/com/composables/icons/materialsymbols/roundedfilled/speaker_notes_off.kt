package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Speaker_notes_off: ImageVector
    get() {
        if (_Speaker_notes_off != null) return _Speaker_notes_off!!
        
        _Speaker_notes_off = ImageVector.Builder(
            name = "speaker_notes_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-603f)
                horizontalLineToRelative(100f)
                lineToRelative(260f, 260f)
                horizontalLineTo(328f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(606f, 720f)
                horizontalLineTo(240f)
                close()
                moveToRelative(640f, -560f)
                verticalLineToRelative(509f)
                quadToRelative(0f, 14f, -7f, 23f)
                reflectiveQuadToRelative(-18f, 14f)
                quadToRelative(-11f, 5f, -22f, 3.5f)
                reflectiveQuadTo(812f, 698f)
                lineTo(554f, 440f)
                horizontalLineToRelative(126f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineTo(474f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(246f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                horizontalLineTo(440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 280f)
                verticalLineToRelative(6f)
                lineTo(262f, 148f)
                quadToRelative(-10f, -10f, -11.5f, -21f)
                reflectiveQuadToRelative(3.5f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(509f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                close()
                moveTo(280f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                close()
            }
        }.build()
        
        return _Speaker_notes_off!!
    }

private var _Speaker_notes_off: ImageVector? = null

