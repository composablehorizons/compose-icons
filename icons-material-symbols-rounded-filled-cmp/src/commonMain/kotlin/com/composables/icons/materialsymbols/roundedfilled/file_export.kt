package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.File_export: ImageVector
    get() {
        if (_File_export != null) return _File_export!!
        
        _File_export = ImageVector.Builder(
            name = "file_export",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 777f)
                lineToRelative(-90f, 90f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(174f, 866f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(90f, -90f)
                horizontalLineToRelative(-50f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(174f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(214f, 640f)
                horizontalLineToRelative(146f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 680f)
                verticalLineToRelative(146f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 866f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 826f)
                verticalLineToRelative(-49f)
                close()
                moveTo(520f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -520f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _File_export!!
    }

private var _File_export: ImageVector? = null

