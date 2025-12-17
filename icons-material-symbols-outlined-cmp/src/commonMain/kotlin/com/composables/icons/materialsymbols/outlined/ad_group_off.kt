package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ad_group_off: ImageVector
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
                moveTo(828f, 715f)
                lineToRelative(-75f, -75f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(-400f)
                horizontalLineTo(353f)
                lineTo(245f, 132f)
                quadToRelative(8f, -24f, 28.5f, -38f)
                reflectiveQuadToRelative(46.5f, -14f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 26f, -14f, 46.5f)
                reflectiveQuadTo(828f, 715f)
                close()
                moveToRelative(-8f, 217f)
                lineTo(608f, 720f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-288f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(320f, 640f)
                horizontalLineToRelative(208f)
                lineTo(320f, 432f)
                verticalLineToRelative(208f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(265f, -343f)
                close()
                moveToRelative(114f, -111f)
                close()
            }
        }.build()
        
        return _Ad_group_off!!
    }

private var _Ad_group_off: ImageVector? = null

