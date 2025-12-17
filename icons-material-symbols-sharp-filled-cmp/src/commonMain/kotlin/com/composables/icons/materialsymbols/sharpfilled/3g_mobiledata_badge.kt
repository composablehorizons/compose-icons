package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`3g_mobiledata_badge`: ImageVector
    get() {
        if (_3g_mobiledata_badge != null) return _3g_mobiledata_badge!!
        
        _3g_mobiledata_badge = ImageVector.Builder(
            name = "3g_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-240f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(-280f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                lineToRelative(-40f, -40f)
                lineToRelative(40f, -40f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(720f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _3g_mobiledata_badge!!
    }

private var _3g_mobiledata_badge: ImageVector? = null

