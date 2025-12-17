package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Watch_off: ImageVector
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
                moveTo(792f, 904f)
                lineTo(638f, 750f)
                lineTo(600f, 880f)
                horizontalLineTo(360f)
                lineToRelative(-54f, -181f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -124f)
                quadToRelative(0f, -36f, 9f, -69.5f)
                reflectiveQuadToRelative(26f, -63.5f)
                lineTo(56f, 168f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
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
                lineToRelative(38f, -127f)
                horizontalLineToRelative(240f)
                lineToRelative(54f, 181f)
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

