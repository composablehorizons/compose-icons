package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Brush: ImageVector
    get() {
        if (_Brush != null) return _Brush!!
        
        _Brush = ImageVector.Builder(
            name = "brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.825f, 0.12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.132f, 0.584f)
                curveToRelative(-1.53f, 3.43f, -4.743f, 8.17f, -7.095f, 10.64f)
                arcToRelative(6.1f, 6.1f, 0f, false, true, -2.373f, 1.534f)
                curveToRelative(-0.018f, 0.227f, -0.06f, 0.538f, -0.16f, 0.868f)
                curveToRelative(-0.201f, 0.659f, -0.667f, 1.479f, -1.708f, 1.74f)
                arcToRelative(8.1f, 8.1f, 0f, false, true, -3.078f, 0.132f)
                arcToRelative(4f, 4f, 0f, false, true, -0.562f, -0.135f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.466f, -0.247f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.204f, -0.288f)
                arcToRelative(0.62f, 0.62f, 0f, false, true, 0.004f, -0.443f)
                curveToRelative(0.095f, -0.245f, 0.316f, -0.38f, 0.461f, -0.452f)
                curveToRelative(0.394f, -0.197f, 0.625f, -0.453f, 0.867f, -0.826f)
                curveToRelative(0.095f, -0.144f, 0.184f, -0.297f, 0.287f, -0.472f)
                lineToRelative(0.117f, -0.198f)
                curveToRelative(0.151f, -0.255f, 0.326f, -0.54f, 0.546f, -0.848f)
                curveToRelative(0.528f, -0.739f, 1.201f, -0.925f, 1.746f, -0.896f)
                quadToRelative(0.19f, 0.012f, 0.348f, 0.048f)
                curveToRelative(0.062f, -0.172f, 0.142f, -0.38f, 0.238f, -0.608f)
                curveToRelative(0.261f, -0.619f, 0.658f, -1.419f, 1.187f, -2.069f)
                curveToRelative(2.176f, -2.67f, 6.18f, -6.206f, 9.117f, -8.104f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.596f, 0.04f)
            }
        }.build()
        
        return _Brush!!
    }

private var _Brush: ImageVector? = null

