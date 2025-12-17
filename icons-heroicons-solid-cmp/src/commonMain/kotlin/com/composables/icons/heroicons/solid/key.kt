package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Key: ImageVector
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
                moveTo(15.75f, 1.5f)
                arcToRelative(6.75f, 6.75f, 0f, false, false, -6.651f, 7.906f)
                curveToRelative(0.067f, 0.39f, -0.032f, 0.717f, -0.221f, 0.906f)
                lineToRelative(-6.5f, 6.499f)
                arcToRelative(3f, 3f, 0f, false, false, -0.878f, 2.121f)
                verticalLineToRelative(2.818f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9f, 19.5f)
                verticalLineTo(18f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.53f, -0.22f)
                lineToRelative(2.658f, -2.658f)
                curveToRelative(0.19f, -0.189f, 0.517f, -0.288f, 0.906f, -0.22f)
                arcTo(6.75f, 6.75f, 0f, true, false, 15.75f, 1.5f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, -3.75f, -3.75f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

