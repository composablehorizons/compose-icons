package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wrist: ImageVector
    get() {
        if (_Wrist != null) return _Wrist!!
        
        _Wrist = ImageVector.Builder(
            name = "wrist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(244f, 680f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 280f)
                horizontalLineToRelative(144f)
                lineToRelative(44f, -45f)
                quadToRelative(17f, -17f, 39f, -26f)
                reflectiveQuadToRelative(46f, -9f)
                horizontalLineToRelative(407f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 280f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 380f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 420f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 560f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 700f)
                horizontalLineTo(485f)
                lineToRelative(6f, 12f)
                quadToRelative(17f, 35f, 10.5f, 72.5f)
                reflectiveQuadTo(468f, 849f)
                quadToRelative(-12f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-27f, -11f)
                lineTo(244f, 680f)
                close()
            }
        }.build()
        
        return _Wrist!!
    }

private var _Wrist: ImageVector? = null

