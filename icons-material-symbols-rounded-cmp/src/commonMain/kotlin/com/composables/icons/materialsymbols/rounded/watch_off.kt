package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Watch_off: ImageVector
    get() {
        if (_Watch_off != null) return _Watch_off!!
        
        _Watch_off = ImageVector.Builder(
            name = "watch_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 875f)
                lineTo(638f, 750f)
                lineToRelative(-25f, 87f)
                quadToRelative(-6f, 20f, -22f, 31.5f)
                reflectiveQuadTo(555f, 880f)
                horizontalLineTo(405f)
                quadToRelative(-20f, 0f, -36f, -11.5f)
                reflectiveQuadTo(347f, 837f)
                lineToRelative(-41f, -138f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -124f)
                quadToRelative(0f, -36f, 9f, -69.5f)
                reflectiveQuadToRelative(26f, -63.5f)
                lineTo(84f, 196f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(84f, 139f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(764f, 875f)
                close()
                moveTo(480f, 680f)
                quadToRelative(20f, 0f, 38f, -3.5f)
                reflectiveQuadToRelative(35f, -10.5f)
                lineTo(294f, 407f)
                quadToRelative(-7f, 17f, -10.5f, 35f)
                reflectiveQuadToRelative(-3.5f, 38f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(247f, -68f)
                lineToRelative(-60f, -60f)
                quadToRelative(7f, -17f, 10f, -34.5f)
                reflectiveQuadToRelative(3f, -37.5f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -37.5f, 3f)
                reflectiveQuadTo(408f, 293f)
                lineToRelative(-86f, -86f)
                lineToRelative(25f, -84f)
                quadToRelative(6f, -19f, 22f, -31f)
                reflectiveQuadToRelative(36f, -12f)
                horizontalLineToRelative(150f)
                quadToRelative(20f, 0f, 36f, 11.5f)
                reflectiveQuadToRelative(22f, 31.5f)
                lineToRelative(41f, 138f)
                quadToRelative(48f, 38f, 77f, 95f)
                reflectiveQuadToRelative(29f, 124f)
                quadToRelative(0f, 36f, -8f, 69f)
                reflectiveQuadToRelative(-25f, 63f)
                close()
                moveTo(420f, 800f)
                horizontalLineToRelative(120f)
                lineToRelative(16f, -51f)
                quadToRelative(-15f, 5f, -36.5f, 7.5f)
                reflectiveQuadTo(480f, 759f)
                quadToRelative(-18f, 0f, -39.5f, -2.5f)
                reflectiveQuadTo(404f, 749f)
                lineToRelative(16f, 51f)
                close()
                moveToRelative(-16f, -589f)
                quadToRelative(15f, -5f, 37f, -8f)
                reflectiveQuadToRelative(39f, -3f)
                quadToRelative(18f, 0f, 39.5f, 3f)
                reflectiveQuadToRelative(36.5f, 8f)
                lineToRelative(-16f, -51f)
                horizontalLineTo(420f)
                lineToRelative(-16f, 51f)
                close()
                moveToRelative(16f, 589f)
                horizontalLineToRelative(-16f)
                horizontalLineToRelative(152f)
                horizontalLineToRelative(-136f)
                close()
                moveToRelative(-16f, -640f)
                horizontalLineToRelative(152f)
                horizontalLineToRelative(-152f)
                close()
            }
        }.build()
        
        return _Watch_off!!
    }

private var _Watch_off: ImageVector? = null

