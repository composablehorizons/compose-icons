package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Respiratory_rate: ImageVector
    get() {
        if (_Respiratory_rate != null) return _Respiratory_rate!!
        
        _Respiratory_rate = ImageVector.Builder(
            name = "respiratory_rate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(574f, 704f)
                lineToRelative(66f, -67f)
                verticalLineToRelative(-37f)
                verticalLineToRelative(37f)
                lineToRelative(-66f, 67f)
                close()
                moveToRelative(212f, 0f)
                lineToRelative(-66f, -67f)
                verticalLineToRelative(-37f)
                verticalLineToRelative(37f)
                lineToRelative(66f, 67f)
                close()
                moveTo(480f, 480f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-220f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(500f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(440f, 860f)
                verticalLineToRelative(-147f)
                lineToRelative(53f, -141f)
                quadToRelative(9f, -23f, 29.5f, -37.5f)
                reflectiveQuadTo(568f, 520f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(72f)
                quadToRelative(25f, 0f, 45.5f, 14.5f)
                reflectiveQuadTo(867f, 572f)
                lineToRelative(53f, 141f)
                verticalLineToRelative(147f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 920f)
                horizontalLineToRelative(-80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 860f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-113f)
                lineToRelative(-48f, -127f)
                horizontalLineToRelative(-72f)
                verticalLineToRelative(37f)
                lineToRelative(66f, 67f)
                lineToRelative(-56f, 56f)
                lineToRelative(-50f, -50f)
                lineToRelative(-50f, 50f)
                lineToRelative(-56f, -56f)
                lineToRelative(66f, -67f)
                verticalLineToRelative(-37f)
                horizontalLineToRelative(-72f)
                lineToRelative(-48f, 127f)
                verticalLineToRelative(113f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(180f, -200f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineToRelative(56f, 111f)
                lineToRelative(134f, -271f)
                horizontalLineToRelative(51f)
                lineToRelative(90f, 181f)
                quadToRelative(-21f, 2f, -39.5f, 9f)
                reflectiveQuadTo(481f, 490f)
                lineToRelative(-41f, -80f)
                lineToRelative(-135f, 270f)
                horizontalLineToRelative(-50f)
                lineToRelative(-80f, -160f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Respiratory_rate!!
    }

private var _Respiratory_rate: ImageVector? = null

