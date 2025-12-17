package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.File_save: ImageVector
    get() {
        if (_File_save != null) return _File_save!!
        
        _File_save = ImageVector.Builder(
            name = "file_save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 688f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-36f, 36f)
                verticalLineToRelative(-127f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 521f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 561f)
                verticalLineToRelative(127f)
                close()
                moveTo(600f, 880f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 960f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 880f)
                close()
                moveToRelative(-360f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(247f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 441f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 401f)
                verticalLineToRelative(-41f)
                horizontalLineTo(540f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 300f)
                verticalLineToRelative(-140f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _File_save!!
    }

private var _File_save: ImageVector? = null

