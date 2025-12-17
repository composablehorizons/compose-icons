package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Language_chinese_wubi: ImageVector
    get() {
        if (_Language_chinese_wubi != null) return _Language_chinese_wubi!!
        
        _Language_chinese_wubi = ImageVector.Builder(
            name = "language_chinese_wubi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(702f, 626f)
                quadToRelative(28f, 0f, 54.5f, -13f)
                reflectiveQuadToRelative(48.5f, -37f)
                verticalLineToRelative(-106f)
                quadToRelative(-23f, 3f, -42.5f, 7f)
                reflectiveQuadToRelative(-36.5f, 9f)
                quadToRelative(-45f, 14f, -67.5f, 35f)
                reflectiveQuadTo(636f, 570f)
                quadToRelative(0f, 26f, 18f, 41f)
                reflectiveQuadToRelative(48f, 15f)
                close()
                moveToRelative(-23f, 68f)
                quadToRelative(-57f, 0f, -90f, -32.5f)
                reflectiveQuadTo(556f, 573f)
                quadToRelative(0f, -52f, 33f, -85f)
                reflectiveQuadToRelative(106f, -53f)
                quadToRelative(23f, -6f, 50.5f, -11f)
                reflectiveQuadToRelative(59.5f, -9f)
                quadToRelative(-2f, -47f, -22f, -68.5f)
                reflectiveQuadTo(721f, 325f)
                quadToRelative(-26f, 0f, -51.5f, 9.5f)
                reflectiveQuadTo(604f, 368f)
                lineToRelative(-32f, -56f)
                quadToRelative(33f, -25f, 77.5f, -40.5f)
                reflectiveQuadTo(740f, 256f)
                quadToRelative(71f, 0f, 108f, 44f)
                reflectiveQuadToRelative(37f, 128f)
                verticalLineToRelative(257f)
                horizontalLineToRelative(-67f)
                lineToRelative(-6f, -45f)
                quadToRelative(-28f, 25f, -61.5f, 39.5f)
                reflectiveQuadTo(679f, 694f)
                close()
                moveToRelative(-432f, -42f)
                horizontalLineToRelative(169f)
                verticalLineToRelative(-161f)
                horizontalLineTo(282f)
                quadToRelative(-8f, 41f, -16.5f, 81f)
                reflectiveQuadTo(247f, 652f)
                close()
                moveTo(75f, 700f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(119f)
                quadToRelative(10f, -40f, 18.5f, -80f)
                reflectiveQuadToRelative(16.5f, -81f)
                horizontalLineTo(128f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(110f)
                quadToRelative(5f, -26f, 9.5f, -53f)
                reflectiveQuadToRelative(9.5f, -53f)
                horizontalLineTo(109f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(404f)
                verticalLineToRelative(48f)
                horizontalLineTo(311f)
                quadToRelative(-5f, 26f, -10f, 53f)
                reflectiveQuadToRelative(-10f, 53f)
                horizontalLineToRelative(173f)
                verticalLineToRelative(211f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(48f)
                horizontalLineTo(75f)
                close()
            }
        }.build()
        
        return _Language_chinese_wubi!!
    }

private var _Language_chinese_wubi: ImageVector? = null

