package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CompressAlt: ImageVector
    get() {
        if (_CompressAlt != null) return _CompressAlt!!
        
        _CompressAlt = ImageVector.Builder(
            name = "compress-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.686f, 427.314f)
                lineTo(104f, 328f)
                lineToRelative(-32.922f, -31.029f)
                curveTo(55.958f, 281.851f, 66.666f, 256f, 88.048f, 256f)
                horizontalLineToRelative(112f)
                curveTo(213.303f, 256f, 224f, 266.745f, 224f, 280f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 21.382f, -25.803f, 32.09f, -40.922f, 16.971f)
                lineTo(152f, 376f)
                lineToRelative(-99.314f, 99.314f)
                curveToRelative(-6.248f, 6.248f, -16.379f, 6.248f, -22.627f, 0f)
                lineTo(4.686f, 449.941f)
                curveToRelative(-6.248f, -6.248f, -6.248f, -16.379f, 0f, -22.627f)
                close()
                moveTo(443.314f, 84.686f)
                lineTo(344f, 184f)
                lineToRelative(32.922f, 31.029f)
                curveToRelative(15.12f, 15.12f, 4.412f, 40.971f, -16.97f, 40.971f)
                horizontalLineToRelative(-112f)
                curveTo(234.697f, 256f, 224f, 245.255f, 224f, 232f)
                verticalLineTo(120f)
                curveToRelative(0f, -21.382f, 25.803f, -32.09f, 40.922f, -16.971f)
                lineTo(296f, 136f)
                lineToRelative(99.314f, -99.314f)
                curveToRelative(6.248f, -6.248f, 16.379f, -6.248f, 22.627f, 0f)
                lineToRelative(25.373f, 25.373f)
                curveToRelative(6.248f, 6.248f, 6.248f, 16.379f, 0f, 22.627f)
                close()
            }
        }.build()
        
        return _CompressAlt!!
    }

private var _CompressAlt: ImageVector? = null

