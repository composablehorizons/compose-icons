package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wc: ImageVector
    get() {
        if (_Wc != null) return _Wc!!
        
        _Wc = ImageVector.Builder(
            name = "wc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 880f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(300f)
                horizontalLineTo(220f)
                close()
                moveToRelative(80f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(220f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(300f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(300f, 240f)
                close()
                moveTo(600f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                lineToRelative(118f, -360f)
                horizontalLineToRelative(124f)
                lineToRelative(118f, 360f)
                horizontalLineTo(720f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
                moveToRelative(60f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(580f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(660f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(740f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(660f, 240f)
                close()
            }
        }.build()
        
        return _Wc!!
    }

private var _Wc: ImageVector? = null

