package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.52f, 2f)
                curveToRelative(1.029f, 0f, 2.015f, 0.409f, 2.742f, 1.136f)
                lineToRelative(3.602f, 3.602f)
                arcToRelative(3.877f, 3.877f, 0f, false, true, 0f, 5.483f)
                lineToRelative(-2.643f, 2.643f)
                arcToRelative(3.88f, 3.88f, 0f, false, true, -4.941f, 0.452f)
                lineToRelative(-0.105f, -0.078f)
                lineToRelative(-5.882f, 5.883f)
                arcToRelative(3f, 3f, 0f, false, true, -1.68f, 0.843f)
                lineToRelative(-0.22f, 0.027f)
                lineToRelative(-0.221f, 0.009f)
                horizontalLineToRelative(-1.172f)
                curveToRelative(-1.014f, 0f, -1.867f, -0.759f, -1.991f, -1.823f)
                lineToRelative(-0.009f, -0.177f)
                verticalLineToRelative(-1.172f)
                curveToRelative(0f, -0.704f, 0.248f, -1.386f, 0.73f, -1.96f)
                lineToRelative(0.149f, -0.161f)
                lineToRelative(0.414f, -0.414f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, -0.293f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.206f, -0.608f)
                lineToRelative(0.087f, -0.1f)
                lineToRelative(1.468f, -1.469f)
                lineToRelative(-0.076f, -0.103f)
                arcToRelative(3.9f, 3.9f, 0f, false, true, -0.678f, -1.963f)
                lineToRelative(-0.007f, -0.236f)
                curveToRelative(0f, -1.029f, 0.409f, -2.015f, 1.136f, -2.742f)
                lineToRelative(2.643f, -2.643f)
                arcToRelative(3.88f, 3.88f, 0f, false, true, 2.741f, -1.136f)
                moveToRelative(0.495f, 5f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                horizontalLineToRelative(0.02f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

