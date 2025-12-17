package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Villa: ImageVector
    get() {
        if (_Villa != null) return _Villa!!
        
        _Villa = ImageVector.Builder(
            name = "villa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineToRelative(240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 480f)
                verticalLineToRelative(360f)
                horizontalLineTo(640f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 680f)
                verticalLineToRelative(160f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-465f)
                quadToRelative(0f, -25f, 14f, -45.5f)
                reflectiveQuadToRelative(37f, -29.5f)
                lineToRelative(415f, -159f)
                quadToRelative(20f, -8f, 37f, 4f)
                reflectiveQuadToRelative(17f, 33f)
                verticalLineToRelative(222f)
                horizontalLineTo(400f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Villa!!
    }

private var _Villa: ImageVector? = null

