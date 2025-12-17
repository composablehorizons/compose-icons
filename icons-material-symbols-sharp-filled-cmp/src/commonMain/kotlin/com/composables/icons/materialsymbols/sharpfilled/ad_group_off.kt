package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ad_group_off: ImageVector
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
                moveTo(820f, 932f)
                lineTo(608f, 720f)
                horizontalLineTo(240f)
                verticalLineToRelative(-368f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(748f, -165f)
                lineTo(353f, 240f)
                horizontalLineToRelative(447f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(47f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(635f)
                verticalLineToRelative(635f)
                horizontalLineToRelative(-52f)
                close()
            }
        }.build()
        
        return _Ad_group_off!!
    }

private var _Ad_group_off: ImageVector? = null

