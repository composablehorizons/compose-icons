package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0f, false, true, 0f, -2.098f)
                close()
                moveToRelative(1.4f, 0.7f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, -0.7f, 0f)
                lineTo(1.134f, 7.65f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0f, 0.7f)
                lineToRelative(6.516f, 6.516f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0.7f, 0f)
                lineToRelative(6.516f, -6.516f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0f, -0.7f)
                lineTo(8.35f, 1.134f)
                close()
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

