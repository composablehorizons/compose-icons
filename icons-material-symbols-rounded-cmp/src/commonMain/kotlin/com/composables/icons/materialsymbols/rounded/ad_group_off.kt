package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ad_group_off: ImageVector
    get() {
        if (_Ad_group_off != null) return _Ad_group_off!!
        
        _Ad_group_off = ImageVector.Builder(
            name = "ad_group_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 160f)
                verticalLineToRelative(515f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 715f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 675f)
                verticalLineToRelative(-435f)
                horizontalLineTo(386f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(330f, 217f)
                lineToRelative(-85f, -85f)
                quadToRelative(8f, -24f, 28.5f, -38f)
                reflectiveQuadToRelative(46.5f, -14f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                close()
                moveTo(320f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-288f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(608f, 720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(208f)
                lineTo(320f, 432f)
                verticalLineToRelative(208f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(265f, -343f)
                close()
                moveToRelative(135f, -114f)
                close()
            }
        }.build()
        
        return _Ad_group_off!!
    }

private var _Ad_group_off: ImageVector? = null

