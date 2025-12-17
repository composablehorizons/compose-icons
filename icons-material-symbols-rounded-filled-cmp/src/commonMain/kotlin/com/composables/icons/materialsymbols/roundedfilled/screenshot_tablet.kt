package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Screenshot_tablet: ImageVector
    get() {
        if (_Screenshot_tablet != null) return _Screenshot_tablet!!
        
        _Screenshot_tablet = ImageVector.Builder(
            name = "screenshot_tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(120f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(380f, -100f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 650f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 680f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(680f, 650f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(650f, 520f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(620f, 550f)
                verticalLineToRelative(70f)
                close()
                moveTo(340f, 340f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 310f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 280f)
                horizontalLineTo(310f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(280f, 310f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(310f, 440f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(340f, 410f)
                verticalLineToRelative(-70f)
                close()
            }
        }.build()
        
        return _Screenshot_tablet!!
    }

private var _Screenshot_tablet: ImageVector? = null

