package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Warning_off: ImageVector
    get() {
        if (_Warning_off != null) return _Warning_off!!
        
        _Warning_off = ImageVector.Builder(
            name = "warning_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-40f, -160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                verticalLineToRelative(-41f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(121f)
                close()
                moveToRelative(-43f, -276f)
                quadToRelative(-10f, -10f, -12f, -23.5f)
                reflectiveQuadToRelative(5f, -25.5f)
                lineToRelative(55f, -95f)
                quadToRelative(6f, -11f, 15f, -15.5f)
                reflectiveQuadToRelative(20f, -4.5f)
                quadToRelative(11f, 0f, 20.5f, 4.5f)
                reflectiveQuadTo(515f, 140f)
                lineToRelative(284f, 490f)
                quadToRelative(9f, 15f, -5f, 26f)
                reflectiveQuadToRelative(-27f, -2f)
                lineTo(397f, 284f)
                close()
                moveTo(791f, 903f)
                lineToRelative(-64f, -63f)
                horizontalLineTo(109f)
                quadToRelative(-23f, 0f, -34f, -20f)
                reflectiveQuadToRelative(0f, -40f)
                lineToRelative(259f, -447f)
                lineToRelative(279f, 278f)
                horizontalLineTo(499f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(56f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
            }
        }.build()
        
        return _Warning_off!!
    }

private var _Warning_off: ImageVector? = null

