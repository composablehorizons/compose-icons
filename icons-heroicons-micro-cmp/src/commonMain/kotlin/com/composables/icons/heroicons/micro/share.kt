package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, -1.994f, -1.842f)
                lineTo(5.323f, 6.5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 3f)
                lineToRelative(4.683f, 2.342f)
                arcToRelative(2f, 2f, 0f, true, false, 0.67f, -1.342f)
                lineTo(5.995f, 8.158f)
                arcToRelative(2.03f, 2.03f, 0f, false, false, 0f, -0.316f)
                lineTo(10.677f, 5.5f)
                curveToRelative(0.353f, 0.311f, 0.816f, 0.5f, 1.323f, 0.5f)
                close()
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

