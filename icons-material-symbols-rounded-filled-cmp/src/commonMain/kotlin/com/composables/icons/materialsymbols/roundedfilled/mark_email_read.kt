package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mark_email_read: ImageVector
    get() {
        if (_Mark_email_read != null) return _Mark_email_read!!
        
        _Mark_email_read = ImageVector.Builder(
            name = "mark_email_read",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(141f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(857f, 437f)
                lineTo(639f, 655f)
                lineToRelative(-58f, -58f)
                quadToRelative(-23f, -23f, -57f, -23f)
                reflectiveQuadToRelative(-57f, 23f)
                lineToRelative(-55f, 55f)
                quadToRelative(-24f, 24f, -19.5f, 59f)
                reflectiveQuadToRelative(27.5f, 62f)
                quadToRelative(7f, 8f, 3f, 17.5f)
                reflectiveQuadToRelative(-15f, 9.5f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -360f)
                lineTo(212f, 272f)
                quadToRelative(-17f, -11f, -34.5f, -1f)
                reflectiveQuadTo(160f, 301f)
                quadToRelative(0f, 9f, 4f, 16.5f)
                reflectiveQuadToRelative(12f, 12.5f)
                lineToRelative(283f, 177f)
                quadToRelative(10f, 6f, 21f, 6f)
                reflectiveQuadToRelative(21f, -6f)
                lineToRelative(283f, -177f)
                quadToRelative(8f, -5f, 12f, -12.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(0f, -20f, -17.5f, -30f)
                reflectiveQuadToRelative(-34.5f, 1f)
                lineTo(480f, 440f)
                close()
                moveToRelative(158f, 328f)
                lineToRelative(198f, -198f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(666f, 852f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(496f, 738f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(86f, 86f)
                close()
            }
        }.build()
        
        return _Mark_email_read!!
    }

private var _Mark_email_read: ImageVector? = null

