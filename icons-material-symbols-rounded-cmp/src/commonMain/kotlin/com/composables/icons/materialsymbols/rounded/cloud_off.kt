package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cloud_off: ImageVector
    get() {
        if (_Cloud_off != null) return _Cloud_off!!
        
        _Cloud_off = ImageVector.Builder(
            name = "cloud_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadTo(40f, 580f)
                quadToRelative(0f, -77f, 47.5f, -137f)
                reflectiveQuadTo(210f, 366f)
                quadToRelative(3f, -8f, 6f, -15.5f)
                reflectiveQuadToRelative(6f, -16.5f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(764f, 877f)
                lineToRelative(-78f, -77f)
                horizontalLineTo(260f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(346f)
                lineTo(284f, 398f)
                quadToRelative(-2f, 11f, -3f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                horizontalLineToRelative(-20f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(185f, -161f)
                close()
                moveToRelative(419f, 191f)
                lineToRelative(-58f, -56f)
                quadToRelative(17f, -14f, 25.5f, -32.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-27f, 0f, -52f, 6.5f)
                reflectiveQuadTo(380f, 267f)
                lineToRelative(-58f, -58f)
                quadToRelative(35f, -24f, 74.5f, -36.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(69f, 8f, 114.5f, 59.5f)
                reflectiveQuadTo(920f, 620f)
                quadToRelative(0f, 39f, -15f, 72.5f)
                reflectiveQuadTo(864f, 750f)
                close()
                moveTo(593f, 481f)
                close()
            }
        }.build()
        
        return _Cloud_off!!
    }

private var _Cloud_off: ImageVector? = null

