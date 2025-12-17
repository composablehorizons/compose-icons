package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ad_group_off: ImageVector
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
                verticalLineToRelative(-52f)
                horizontalLineToRelative(635f)
                verticalLineToRelative(635f)
                horizontalLineToRelative(-52f)
                close()
                moveToRelative(-8f, 217f)
                lineTo(608f, 720f)
                horizontalLineTo(240f)
                verticalLineToRelative(-368f)
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
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(345f, -343f)
                close()
                moveToRelative(114f, -111f)
                close()
            }
        }.build()
        
        return _Ad_group_off!!
    }

private var _Ad_group_off: ImageVector? = null

