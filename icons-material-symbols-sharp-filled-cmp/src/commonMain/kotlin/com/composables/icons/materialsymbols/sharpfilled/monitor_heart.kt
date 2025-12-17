package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Monitor_heart: ImageVector
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
                moveTo(80f, 440f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineTo(665f)
                lineToRelative(-78f, -156f)
                horizontalLineToRelative(-54f)
                lineTo(400f, 550f)
                lineToRelative(-55f, -110f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(215f)
                lineToRelative(78f, 156f)
                horizontalLineToRelative(54f)
                lineToRelative(133f, -266f)
                lineToRelative(55f, 110f)
                horizontalLineToRelative(265f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Monitor_heart!!
    }

private var _Monitor_heart: ImageVector? = null

