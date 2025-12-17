package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ev_mobiledata_badge: ImageVector
    get() {
        if (_Ev_mobiledata_badge != null) return _Ev_mobiledata_badge!!
        
        _Ev_mobiledata_badge = ImageVector.Builder(
            name = "ev_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(380f, 0f)
                horizontalLineToRelative(80f)
                lineToRelative(100f, -400f)
                horizontalLineToRelative(-80f)
                lineToRelative(-60f, 240f)
                lineToRelative(-60f, -240f)
                horizontalLineToRelative(-80f)
                lineToRelative(100f, 400f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(720f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Ev_mobiledata_badge!!
    }

private var _Ev_mobiledata_badge: ImageVector? = null

