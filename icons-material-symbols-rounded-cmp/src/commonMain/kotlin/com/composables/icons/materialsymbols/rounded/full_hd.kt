package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Full_hd: ImageVector
    get() {
        if (_Full_hd != null) return _Full_hd!!
        
        _Full_hd = ImageVector.Builder(
            name = "full_hd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 520f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(530f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(560f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(530f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(500f, 390f)
                verticalLineToRelative(70f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(380f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 570f)
                verticalLineToRelative(-50f)
                close()
                moveToRelative(190f, 80f)
                horizontalLineToRelative(90f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(720f, 360f)
                horizontalLineToRelative(-90f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(600f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 600f)
                close()
                moveToRelative(30f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-420f, -20f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(320f, 490f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(290f, 460f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(340f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(310f, 360f)
                horizontalLineTo(210f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(180f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(210f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(240f, 570f)
                verticalLineToRelative(-50f)
                close()
                moveTo(120f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-480f)
                horizontalLineTo(120f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Full_hd!!
    }

private var _Full_hd: ImageVector? = null

