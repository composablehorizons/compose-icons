package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mountain: ImageVector
    get() {
        if (_Mountain != null) return _Mountain!!
        
        _Mountain = ImageVector.Builder(
            name = "mountain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(634.92f, 462.7f)
                lineToRelative(-288f, -448f)
                curveTo(341.03f, 5.54f, 330.89f, 0f, 320f, 0f)
                reflectiveCurveToRelative(-21.03f, 5.54f, -26.92f, 14.7f)
                lineToRelative(-288f, 448f)
                arcToRelative(32.001f, 32.001f, 0f, false, false, -1.17f, 32.64f)
                arcTo(32.004f, 32.004f, 0f, false, false, 32f, 512f)
                horizontalLineToRelative(576f)
                curveToRelative(11.71f, 0f, 22.48f, -6.39f, 28.09f, -16.67f)
                arcToRelative(31.983f, 31.983f, 0f, false, false, -1.17f, -32.63f)
                close()
                moveTo(320f, 91.18f)
                lineTo(405.39f, 224f)
                horizontalLineTo(320f)
                lineToRelative(-64f, 64f)
                lineToRelative(-38.06f, -38.06f)
                lineTo(320f, 91.18f)
                close()
            }
        }.build()
        
        return _Mountain!!
    }

private var _Mountain: ImageVector? = null

