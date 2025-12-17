package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Monitor_heart: ImageVector
    get() {
        if (_Monitor_heart != null) return _Monitor_heart!!
        
        _Monitor_heart = ImageVector.Builder(
            name = "monitor_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(215f, -280f)
                lineToRelative(78f, 156f)
                horizontalLineToRelative(54f)
                lineToRelative(133f, -266f)
                lineToRelative(55f, 110f)
                horizontalLineToRelative(265f)
                verticalLineToRelative(-80f)
                horizontalLineTo(665f)
                lineToRelative(-78f, -156f)
                horizontalLineToRelative(-54f)
                lineTo(400f, 550f)
                lineToRelative(-55f, -110f)
                horizontalLineTo(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(215f)
                close()
                moveToRelative(185f, -40f)
                close()
            }
        }.build()
        
        return _Monitor_heart!!
    }

private var _Monitor_heart: ImageVector? = null

