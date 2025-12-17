package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Whatshot: ImageVector
    get() {
        if (_Whatshot != null) return _Whatshot!!
        
        _Whatshot = ImageVector.Builder(
            name = "whatshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 0.67f)
                reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f)
                curveToRelative(0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f)
                curveToRelative(-2.07f, 0f, -3.63f, -1.67f, -3.63f, -3.73f)
                lineToRelative(0.03f, -0.36f)
                curveTo(5.21f, 7.51f, 4f, 10.62f, 4f, 14f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                curveTo(20f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f)
                close()
                moveTo(11.71f, 19f)
                curveToRelative(-1.78f, 0f, -3.22f, -1.4f, -3.22f, -3.14f)
                curveToRelative(0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f)
                curveToRelative(1.77f, -0.36f, 3.6f, -1.21f, 4.62f, -2.58f)
                curveToRelative(0.39f, 1.29f, 0.59f, 2.65f, 0.59f, 4.04f)
                curveToRelative(0f, 2.65f, -2.15f, 4.8f, -4.8f, 4.8f)
                close()
            }
        }.build()
        
        return _Whatshot!!
    }

private var _Whatshot: ImageVector? = null

