package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_check_2: ImageVector
    get() {
        if (_Folder_check_2 != null) return _Folder_check_2!!
        
        _Folder_check_2 = ImageVector.Builder(
            name = "folder_check_2",
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
                horizontalLineToRelative(207f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(107f)
                quadToRelative(0f, 21f, -18f, 31.5f)
                reflectiveQuadToRelative(-38f, 1.5f)
                quadToRelative(-25f, -10f, -51.5f, -15f)
                reflectiveQuadToRelative(-52.5f, -5f)
                quadToRelative(-63f, 0f, -117.5f, 26f)
                reflectiveQuadTo(510f, 535.5f)
                quadTo(472f, 579f, 453f, 636f)
                reflectiveQuadToRelative(-11f, 119f)
                quadToRelative(2f, 18f, -9f, 31.5f)
                reflectiveQuadTo(405f, 800f)
                horizontalLineTo(160f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-57f, -138f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(90f, -89f)
                quadToRelative(9f, -9f, 9f, -21.5f)
                reflectiveQuadToRelative(-9f, -21.5f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 8.5f)
                lineToRelative(-76f, 75f)
                lineToRelative(-18f, -18f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 9.5f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(32f, 32f)
                close()
            }
        }.build()
        
        return _Folder_check_2!!
    }

private var _Folder_check_2: ImageVector? = null

