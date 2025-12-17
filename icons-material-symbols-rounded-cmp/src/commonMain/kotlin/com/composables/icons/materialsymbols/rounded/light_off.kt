package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Light_off: ImageVector
    get() {
        if (_Light_off != null) return _Light_off!!
        
        _Light_off = ImageVector.Builder(
            name = "light_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -720f)
                quadToRelative(-44f, 0f, -81.5f, 15.5f)
                reflectiveQuadTo(332f, 218f)
                lineToRelative(-58f, -56f)
                quadToRelative(41f, -38f, 93.5f, -60f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(125f, 0f, 212.5f, 87.5f)
                reflectiveQuadTo(780f, 380f)
                quadToRelative(0f, 71f, -25f, 121.5f)
                reflectiveQuadTo(698f, 584f)
                lineToRelative(-56f, -56f)
                quadToRelative(21f, -23f, 39.5f, -59f)
                reflectiveQuadToRelative(18.5f, -89f)
                quadToRelative(0f, -92f, -64f, -156f)
                reflectiveQuadToRelative(-156f, -64f)
                close()
                moveToRelative(46f, 480f)
                horizontalLineTo(330f)
                quadToRelative(-69f, -41f, -109.5f, -110f)
                reflectiveQuadTo(180f, 380f)
                quadToRelative(0f, -20f, 2.5f, -39f)
                reflectiveQuadToRelative(7.5f, -37f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineTo(526f, 640f)
                close()
                moveToRelative(-172f, -80f)
                horizontalLineToRelative(92f)
                lineTo(260f, 374f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 54f, 24.5f, 101f)
                reflectiveQuadToRelative(69.5f, 79f)
                close()
                moveToRelative(-6f, -98f)
                close()
                moveToRelative(134f, -94f)
                close()
                moveTo(360f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 680f)
                horizontalLineToRelative(246f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(646f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(606f, 760f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Light_off!!
    }

private var _Light_off: ImageVector? = null

