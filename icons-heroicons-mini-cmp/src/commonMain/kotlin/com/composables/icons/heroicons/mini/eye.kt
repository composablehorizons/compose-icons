package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 12.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.664f, 10.59f)
                arcToRelative(1.651f, 1.651f, 0f, false, true, 0f, -1.186f)
                arcTo(10.004f, 10.004f, 0f, false, true, 10f, 3f)
                curveToRelative(4.257f, 0f, 7.893f, 2.66f, 9.336f, 6.41f)
                curveToRelative(0.147f, 0.381f, 0.146f, 0.804f, 0f, 1.186f)
                arcTo(10.004f, 10.004f, 0f, false, true, 10f, 17f)
                curveToRelative(-4.257f, 0f, -7.893f, -2.66f, -9.336f, -6.41f)
                close()
                moveTo(14f, 10f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

