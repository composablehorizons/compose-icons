package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Steps: ImageVector
    get() {
        if (_Steps != null) return _Steps!!
        
        _Steps = ImageVector.Builder(
            name = "steps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(736f, 800f)
                horizontalLineToRelative(53f)
                lineToRelative(11f, -63f)
                lineToRelative(-195f, -195f)
                lineToRelative(-71f, -214f)
                lineToRelative(-133f, 30f)
                lineToRelative(-41f, -39f)
                verticalLineToRelative(-134f)
                lineToRelative(-28f, -14f)
                lineToRelative(-156f, 209f)
                horizontalLineToRelative(120f)
                lineToRelative(440f, 420f)
                close()
                moveToRelative(-201f, 0f)
                horizontalLineToRelative(85f)
                lineTo(264f, 460f)
                horizontalLineTo(162f)
                lineToRelative(373f, 340f)
                close()
                moveToRelative(-30f, 80f)
                lineTo(27f, 446f)
                lineToRelative(281f, -377f)
                lineToRelative(132f, 66f)
                verticalLineToRelative(134f)
                lineToRelative(147f, -38f)
                lineToRelative(88f, 267f)
                lineToRelative(205f, 205f)
                lineToRelative(-30f, 177f)
                horizontalLineTo(505f)
                close()
            }
        }.build()
        
        return _Steps!!
    }

private var _Steps: ImageVector? = null

