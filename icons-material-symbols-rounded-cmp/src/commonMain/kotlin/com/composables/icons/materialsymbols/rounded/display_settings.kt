package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Display_settings: ImageVector
    get() {
        if (_Display_settings != null) return _Display_settings!!
        
        _Display_settings = ImageVector.Builder(
            name = "display_settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 550f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(330f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 570f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 440f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(300f, 470f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-30f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 550f)
                horizontalLineToRelative(30f)
                close()
                moveToRelative(130f, 0f)
                horizontalLineToRelative(260f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(690f, 490f)
                horizontalLineTo(430f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(430f, 550f)
                close()
                moveToRelative(230f, -160f)
                horizontalLineToRelative(30f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(690f, 330f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(630f, 280f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(600f, 310f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 440f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(660f, 410f)
                verticalLineToRelative(-20f)
                close()
                moveToRelative(-390f, 0f)
                horizontalLineToRelative(260f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(530f, 330f)
                horizontalLineTo(270f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 360f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 390f)
                close()
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Display_settings!!
    }

private var _Display_settings: ImageVector? = null

