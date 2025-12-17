package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ambient_screen: ImageVector
    get() {
        if (_Ambient_screen != null) return _Ambient_screen!!
        
        _Ambient_screen = ImageVector.Builder(
            name = "ambient_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(321f)
                horizontalLineToRelative(-80f)
                verticalLineTo(336f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(401f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(700f, 40f)
                lineToRelative(-44f, -96f)
                lineToRelative(-96f, -44f)
                lineToRelative(96f, -44f)
                lineToRelative(44f, -96f)
                lineToRelative(44f, 96f)
                lineToRelative(96f, 44f)
                lineToRelative(-96f, 44f)
                lineToRelative(-44f, 96f)
                close()
                moveTo(160f, 816f)
                verticalLineTo(336f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-20f)
                verticalLineToRelative(20f)
                close()
                moveToRelative(320f, -80f)
                lineToRelative(50f, -110f)
                lineToRelative(110f, -50f)
                lineToRelative(-110f, -50f)
                lineToRelative(-50f, -110f)
                lineToRelative(-50f, 110f)
                lineToRelative(-110f, 50f)
                lineToRelative(110f, 50f)
                lineToRelative(50f, 110f)
                close()
            }
        }.build()
        
        return _Ambient_screen!!
    }

private var _Ambient_screen: ImageVector? = null

