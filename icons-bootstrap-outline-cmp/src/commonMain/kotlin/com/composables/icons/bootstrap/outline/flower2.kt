package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Flower2: ImageVector
    get() {
        if (_Flower2 != null) return _Flower2!!
        
        _Flower2 = ImageVector.Builder(
            name = "flower2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                moveToRelative(3f, -12f)
                quadToRelative(0f, 0.11f, -0.03f, 0.247f)
                curveToRelative(-0.544f, 0.241f, -1.091f, 0.638f, -1.598f, 1.084f)
                arcTo(3f, 3f, 0f, false, false, 8f, 5f)
                curveToRelative(-0.494f, 0f, -0.96f, 0.12f, -1.372f, 0.331f)
                curveToRelative(-0.507f, -0.446f, -1.054f, -0.843f, -1.597f, -1.084f)
                arcTo(1f, 1f, 0f, false, true, 5f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveToRelative(-0.812f, 6.052f)
                arcTo(3f, 3f, 0f, false, false, 11f, 8f)
                arcToRelative(3f, 3f, 0f, false, false, -0.812f, -2.052f)
                curveToRelative(0.215f, -0.18f, 0.432f, -0.346f, 0.647f, -0.487f)
                curveTo(11.34f, 5.131f, 11.732f, 5f, 12f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                curveToRelative(-0.268f, 0f, -0.66f, -0.13f, -1.165f, -0.461f)
                arcToRelative(7f, 7f, 0f, false, true, -0.647f, -0.487f)
                moveToRelative(-3.56f, 0.617f)
                arcToRelative(3f, 3f, 0f, false, false, 2.744f, 0f)
                curveToRelative(0.507f, 0.446f, 1.054f, 0.842f, 1.598f, 1.084f)
                quadToRelative(0.03f, 0.137f, 0.03f, 0.247f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                quadToRelative(0f, -0.11f, 0.03f, -0.247f)
                curveToRelative(0.544f, -0.242f, 1.091f, -0.638f, 1.598f, -1.084f)
                moveToRelative(-0.816f, -4.721f)
                arcTo(3f, 3f, 0f, false, false, 5f, 8f)
                curveToRelative(0f, 0.794f, 0.308f, 1.516f, 0.812f, 2.052f)
                arcToRelative(7f, 7f, 0f, false, true, -0.647f, 0.487f)
                curveTo(4.66f, 10.869f, 4.268f, 11f, 4f, 11f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                curveToRelative(0.268f, 0f, 0.66f, 0.13f, 1.165f, 0.461f)
                curveToRelative(0.215f, 0.141f, 0.432f, 0.306f, 0.647f, 0.487f)
                moveTo(8f, 9f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
        }.build()
        
        return _Flower2!!
    }

private var _Flower2: ImageVector? = null

