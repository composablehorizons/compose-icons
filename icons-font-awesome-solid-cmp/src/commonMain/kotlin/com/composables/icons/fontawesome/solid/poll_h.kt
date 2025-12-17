package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PollH: ImageVector
    get() {
        if (_PollH != null) return _PollH!!
        
        _PollH = ImageVector.Builder(
            name = "poll-h",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 432f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                close()
                moveTo(112f, 192f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(128f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineTo(112f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineTo(112f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-64f)
                close()
            }
        }.build()
        
        return _PollH!!
    }

private var _PollH: ImageVector? = null

