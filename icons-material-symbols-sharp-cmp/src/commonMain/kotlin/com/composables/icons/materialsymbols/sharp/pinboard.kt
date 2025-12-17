package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pinboard: ImageVector
    get() {
        if (_Pinboard != null) return _Pinboard!!
        
        _Pinboard = ImageVector.Builder(
            name = "pinboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 880f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                lineToRelative(60f, -106f)
                verticalLineToRelative(-94f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(94f)
                lineToRelative(60f, 106f)
                verticalLineToRelative(80f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                lineToRelative(-40f, 40f)
                close()
                moveToRelative(220f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-480f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(480f)
                close()
                moveTo(172f, 600f)
                horizontalLineToRelative(176f)
                lineToRelative(-48f, -84f)
                verticalLineToRelative(-116f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(116f)
                lineToRelative(-48f, 84f)
                close()
                moveToRelative(88f, 0f)
                close()
            }
        }.build()
        
        return _Pinboard!!
    }

private var _Pinboard: ImageVector? = null

