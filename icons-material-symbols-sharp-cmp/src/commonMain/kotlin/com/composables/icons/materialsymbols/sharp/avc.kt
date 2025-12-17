package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Avc: ImageVector
    get() {
        if (_Avc != null) return _Avc!!
        
        _Avc = ImageVector.Builder(
            name = "avc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(180f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(210f, 120f)
                horizontalLineToRelative(60f)
                lineToRelative(70f, -240f)
                horizontalLineToRelative(-60f)
                lineToRelative(-40f, 137f)
                lineToRelative(-40f, -137f)
                horizontalLineToRelative(-60f)
                lineToRelative(70f, 240f)
                close()
                moveToRelative(150f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(240f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(640f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-480f)
                horizontalLineTo(120f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Avc!!
    }

private var _Avc: ImageVector? = null

