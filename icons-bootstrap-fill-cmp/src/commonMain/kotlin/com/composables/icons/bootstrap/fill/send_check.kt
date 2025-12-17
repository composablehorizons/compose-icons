package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SendCheck: ImageVector
    get() {
        if (_SendCheck != null) return _SendCheck!!
        
        _SendCheck = ImageVector.Builder(
            name = "send-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.964f, 0.686f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.65f, -0.65f)
                lineTo(0.767f, 5.855f)
                horizontalLineTo(0.766f)
                lineToRelative(-0.452f, 0.18f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.082f, 0.887f)
                lineToRelative(0.41f, 0.26f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(4.995f, 3.178f)
                lineToRelative(1.59f, 2.498f)
                curveTo(8f, 14f, 8f, 13f, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 5.026f, -4.47f)
                close()
                moveToRelative(-1.833f, 1.89f)
                lineTo(6.637f, 10.07f)
                lineToRelative(-0.215f, -0.338f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.154f, -0.154f)
                lineToRelative(-0.338f, -0.215f)
                lineToRelative(7.494f, -7.494f)
                lineToRelative(1.178f, -0.471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-1.993f, -1.679f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.686f, 0.172f)
                lineToRelative(-1.17f, 1.95f)
                lineToRelative(-0.547f, -0.547f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineToRelative(0.774f, 0.773f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.174f, -0.144f)
                lineToRelative(1.335f, -2.226f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.172f, -0.686f)
            }
        }.build()
        
        return _SendCheck!!
    }

private var _SendCheck: ImageVector? = null

