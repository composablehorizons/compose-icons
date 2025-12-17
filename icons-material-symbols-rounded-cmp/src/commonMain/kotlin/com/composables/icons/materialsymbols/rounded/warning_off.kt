package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Warning_off: ImageVector
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
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-40f, -160f)
                verticalLineToRelative(-121f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(41f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                close()
                moveToRelative(40f, -440f)
                quadToRelative(11f, 0f, 20.5f, 4.5f)
                reflectiveQuadTo(515f, 140f)
                lineToRelative(208f, 359f)
                quadToRelative(10f, 17f, 4f, 31f)
                reflectiveQuadToRelative(-19f, 22f)
                quadToRelative(-13f, 8f, -29f, 5f)
                reflectiveQuadToRelative(-27f, -21f)
                lineTo(480f, 240f)
                lineToRelative(-21f, 36f)
                quadToRelative(-10f, 17f, -25.5f, 19.5f)
                reflectiveQuadTo(405f, 290f)
                quadToRelative(-13f, -8f, -19f, -22.5f)
                reflectiveQuadToRelative(4f, -31.5f)
                lineToRelative(55f, -96f)
                quadToRelative(6f, -11f, 15f, -15.5f)
                reflectiveQuadToRelative(20f, -4.5f)
                close()
                moveTo(178f, 760f)
                horizontalLineToRelative(469f)
                lineTo(350f, 463f)
                lineTo(178f, 760f)
                close()
                moveTo(791f, 903f)
                lineToRelative(-64f, -63f)
                horizontalLineTo(109f)
                quadToRelative(-23f, 0f, -34f, -20f)
                reflectiveQuadToRelative(0f, -40f)
                lineToRelative(217f, -375f)
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
                moveTo(499f, 612f)
                close()
                moveToRelative(45f, -181f)
                close()
            }
        }.build()
        
        return _Warning_off!!
    }

private var _Warning_off: ImageVector? = null

