package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Av1: ImageVector
    get() {
        if (_Av1 != null) return _Av1!!
        
        _Av1 = ImageVector.Builder(
            name = "av1",
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
                moveToRelative(120f, -180f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(330f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 570f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineTo(220f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(180f, 400f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(210f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(240f, 570f)
                verticalLineToRelative(-30f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(260f, 17f)
                lineToRelative(-34f, -116f)
                quadToRelative(-3f, -9f, -10.5f, -15f)
                reflectiveQuadToRelative(-17.5f, -6f)
                quadToRelative(-14f, 0f, -22.5f, 11.5f)
                reflectiveQuadTo(411f, 397f)
                lineToRelative(53f, 182f)
                quadToRelative(3f, 9f, 10.5f, 15f)
                reflectiveQuadToRelative(17.5f, 6f)
                horizontalLineToRelative(16f)
                quadToRelative(10f, 0f, 17.5f, -6f)
                reflectiveQuadToRelative(10.5f, -15f)
                lineToRelative(53f, -182f)
                quadToRelative(4f, -14f, -4.5f, -25.5f)
                reflectiveQuadTo(562f, 360f)
                quadToRelative(-10f, 0f, -17.5f, 6f)
                reflectiveQuadTo(534f, 381f)
                lineToRelative(-34f, 116f)
                close()
                moveToRelative(220f, -77f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(750f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(780f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(750f, 360f)
                horizontalLineToRelative(-60f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(660f, 390f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(690f, 420f)
                horizontalLineToRelative(30f)
                close()
            }
        }.build()
        
        return _Av1!!
    }

private var _Av1: ImageVector? = null

