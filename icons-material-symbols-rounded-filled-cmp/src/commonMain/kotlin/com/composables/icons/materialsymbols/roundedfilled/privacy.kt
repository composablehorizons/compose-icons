package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Privacy: ImageVector
    get() {
        if (_Privacy != null) return _Privacy!!
        
        _Privacy = ImageVector.Builder(
            name = "privacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(794f, 906f)
                lineTo(54f, 166f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(740f, 740f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(52f, -240f)
                lineTo(720f, 540f)
                verticalLineToRelative(67f)
                lineTo(480f, 367f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(-2f, 0f, -3f, 0.5f)
                reflectiveQuadToRelative(-3f, 0.5f)
                lineTo(273f, 160f)
                horizontalLineToRelative(367f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(560f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineTo(428f)
                verticalLineToRelative(-122f)
                quadToRelative(37f, -5f, 69f, -22.5f)
                reflectiveQuadToRelative(56f, -46.5f)
                lineToRelative(-41f, -41f)
                quadToRelative(-20f, 26f, -49.5f, 40.5f)
                reflectiveQuadTo(400f, 623f)
                quadToRelative(-53f, 0f, -92.5f, -33.5f)
                reflectiveQuadTo(259f, 505f)
                quadToRelative(-2f, -11f, -11f, -18f)
                reflectiveQuadToRelative(-20f, -7f)
                quadToRelative(-12f, 0f, -20f, 8f)
                reflectiveQuadToRelative(-6f, 19f)
                quadToRelative(9f, 66f, 55.5f, 113.5f)
                reflectiveQuadTo(372f, 678f)
                verticalLineToRelative(122f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -368f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(10f, 0f, 19f, -3f)
                reflectiveQuadToRelative(18f, -8f)
                lineTo(320f, 432f)
                close()
            }
        }.build()
        
        return _Privacy!!
    }

private var _Privacy: ImageVector? = null

