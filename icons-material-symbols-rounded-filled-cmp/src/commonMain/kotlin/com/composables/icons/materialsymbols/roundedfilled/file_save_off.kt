package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.File_save_off: ImageVector
    get() {
        if (_File_save_off != null) return _File_save_off!!
        
        _File_save_off = ImageVector.Builder(
            name = "file_save_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(836f, 724f)
                lineToRelative(-56f, -57f)
                lineToRelative(16f, -16f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(852f, 708f)
                lineToRelative(-16f, 16f)
                close()
                moveToRelative(-76f, -77f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(-40f, -207f)
                horizontalLineTo(553f)
                lineTo(260f, 148f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(289f, 80f)
                horizontalLineToRelative(198f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(47f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 440f)
                close()
                moveTo(600f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineToRelative(167f)
                lineTo(480f, 593f)
                verticalLineToRelative(167f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-447f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineTo(868f, 868f)
                quadToRelative(5f, 5f, 8.5f, 13f)
                reflectiveQuadToRelative(3.5f, 16f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 960f)
                horizontalLineTo(600f)
                close()
                moveTo(480f, 160f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(540f, 360f)
                horizontalLineToRelative(140f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                close()
            }
        }.build()
        
        return _File_save_off!!
    }

private var _File_save_off: ImageVector? = null

