package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HeadphonesAlt: ImageVector
    get() {
        if (_HeadphonesAlt != null) return _HeadphonesAlt!!
        
        _HeadphonesAlt = ImageVector.Builder(
            name = "headphones-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 288f)
                horizontalLineToRelative(-16f)
                curveToRelative(-35.35f, 0f, -64f, 28.7f, -64f, 64.12f)
                verticalLineToRelative(63.76f)
                curveToRelative(0f, 35.41f, 28.65f, 64.12f, 64f, 64.12f)
                horizontalLineToRelative(16f)
                curveToRelative(17.67f, 0f, 32f, -14.36f, 32f, -32.06f)
                verticalLineTo(320.06f)
                curveToRelative(0f, -17.71f, -14.33f, -32.06f, -32f, -32.06f)
                close()
                moveToRelative(208f, 0f)
                horizontalLineToRelative(-16f)
                curveToRelative(-17.67f, 0f, -32f, 14.35f, -32f, 32.06f)
                verticalLineToRelative(127.88f)
                curveToRelative(0f, 17.7f, 14.33f, 32.06f, 32f, 32.06f)
                horizontalLineToRelative(16f)
                curveToRelative(35.35f, 0f, 64f, -28.71f, 64f, -64.12f)
                verticalLineToRelative(-63.76f)
                curveToRelative(0f, -35.41f, -28.65f, -64.12f, -64f, -64.12f)
                close()
                moveTo(256f, 32f)
                curveTo(112.91f, 32f, 4.57f, 151.13f, 0f, 288f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(288f)
                curveToRelative(0f, -114.67f, 93.33f, -207.8f, 208f, -207.82f)
                curveToRelative(114.67f, 0.02f, 208f, 93.15f, 208f, 207.82f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(288f)
                curveTo(507.43f, 151.13f, 399.09f, 32f, 256f, 32f)
                close()
            }
        }.build()
        
        return _HeadphonesAlt!!
    }

private var _HeadphonesAlt: ImageVector? = null

