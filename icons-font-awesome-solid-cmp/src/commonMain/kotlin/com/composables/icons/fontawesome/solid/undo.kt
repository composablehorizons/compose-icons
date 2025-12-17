package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Undo: ImageVector
    get() {
        if (_Undo != null) return _Undo!!
        
        _Undo = ImageVector.Builder(
            name = "undo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(212.333f, 224.333f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineTo(12f)
                curveTo(0f, 5.373f, 5.373f, 0f, 12f, 0f)
                horizontalLineToRelative(48f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(78.112f)
                curveTo(117.773f, 39.279f, 184.26f, 7.47f, 258.175f, 8.007f)
                curveToRelative(136.906f, 0.994f, 246.448f, 111.623f, 246.157f, 248.532f)
                curveTo(504.041f, 393.258f, 393.12f, 504f, 256.333f, 504f)
                curveToRelative(-64.089f, 0f, -122.496f, -24.313f, -166.51f, -64.215f)
                curveToRelative(-5.099f, -4.622f, -5.334f, -12.554f, -0.467f, -17.42f)
                lineToRelative(33.967f, -33.967f)
                curveToRelative(4.474f, -4.474f, 11.662f, -4.717f, 16.401f, -0.525f)
                curveTo(170.76f, 415.336f, 211.58f, 432f, 256.333f, 432f)
                curveToRelative(97.268f, 0f, 176f, -78.716f, 176f, -176f)
                curveToRelative(0f, -97.267f, -78.716f, -176f, -176f, -176f)
                curveToRelative(-58.496f, 0f, -110.28f, 28.476f, -142.274f, 72.333f)
                horizontalLineToRelative(98.274f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
            }
        }.build()
        
        return _Undo!!
    }

private var _Undo: ImageVector? = null

