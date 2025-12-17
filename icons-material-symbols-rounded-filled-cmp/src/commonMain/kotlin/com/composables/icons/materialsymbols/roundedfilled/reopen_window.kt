package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Reopen_window: ImageVector
    get() {
        if (_Reopen_window != null) return _Reopen_window!!
        
        _Reopen_window = ImageVector.Builder(
            name = "reopen_window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineTo(160f)
                close()
                moveTo(760f, 960f)
                quadToRelative(-57f, 0f, -104f, -28.5f)
                reflectiveQuadTo(583f, 855f)
                quadToRelative(-7f, -12f, -2.5f, -25.5f)
                reflectiveQuadTo(598f, 811f)
                quadToRelative(11f, -5f, 22f, 0f)
                reflectiveQuadToRelative(17f, 16f)
                quadToRelative(18f, 33f, 51f, 53f)
                reflectiveQuadToRelative(72f, 20f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-28f, 0f, -53f, 10f)
                reflectiveQuadToRelative(-45f, 30f)
                horizontalLineToRelative(28f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(720f, 690f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(690f, 720f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 680f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(590f, 560f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(620f, 590f)
                verticalLineToRelative(27f)
                quadToRelative(29f, -27f, 65f, -42f)
                reflectiveQuadToRelative(75f, -15f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 760f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 960f)
                close()
            }
        }.build()
        
        return _Reopen_window!!
    }

private var _Reopen_window: ImageVector? = null

