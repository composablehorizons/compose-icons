package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hangout_video_off: ImageVector
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
                moveTo(436f, 322f)
                horizontalLineToRelative(84f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 362f)
                verticalLineToRelative(84f)
                lineTo(436f, 322f)
                close()
                moveToRelative(124f, 124f)
                lineToRelative(111f, -88f)
                quadToRelative(15f, -11f, 32f, -3f)
                reflectiveQuadToRelative(17f, 27f)
                verticalLineToRelative(224f)
                lineTo(560f, 446f)
                close()
                moveToRelative(310f, 310f)
                quadToRelative(5f, -9f, 7.5f, -18f)
                reflectiveQuadToRelative(2.5f, -18f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(800f, 160f)
                horizontalLineTo(274f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(446f)
                verticalLineToRelative(446f)
                lineToRelative(70f, 70f)
                close()
                moveTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 600f)
                verticalLineToRelative(-246f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                close()
                moveToRelative(418f, 304f)
                close()
                moveToRelative(-194f, 34f)
                close()
            }
        }.build()
        
        return _Hangout_video_off!!
    }

private var _Hangout_video_off: ImageVector? = null

