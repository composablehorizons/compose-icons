package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mark_email_read: ImageVector
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
                moveTo(160f, 240f)
                lineToRelative(320f, 200f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(-120f)
                lineTo(501f, 507f)
                quadToRelative(-3f, 2f, -21f, 6f)
                quadToRelative(-5f, 0f, -10.5f, -1.5f)
                reflectiveQuadTo(459f, 507f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(220f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(420f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(380f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -240f)
                close()
                moveToRelative(0f, -120f)
                close()
                moveToRelative(0f, 75f)
                close()
                moveToRelative(158f, 253f)
                lineToRelative(198f, -198f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(666f, 852f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
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

