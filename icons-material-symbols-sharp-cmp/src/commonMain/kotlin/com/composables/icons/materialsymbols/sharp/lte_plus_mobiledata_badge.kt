package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Lte_plus_mobiledata_badge: ImageVector
    get() {
        if (_Lte_plus_mobiledata_badge != null) return _Lte_plus_mobiledata_badge!!
        
        _Lte_plus_mobiledata_badge = ImageVector.Builder(
            name = "lte_plus_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(800f, -440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(40f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(200f)
                close()
                moveTo(160f, 640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(220f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(560f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(250f, -80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(50f)
                close()
            }
        }.build()
        
        return _Lte_plus_mobiledata_badge!!
    }

private var _Lte_plus_mobiledata_badge: ImageVector? = null

