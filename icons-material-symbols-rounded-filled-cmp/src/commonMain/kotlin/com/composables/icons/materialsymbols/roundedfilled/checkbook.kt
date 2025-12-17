package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Checkbook: ImageVector
    get() {
        if (_Checkbook != null) return _Checkbook!!
        
        _Checkbook = ImageVector.Builder(
            name = "checkbook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(856f, 574f)
                lineTo(602f, 828f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-33f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-33f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(254f, -254f)
                lineToRelative(70f, 70f)
                close()
                moveTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 11f, -12f, 25.5f)
                reflectiveQuadTo(840f, 320f)
                horizontalLineToRelative(-7f)
                quadToRelative(-16f, 0f, -30.5f, 6f)
                reflectiveQuadTo(777f, 343f)
                lineTo(623f, 497f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                horizontalLineToRelative(192f)
                quadToRelative(14f, 0f, 19f, 12f)
                reflectiveQuadToRelative(-5f, 22f)
                lineTo(383f, 737f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                close()
                moveToRelative(200f, -240f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                close()
                moveToRelative(600f, 110f)
                lineToRelative(-70f, -70f)
                lineToRelative(36f, -36f)
                quadToRelative(5f, -5f, 11f, -5f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(48f, 48f)
                quadToRelative(5f, 5f, 5f, 11f)
                reflectiveQuadToRelative(-5f, 11f)
                lineToRelative(-36f, 36f)
                close()
            }
        }.build()
        
        return _Checkbook!!
    }

private var _Checkbook: ImageVector? = null

