package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Recycle: ImageVector
    get() {
        if (_Recycle != null) return _Recycle!!
        
        _Recycle = ImageVector.Builder(
            name = "recycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.302f, 1.256f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.604f, 0f)
                lineToRelative(-1.704f, 2.98f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.869f, 0.497f)
                lineToRelative(1.703f, -2.981f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.868f, 0f)
                lineToRelative(2.54f, 4.444f)
                lineToRelative(-1.256f, -0.337f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.26f, 0.966f)
                lineToRelative(2.415f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.613f, -0.353f)
                lineToRelative(0.647f, -2.415f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.966f, -0.259f)
                lineToRelative(-0.333f, 1.242f)
                close()
                moveTo(2.973f, 7.773f)
                lineToRelative(-1.255f, 0.337f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.26f, -0.966f)
                lineToRelative(2.416f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.612f, 0.353f)
                lineToRelative(0.647f, 2.415f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.966f, 0.259f)
                lineToRelative(-0.333f, -1.242f)
                lineToRelative(-2.545f, 4.454f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.434f, 0.748f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(1.723f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0.421f, 12.24f)
                close()
                moveToRelative(10.89f, 1.463f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.868f, 0.496f)
                lineToRelative(1.716f, 3.004f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.434f, 0.748f)
                horizontalLineToRelative(-5.57f)
                lineToRelative(0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, -0.707f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, -0.707f)
                lineToRelative(-0.647f, -0.647f)
                horizontalLineToRelative(5.57f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.302f, -2.244f)
                close()
            }
        }.build()
        
        return _Recycle!!
    }

private var _Recycle: ImageVector? = null

