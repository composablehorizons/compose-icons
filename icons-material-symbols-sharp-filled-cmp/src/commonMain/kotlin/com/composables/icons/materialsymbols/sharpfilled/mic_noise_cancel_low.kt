package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mic_noise_cancel_low: ImageVector
    get() {
        if (_Mic_noise_cancel_low != null) return _Mic_noise_cancel_low!!
        
        _Mic_noise_cancel_low = ImageVector.Builder(
            name = "mic_noise_cancel_low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 936f)
                verticalLineTo(216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(720f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(253f, 831f)
                lineToRelative(-56f, -56f)
                quadToRelative(40f, -40f, 61.5f, -91f)
                reflectiveQuadTo(280f, 576f)
                quadToRelative(0f, -57f, -21.5f, -108f)
                reflectiveQuadTo(197f, 377f)
                lineToRelative(56f, -57f)
                quadToRelative(51f, 51f, 78.5f, 117f)
                reflectiveQuadTo(359f, 575f)
                quadToRelative(0f, 72f, -27.5f, 138.5f)
                reflectiveQuadTo(253f, 831f)
                close()
                moveTo(141f, 718f)
                lineToRelative(-57f, -57f)
                quadToRelative(17f, -17f, 26.5f, -39.5f)
                reflectiveQuadTo(120f, 575f)
                quadToRelative(0f, -24f, -9.5f, -46f)
                reflectiveQuadTo(84f, 490f)
                lineToRelative(57f, -57f)
                quadToRelative(29f, 28f, 44.5f, 65f)
                reflectiveQuadToRelative(15.5f, 77f)
                quadToRelative(0f, 40f, -15.5f, 77.5f)
                reflectiveQuadTo(141f, 718f)
                close()
                moveToRelative(459f, -102f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Mic_noise_cancel_low!!
    }

private var _Mic_noise_cancel_low: ImageVector? = null

