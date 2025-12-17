package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Brush: ImageVector
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
                moveTo(4.705f, 11.912f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.419f, -0.1f)
                curveToRelative(-0.246f, -0.013f, -0.573f, 0.05f, -0.879f, 0.479f)
                curveToRelative(-0.197f, 0.275f, -0.355f, 0.532f, -0.5f, 0.777f)
                lineToRelative(-0.105f, 0.177f)
                curveToRelative(-0.106f, 0.181f, -0.213f, 0.362f, -0.32f, 0.528f)
                arcToRelative(3.4f, 3.4f, 0f, false, true, -0.76f, 0.861f)
                curveToRelative(0.69f, 0.112f, 1.736f, 0.111f, 2.657f, -0.12f)
                curveToRelative(0.559f, -0.139f, 0.843f, -0.569f, 0.993f, -1.06f)
                arcToRelative(3f, 3f, 0f, false, false, 0.126f, -0.75f)
                close()
                moveToRelative(1.44f, 0.026f)
                curveToRelative(0.12f, -0.04f, 0.277f, -0.1f, 0.458f, -0.183f)
                arcToRelative(5.1f, 5.1f, 0f, false, false, 1.535f, -1.1f)
                curveToRelative(1.9f, -1.996f, 4.412f, -5.57f, 6.052f, -8.631f)
                curveToRelative(-2.59f, 1.927f, -5.566f, 4.66f, -7.302f, 6.792f)
                curveToRelative(-0.442f, 0.543f, -0.795f, 1.243f, -1.042f, 1.826f)
                curveToRelative(-0.121f, 0.288f, -0.214f, 0.54f, -0.275f, 0.72f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.575f, 0.575f)
                close()
                moveToRelative(-4.973f, 3.04f)
                lineToRelative(0.007f, -0.005f)
                close()
                moveToRelative(3.582f, -3.043f)
                lineToRelative(0.002f, 0.001f)
                horizontalLineToRelative(-0.002f)
                close()
            }
        }.build()
        
        return _Brush!!
    }

private var _Brush: ImageVector? = null

