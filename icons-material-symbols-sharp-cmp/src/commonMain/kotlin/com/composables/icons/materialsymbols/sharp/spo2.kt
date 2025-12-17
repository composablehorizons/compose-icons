package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Spo2: ImageVector
    get() {
        if (_Spo2 != null) return _Spo2!!
        
        _Spo2 = ImageVector.Builder(
            name = "spo2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(240f)
                horizontalLineTo(440f)
                close()
                moveToRelative(60f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(680f, 880f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-30f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(150f)
                horizontalLineTo(740f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-320f, -2f)
                quadTo(237f, 864f, 158.5f, 772.5f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(132f, 112f, 209.5f, 212f)
                reflectiveQuadTo(710f, 480f)
                horizontalLineToRelative(-83f)
                quadToRelative(-22f, -63f, -79f, -137f)
                reflectiveQuadTo(400f, 186f)
                quadTo(281f, 295f, 220.5f, 387f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, 96f, 55.5f, 163.5f)
                reflectiveQuadTo(360f, 797f)
                verticalLineToRelative(81f)
                close()
                moveToRelative(34f, -326f)
                close()
            }
        }.build()
        
        return _Spo2!!
    }

private var _Spo2: ImageVector? = null

