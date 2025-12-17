package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Text_rotation_angledown: ImageVector
    get() {
        if (_Text_rotation_angledown != null) return _Text_rotation_angledown!!
        
        _Text_rotation_angledown = ImageVector.Builder(
            name = "text_rotation_angledown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(64f)
                lineTo(92f, 388f)
                lineToRelative(56f, -56f)
                lineToRelative(372f, 372f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(400f)
                close()
                moveToRelative(204f, -222f)
                lineToRelative(-54f, -54f)
                lineToRelative(52f, -106f)
                lineToRelative(-126f, -126f)
                lineToRelative(-106f, 50f)
                lineToRelative(-54f, -54f)
                lineToRelative(428f, -194f)
                lineToRelative(56f, 56f)
                lineToRelative(-196f, 428f)
                close()
                moveToRelative(-66f, -316f)
                lineToRelative(92f, 94f)
                lineToRelative(84f, -174f)
                lineToRelative(-2f, -2f)
                lineToRelative(-174f, 82f)
                close()
            }
        }.build()
        
        return _Text_rotation_angledown!!
    }

private var _Text_rotation_angledown: ImageVector? = null

