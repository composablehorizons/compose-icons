package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`50mp`: ImageVector
    get() {
        if (_50mp != null) return _50mp!!
        
        _50mp = ImageVector.Builder(
            name = "50mp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 460f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-240f)
                horizontalLineTo(500f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(240f, 740f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(300f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-180f)
                horizontalLineTo(540f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
                moveToRelative(60f, 260f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-140f)
                horizontalLineTo(320f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-60f)
                horizontalLineTo(260f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(260f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _50mp!!
    }

private var _50mp: ImageVector? = null

