package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Headset: ImageVector
    get() {
        if (_Headset != null) return _Headset!!
        
        _Headset = ImageVector.Builder(
            name = "headset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.4f, 1.02f)
                curveTo(6.62f, 1.33f, 3f, 5.52f, 3f, 10.31f)
                verticalLineTo(17f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-1.71f)
                curveTo(5f, 6.45f, 7.96f, 3.11f, 11.79f, 3f)
                curveTo(15.76f, 2.89f, 19f, 6.06f, 19f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -5.17f, -4.36f, -9.32f, -9.6f, -8.98f)
                close()
            }
        }.build()
        
        return _Headset!!
    }

private var _Headset: ImageVector? = null

