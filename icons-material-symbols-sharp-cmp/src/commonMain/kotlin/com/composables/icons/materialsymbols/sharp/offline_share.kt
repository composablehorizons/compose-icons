package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Offline_share: ImageVector
    get() {
        if (_Offline_share != null) return _Offline_share!!
        
        _Offline_share = ImageVector.Builder(
            name = "offline_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(40f, -80f)
                verticalLineToRelative(-130f)
                horizontalLineToRelative(126f)
                lineToRelative(-28f, -28f)
                lineToRelative(42f, -42f)
                lineToRelative(100f, 100f)
                lineToRelative(-100f, 100f)
                lineToRelative(-42f, -42f)
                lineToRelative(28f, -28f)
                horizontalLineToRelative(-66f)
                verticalLineToRelative(70f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-40f, -320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 480f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Offline_share!!
    }

private var _Offline_share: ImageVector? = null

