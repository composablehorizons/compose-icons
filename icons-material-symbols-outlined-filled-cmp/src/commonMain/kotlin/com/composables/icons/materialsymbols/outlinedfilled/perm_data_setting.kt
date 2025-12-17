package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Perm_data_setting: ImageVector
    get() {
        if (_Perm_data_setting != null) return _Perm_data_setting!!
        
        _Perm_data_setting = ImageVector.Builder(
            name = "perm_data_setting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 800f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveTo(720f, 920f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(664f, 836f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -12f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(708f, 580f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(856f, 604f)
                lineToRelative(58f, -18f)
                lineToRelative(40f, 68f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 12f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(812f, 860f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 880f)
                lineToRelative(800f, -800f)
                verticalLineToRelative(386f)
                quadToRelative(-26f, -13f, -58.5f, -19.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(-117f, 0f, -199f, 81.5f)
                reflectiveQuadTo(479f, 720f)
                quadToRelative(0f, 45f, 12f, 84f)
                reflectiveQuadToRelative(37f, 76f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Perm_data_setting!!
    }

private var _Perm_data_setting: ImageVector? = null

