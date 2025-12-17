package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Speed_camera: ImageVector
    get() {
        if (_Speed_camera != null) return _Speed_camera!!
        
        _Speed_camera = ImageVector.Builder(
            name = "speed_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(678f, 587f)
                lineToRelative(-37f, -21f)
                quadToRelative(-9f, -5f, -10f, -16f)
                reflectiveQuadToRelative(8f, -18f)
                lineToRelative(94f, -70f)
                quadToRelative(10f, -8f, 21.5f, -8.5f)
                reflectiveQuadTo(777f, 459f)
                lineToRelative(37f, 21f)
                quadToRelative(9f, 5f, 9.5f, 16f)
                reflectiveQuadToRelative(-7.5f, 18f)
                lineToRelative(-94f, 70f)
                quadToRelative(-10f, 8f, -21.5f, 8.5f)
                reflectiveQuadTo(678f, 587f)
                close()
                moveTo(200f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 720f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-238f)
                lineToRelative(-120f, -69f)
                quadToRelative(-29f, -17f, -37.5f, -48.5f)
                reflectiveQuadTo(211f, 304f)
                lineToRelative(60f, -104f)
                quadToRelative(17f, -29f, 48.5f, -37.5f)
                reflectiveQuadTo(380f, 171f)
                lineToRelative(329f, 189f)
                quadToRelative(19f, 11f, 20f, 32.5f)
                reflectiveQuadTo(713f, 427f)
                lineTo(559f, 542f)
                quadToRelative(-20f, 14f, -43f, 15.5f)
                reflectiveQuadTo(472f, 547f)
                lineToRelative(-32f, -18f)
                verticalLineToRelative(191f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Speed_camera!!
    }

private var _Speed_camera: ImageVector? = null

