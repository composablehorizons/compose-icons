package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bedroom_child: ImageVector
    get() {
        if (_Bedroom_child != null) return _Bedroom_child!!
        
        _Bedroom_child = ImageVector.Builder(
            name = "bedroom_child",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 620f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(690f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 650f)
                verticalLineToRelative(-136f)
                quadToRelative(0f, -30f, -16.5f, -53.5f)
                reflectiveQuadTo(660f, 426f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(580f, 280f)
                horizontalLineTo(380f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(300f, 360f)
                verticalLineToRelative(66f)
                quadToRelative(-27f, 11f, -43.5f, 34.5f)
                reflectiveQuadTo(240f, 514f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(300f, 650f)
                verticalLineToRelative(-30f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                horizontalLineToRelative(292f)
                quadToRelative(14f, 0f, 24f, 10f)
                reflectiveQuadToRelative(10f, 24f)
                verticalLineToRelative(46f)
                horizontalLineTo(300f)
                close()
                moveToRelative(60f, -140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Bedroom_child!!
    }

private var _Bedroom_child: ImageVector? = null

