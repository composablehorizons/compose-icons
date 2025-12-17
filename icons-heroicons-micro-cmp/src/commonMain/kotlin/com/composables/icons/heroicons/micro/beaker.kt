package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Beaker: ImageVector
    get() {
        if (_Beaker != null) return _Beaker!!
        
        _Beaker = ImageVector.Builder(
            name = "beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 3.5f)
                verticalLineToRelative(2.257f)
                curveToRelative(0f, 0.597f, 0.237f, 1.17f, 0.659f, 1.591f)
                lineToRelative(2.733f, 2.733f)
                curveToRelative(0.39f, 0.39f, 0.608f, 0.918f, 0.608f, 1.469f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, -1.702f, 2.024f)
                curveTo(11.573f, 13.854f, 9.803f, 14f, 8f, 14f)
                reflectiveCurveToRelative(-3.573f, -0.146f, -5.298f, -0.426f)
                arcTo(2.04f, 2.04f, 0f, false, true, 1f, 11.55f)
                curveToRelative(0f, -0.551f, 0.219f, -1.08f, 0.608f, -1.47f)
                lineToRelative(2.733f, -2.732f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5f, 5.758f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(11f)
                close()
                moveTo(6.5f, 5.757f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.257f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 1.098f, 2.652f)
                lineToRelative(0.158f, 0.158f)
                arcToRelative(3.36f, 3.36f, 0f, false, false, -0.075f, 0.034f)
                curveToRelative(-0.424f, 0.2f, -0.916f, 0.194f, -1.335f, -0.016f)
                lineToRelative(-1.19f, -0.595f)
                arcToRelative(4.943f, 4.943f, 0f, false, false, -2.07f, -0.52f)
                arcTo(3.75f, 3.75f, 0f, false, false, 6.5f, 5.757f)
                close()
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

