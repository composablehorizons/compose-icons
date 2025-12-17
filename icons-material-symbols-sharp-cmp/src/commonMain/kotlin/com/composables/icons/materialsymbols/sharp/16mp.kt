package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`16mp`: ImageVector
    get() {
        if (_16mp != null) return _16mp!!
        
        _16mp = ImageVector.Builder(
            name = "16mp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 460f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-140f)
                horizontalLineTo(540f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-60f)
                horizontalLineTo(480f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
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
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _16mp!!
    }

private var _16mp: ImageVector? = null

