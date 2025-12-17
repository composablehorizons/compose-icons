package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mic_external_off: ImageVector
    get() {
        if (_Mic_external_off != null) return _Mic_external_off!!
        
        _Mic_external_off = ImageVector.Builder(
            name = "mic_external_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 266f)
                lineTo(214f, 100f)
                quadToRelative(14f, -11f, 31f, -15.5f)
                reflectiveQuadToRelative(35f, -4.5f)
                quadToRelative(50f, 0f, 85f, 34.5f)
                reflectiveQuadToRelative(35f, 85.5f)
                quadToRelative(0f, 18f, -5.5f, 34.5f)
                reflectiveQuadTo(380f, 266f)
                close()
                moveToRelative(420f, 420f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-446f)
                horizontalLineTo(560f)
                verticalLineToRelative(286f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-286f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(606f)
                close()
                moveTo(240f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                lineToRelative(-40f, -400f)
                horizontalLineToRelative(46f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                lineToRelative(-260f, -260f)
                verticalLineToRelative(208f)
                horizontalLineTo(240f)
                close()
                moveToRelative(32f, -240f)
                horizontalLineToRelative(16f)
                lineToRelative(22f, -218f)
                lineToRelative(-24f, -22f)
                horizontalLineToRelative(-38f)
                lineToRelative(24f, 240f)
                close()
                moveToRelative(208f, 160f)
                verticalLineToRelative(-208f)
                lineToRelative(-98f, -98f)
                lineToRelative(-22f, 226f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                close()
                moveTo(272f, 400f)
                horizontalLineToRelative(-24f)
                horizontalLineToRelative(62f)
                horizontalLineToRelative(-38f)
                close()
            }
        }.build()
        
        return _Mic_external_off!!
    }

private var _Mic_external_off: ImageVector? = null

