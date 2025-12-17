package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hls_off: ImageVector
    get() {
        if (_Hls_off != null) return _Hls_off!!
        
        _Hls_off = ImageVector.Builder(
            name = "hls_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(713f, 600f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(660f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(620f, 460f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(820f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(820f, 500f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(780f, 600f)
                horizontalLineToRelative(-67f)
                close()
                moveToRelative(-593f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(791f, 904f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(400f, 600f)
                verticalLineToRelative(-143f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(23f)
                horizontalLineToRelative(24f)
                lineToRelative(60f, 60f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Hls_off!!
    }

private var _Hls_off: ImageVector? = null

