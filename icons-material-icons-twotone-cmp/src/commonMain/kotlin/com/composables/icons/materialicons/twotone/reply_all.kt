package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Reply_all: ImageVector
    get() {
        if (_Reply_all != null) return _Reply_all!!
        
        _Reply_all = ImageVector.Builder(
            name = "reply_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 8f)
                verticalLineTo(5f)
                lineToRelative(-7f, 7f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(-3f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
                close()
                moveToRelative(6f, 1f)
                verticalLineTo(5f)
                lineToRelative(-7f, 7f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(-4.1f)
                curveToRelative(5f, 0f, 8.5f, 1.6f, 11f, 5.1f)
                curveToRelative(-1f, -5f, -4f, -10f, -11f, -11f)
                close()
            }
        }.build()
        
        return _Reply_all!!
    }

private var _Reply_all: ImageVector? = null

