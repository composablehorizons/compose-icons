package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Aod_tablet: ImageVector
    get() {
        if (_Aod_tablet != null) return _Aod_tablet!!
        
        _Aod_tablet = ImageVector.Builder(
            name = "aod_tablet",
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
                moveToRelative(110f, -260f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(320f, 430f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(350f, 400f)
                horizontalLineToRelative(260f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(640f, 430f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(610f, 460f)
                horizontalLineTo(350f)
                close()
                moveToRelative(40f, 120f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(360f, 550f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(390f, 520f)
                horizontalLineToRelative(180f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(600f, 550f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(570f, 580f)
                horizontalLineTo(390f)
                close()
            }
        }.build()
        
        return _Aod_tablet!!
    }

private var _Aod_tablet: ImageVector? = null

