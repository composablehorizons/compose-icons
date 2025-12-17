package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sip: ImageVector
    get() {
        if (_Sip != null) return _Sip!!
        
        _Sip = ImageVector.Builder(
            name = "sip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-160f)
                horizontalLineTo(560f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-360f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-150f)
                horizontalLineTo(260f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-60f)
                horizontalLineTo(200f)
                verticalLineToRelative(150f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(30f)
                horizontalLineTo(200f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(420f, -140f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Sip!!
    }

private var _Sip: ImageVector? = null

