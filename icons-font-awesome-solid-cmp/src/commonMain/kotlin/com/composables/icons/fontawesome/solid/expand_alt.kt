package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ExpandAlt: ImageVector
    get() {
        if (_ExpandAlt != null) return _ExpandAlt!!
        
        _ExpandAlt = ImageVector.Builder(
            name = "expand-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(212.686f, 315.314f)
                lineTo(120f, 408f)
                lineToRelative(32.922f, 31.029f)
                curveToRelative(15.12f, 15.12f, 4.412f, 40.971f, -16.97f, 40.971f)
                horizontalLineToRelative(-112f)
                curveTo(10.697f, 480f, 0f, 469.255f, 0f, 456f)
                verticalLineTo(344f)
                curveToRelative(0f, -21.382f, 25.803f, -32.09f, 40.922f, -16.971f)
                lineTo(72f, 360f)
                lineToRelative(92.686f, -92.686f)
                curveToRelative(6.248f, -6.248f, 16.379f, -6.248f, 22.627f, 0f)
                lineToRelative(25.373f, 25.373f)
                curveToRelative(6.249f, 6.248f, 6.249f, 16.378f, 0f, 22.627f)
                close()
                moveToRelative(22.628f, -118.628f)
                lineTo(328f, 104f)
                lineToRelative(-32.922f, -31.029f)
                curveTo(279.958f, 57.851f, 290.666f, 32f, 312.048f, 32f)
                horizontalLineToRelative(112f)
                curveTo(437.303f, 32f, 448f, 42.745f, 448f, 56f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 21.382f, -25.803f, 32.09f, -40.922f, 16.971f)
                lineTo(376f, 152f)
                lineToRelative(-92.686f, 92.686f)
                curveToRelative(-6.248f, 6.248f, -16.379f, 6.248f, -22.627f, 0f)
                lineToRelative(-25.373f, -25.373f)
                curveToRelative(-6.249f, -6.248f, -6.249f, -16.378f, 0f, -22.627f)
                close()
            }
        }.build()
        
        return _ExpandAlt!!
    }

private var _ExpandAlt: ImageVector? = null

