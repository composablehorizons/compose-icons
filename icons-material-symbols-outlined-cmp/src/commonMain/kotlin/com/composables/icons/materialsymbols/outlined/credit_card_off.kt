package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Credit_card_off: ImageVector
    get() {
        if (_Credit_card_off != null) return _Credit_card_off!!
        
        _Credit_card_off = ImageVector.Builder(
            name = "credit_card_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(871f, 757f)
                lineToRelative(-71f, -71f)
                verticalLineToRelative(-206f)
                horizontalLineTo(594f)
                lineTo(434f, 320f)
                horizontalLineToRelative(366f)
                verticalLineToRelative(-80f)
                horizontalLineTo(354f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
                moveTo(385f, 498f)
                close()
                moveToRelative(192f, -35f)
                close()
                moveToRelative(-211f, 17f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(446f)
                lineTo(366f, 480f)
                close()
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(46f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Credit_card_off!!
    }

private var _Credit_card_off: ImageVector? = null

