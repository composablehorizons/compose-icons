package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thumbs_up_double: ImageVector
    get() {
        if (_Thumbs_up_double != null) return _Thumbs_up_double!!
        
        _Thumbs_up_double = ImageVector.Builder(
            name = "thumbs_up_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 280f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 360f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 8f, -1.5f, 16f)
                reflectiveQuadToRelative(-4.5f, 16f)
                lineTo(810f, 655f)
                quadToRelative(-5f, 11f, -14.5f, 18f)
                reflectiveQuadToRelative(-21.5f, 7f)
                quadToRelative(-22f, 0f, -33.5f, -18f)
                reflectiveQuadToRelative(-3.5f, -38f)
                lineToRelative(103f, -241f)
                verticalLineToRelative(-23f)
                horizontalLineTo(634f)
                quadToRelative(-19f, 0f, -30.5f, -14f)
                reflectiveQuadToRelative(-9.5f, -32f)
                lineToRelative(13f, -88f)
                lineToRelative(-13.5f, 13.5f)
                lineTo(580f, 253f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(88f, -88f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(4f, 4f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(694f, 180f)
                lineToRelative(-14f, 100f)
                close()
                moveTo(80f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(427f, 0f)
                horizontalLineTo(160f)
                verticalLineToRelative(-360f)
                lineToRelative(212f, -212f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(4f, 4f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(454f, 340f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 8f, -1.5f, 15.5f)
                reflectiveQuadTo(674f, 575f)
                lineToRelative(-93f, 217f)
                quadToRelative(-10f, 22f, -30f, 35f)
                reflectiveQuadToRelative(-44f, 13f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(93f, -216f)
                verticalLineToRelative(-24f)
                horizontalLineTo(394f)
                quadToRelative(-18f, 0f, -30f, -14f)
                reflectiveQuadToRelative(-10f, -32f)
                lineToRelative(13f, -88f)
                lineToRelative(-127f, 127f)
                verticalLineToRelative(247f)
                horizontalLineToRelative(267f)
                close()
                moveToRelative(-267f, 0f)
                verticalLineToRelative(-286f)
                verticalLineToRelative(286f)
                close()
            }
        }.build()
        
        return _Thumbs_up_double!!
    }

private var _Thumbs_up_double: ImageVector? = null

