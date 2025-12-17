package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mic_external_on: ImageVector
    get() {
        if (_Mic_external_on != null) return _Mic_external_on!!
        
        _Mic_external_on = ImageVector.Builder(
            name = "mic_external_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 280f)
                quadToRelative(-15f, -17f, -23.5f, -37f)
                reflectiveQuadToRelative(-8.5f, -43f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 23f, -8.5f, 43f)
                reflectiveQuadTo(368f, 280f)
                horizontalLineTo(192f)
                close()
                moveToRelative(48f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                lineToRelative(-40f, -400f)
                horizontalLineToRelative(240f)
                lineToRelative(-40f, 400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-720f)
                horizontalLineTo(560f)
                verticalLineToRelative(720f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Mic_external_on!!
    }

private var _Mic_external_on: ImageVector? = null

