package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.XDiamond: ImageVector
    get() {
        if (_XDiamond != null) return _XDiamond!!
        
        _XDiamond = ImageVector.Builder(
            name = "x-diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.987f, 16f)
                arcToRelative(1.53f, 1.53f, 0f, false, true, -1.07f, -0.448f)
                lineTo(0.45f, 9.082f)
                arcToRelative(1.53f, 1.53f, 0f, false, true, 0f, -2.165f)
                lineTo(6.917f, 0.45f)
                arcToRelative(1.53f, 1.53f, 0f, false, true, 2.166f, 0f)
                lineToRelative(6.469f, 6.468f)
                arcTo(1.53f, 1.53f, 0f, false, true, 16f, 8.013f)
                arcToRelative(1.53f, 1.53f, 0f, false, true, -0.448f, 1.07f)
                lineToRelative(-6.47f, 6.469f)
                arcTo(1.53f, 1.53f, 0f, false, true, 7.988f, 16f)
                close()
                moveTo(7.639f, 1.17f)
                lineTo(4.766f, 4.044f)
                lineTo(8f, 7.278f)
                lineToRelative(3.234f, -3.234f)
                lineTo(8.361f, 1.17f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, -0.722f, 0f)
                moveTo(8.722f, 8f)
                lineToRelative(3.234f, 3.234f)
                lineToRelative(2.873f, -2.873f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.523f, 0f, -0.722f)
                lineToRelative(-2.873f, -2.873f)
                close()
                moveTo(8f, 8.722f)
                lineToRelative(-3.234f, 3.234f)
                lineToRelative(2.873f, 2.873f)
                curveToRelative(0.2f, 0.2f, 0.523f, 0.2f, 0.722f, 0f)
                lineToRelative(2.873f, -2.873f)
                close()
                moveTo(7.278f, 8f)
                lineTo(4.044f, 4.766f)
                lineTo(1.17f, 7.639f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, 0f, 0.722f)
                lineToRelative(2.874f, 2.873f)
                close()
            }
        }.build()
        
        return _XDiamond!!
    }

private var _XDiamond: ImageVector? = null

