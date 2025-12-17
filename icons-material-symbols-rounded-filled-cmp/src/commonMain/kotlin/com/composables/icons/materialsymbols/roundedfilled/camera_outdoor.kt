package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Camera_outdoor: ImageVector
    get() {
        if (_Camera_outdoor != null) return _Camera_outdoor!!
        
        _Camera_outdoor = ImageVector.Builder(
            name = "camera_outdoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -19f, 8.5f, -36f)
                reflectiveQuadToRelative(23.5f, -28f)
                lineToRelative(240f, -180f)
                quadToRelative(21f, -16f, 48f, -16f)
                reflectiveQuadToRelative(48f, 16f)
                lineToRelative(240f, 180f)
                quadToRelative(15f, 11f, 23.5f, 28f)
                reflectiveQuadToRelative(8.5f, 36f)
                quadToRelative(-11f, 11f, -17.5f, 25.5f)
                reflectiveQuadTo(760f, 440f)
                horizontalLineTo(520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(520f, 760f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 680f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 480f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(40f)
                lineToRelative(51f, -27f)
                quadToRelative(10f, -5f, 19.5f, 1f)
                reflectiveQuadToRelative(9.5f, 17f)
                verticalLineToRelative(98f)
                quadToRelative(0f, 11f, -9.5f, 17f)
                reflectiveQuadToRelative(-19.5f, 1f)
                lineToRelative(-51f, -27f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 720f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Camera_outdoor!!
    }

private var _Camera_outdoor: ImageVector? = null

