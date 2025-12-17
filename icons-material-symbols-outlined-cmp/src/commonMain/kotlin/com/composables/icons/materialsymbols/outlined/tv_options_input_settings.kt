package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tv_options_input_settings: ImageVector
    get() {
        if (_Tv_options_input_settings != null) return _Tv_options_input_settings!!
        
        _Tv_options_input_settings = ImageVector.Builder(
            name = "tv_options_input_settings",
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
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(280f, -40f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, -60f)
                quadToRelative(12f, -5f, 22.5f, -10.5f)
                reflectiveQuadTo(576f, 596f)
                lineToRelative(58f, 18f)
                lineToRelative(40f, -68f)
                lineToRelative(-46f, -40f)
                quadToRelative(2f, -13f, 2f, -26f)
                reflectiveQuadToRelative(-2f, -26f)
                lineToRelative(46f, -40f)
                lineToRelative(-40f, -68f)
                lineToRelative(-58f, 18f)
                quadToRelative(-11f, -8f, -21.5f, -13.5f)
                reflectiveQuadTo(532f, 340f)
                lineToRelative(-12f, -60f)
                horizontalLineToRelative(-80f)
                lineToRelative(-12f, 60f)
                quadToRelative(-12f, 5f, -22.5f, 10.5f)
                reflectiveQuadTo(384f, 364f)
                lineToRelative(-58f, -18f)
                lineToRelative(-40f, 68f)
                lineToRelative(46f, 40f)
                quadToRelative(-2f, 13f, -2f, 26f)
                reflectiveQuadToRelative(2f, 26f)
                lineToRelative(-46f, 40f)
                lineToRelative(40f, 68f)
                lineToRelative(58f, -18f)
                quadToRelative(11f, 8f, 21.5f, 13.5f)
                reflectiveQuadTo(428f, 620f)
                lineToRelative(12f, 60f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Tv_options_input_settings!!
    }

private var _Tv_options_input_settings: ImageVector? = null

