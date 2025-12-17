package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thumb_up: ImageVector
    get() {
        if (_Thumb_up != null) return _Thumb_up!!
        
        _Thumb_up = ImageVector.Builder(
            name = "thumb_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 320f)
                quadToRelative(32f, 0f, 56f, 24f)
                reflectiveQuadToRelative(24f, 56f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 7f, -1.5f, 15f)
                reflectiveQuadToRelative(-4.5f, 15f)
                lineTo(794f, 792f)
                quadToRelative(-9f, 20f, -30f, 34f)
                reflectiveQuadToRelative(-44f, 14f)
                horizontalLineTo(400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 760f)
                verticalLineToRelative(-407f)
                quadToRelative(0f, -16f, 6.5f, -30.5f)
                reflectiveQuadTo(344f, 297f)
                lineToRelative(217f, -216f)
                quadToRelative(15f, -14f, 35.5f, -17f)
                reflectiveQuadToRelative(39.5f, 7f)
                quadToRelative(19f, 10f, 27.5f, 28f)
                reflectiveQuadToRelative(3.5f, 37f)
                lineToRelative(-45f, 184f)
                horizontalLineToRelative(218f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(240f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(160f, 840f)
                close()
            }
        }.build()
        
        return _Thumb_up!!
    }

private var _Thumb_up: ImageVector? = null

