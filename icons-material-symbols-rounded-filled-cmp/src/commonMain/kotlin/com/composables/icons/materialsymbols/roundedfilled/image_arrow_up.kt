package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Image_arrow_up: ImageVector
    get() {
        if (_Image_arrow_up != null) return _Image_arrow_up!!
        
        _Image_arrow_up = ImageVector.Builder(
            name = "image_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(295f)
                quadToRelative(20f, 0f, 30.5f, 16.5f)
                reflectiveQuadTo(529f, 172f)
                quadToRelative(-5f, 17f, -7f, 34f)
                reflectiveQuadToRelative(-2f, 34f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(8f, 0f, 17f, -0.5f)
                reflectiveQuadToRelative(17f, -2.5f)
                quadToRelative(18f, -2f, 32f, 9f)
                reflectiveQuadToRelative(14f, 28f)
                verticalLineToRelative(246f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -160f)
                horizontalLineToRelative(400f)
                quadToRelative(12f, 0f, 18f, -11f)
                reflectiveQuadToRelative(-2f, -21f)
                lineTo(586f, 501f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineTo(450f, 640f)
                lineToRelative(-74f, -99f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-80f, 107f)
                quadToRelative(-8f, 10f, -2f, 21f)
                reflectiveQuadToRelative(18f, 11f)
                close()
                moveToRelative(480f, -280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 360f)
                verticalLineToRelative(-127f)
                lineToRelative(-36f, 35f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(628f, 268f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(892f, 268f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -35f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 400f)
                close()
            }
        }.build()
        
        return _Image_arrow_up!!
    }

private var _Image_arrow_up: ImageVector? = null

