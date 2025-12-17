package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hangout_video_off: ImageVector
    get() {
        if (_Hangout_video_off != null) return _Hangout_video_off!!
        
        _Hangout_video_off = ImageVector.Builder(
            name = "hangout_video_off",
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
                lineToRelative(24f, 24f)
                verticalLineToRelative(112f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(710f, -44f)
                lineTo(720f, 606f)
                verticalLineToRelative(-224f)
                quadToRelative(0f, -19f, -17f, -27f)
                reflectiveQuadToRelative(-32f, 3f)
                lineToRelative(-111f, 88f)
                verticalLineToRelative(-84f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 322f)
                horizontalLineToRelative(-84f)
                lineTo(274f, 160f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 9f, -2.5f, 18f)
                reflectiveQuadToRelative(-7.5f, 18f)
                close()
                moveTo(280f, 640f)
                horizontalLineToRelative(246f)
                lineTo(240f, 354f)
                verticalLineToRelative(246f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 640f)
                close()
            }
        }.build()
        
        return _Hangout_video_off!!
    }

private var _Hangout_video_off: ImageVector? = null

