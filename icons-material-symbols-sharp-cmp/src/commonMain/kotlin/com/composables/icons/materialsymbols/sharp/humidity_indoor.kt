package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Humidity_indoor: ImageVector
    get() {
        if (_Humidity_indoor != null) return _Humidity_indoor!!
        
        _Humidity_indoor = ImageVector.Builder(
            name = "humidity_indoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481f, 660f)
                quadToRelative(66f, 0f, 112.5f, -46f)
                reflectiveQuadTo(640f, 502f)
                quadToRelative(0f, -32f, -12f, -60.5f)
                reflectiveQuadTo(593f, 391f)
                lineTo(480f, 280f)
                lineTo(367f, 391f)
                quadToRelative(-23f, 22f, -35f, 50.5f)
                reflectiveQuadTo(320f, 502f)
                quadToRelative(0f, 66f, 47.5f, 112f)
                reflectiveQuadTo(481f, 660f)
                close()
                moveToRelative(-81f, -160f)
                quadToRelative(0f, -15f, 6f, -28f)
                reflectiveQuadToRelative(17f, -24f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                quadToRelative(11f, 11f, 17f, 24f)
                reflectiveQuadToRelative(6f, 28f)
                horizontalLineTo(400f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 180f)
                lineTo(240f, 360f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
            }
        }.build()
        
        return _Humidity_indoor!!
    }

private var _Humidity_indoor: ImageVector? = null

