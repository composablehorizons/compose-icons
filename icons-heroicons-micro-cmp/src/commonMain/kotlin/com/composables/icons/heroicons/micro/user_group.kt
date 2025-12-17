package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.UserGroup: ImageVector
    get() {
        if (_UserGroup != null) return _UserGroup!!
        
        _UserGroup = ImageVector.Builder(
            name = "user-group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                close()
                moveTo(3.156f, 11.763f)
                curveToRelative(0.16f, -0.629f, 0.44f, -1.21f, 0.813f, -1.72f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.725f, 1.377f)
                curveToRelative(-0.136f, 0.287f, 0.102f, 0.58f, 0.418f, 0.58f)
                horizontalLineToRelative(1.449f)
                curveToRelative(0.01f, -0.077f, 0.025f, -0.156f, 0.045f, -0.237f)
                close()
                moveTo(12.847f, 11.763f)
                curveToRelative(0.02f, 0.08f, 0.036f, 0.16f, 0.046f, 0.237f)
                horizontalLineToRelative(1.446f)
                curveToRelative(0.316f, 0f, 0.554f, -0.293f, 0.417f, -0.579f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.722f, -1.378f)
                curveToRelative(0.374f, 0.51f, 0.653f, 1.09f, 0.813f, 1.72f)
                close()
                moveTo(14f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                close()
                moveTo(3.5f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                close()
                moveTo(5f, 13f)
                curveToRelative(-0.552f, 0f, -1.013f, -0.455f, -0.876f, -0.99f)
                arcToRelative(4.002f, 4.002f, 0f, false, true, 7.753f, 0f)
                curveToRelative(0.136f, 0.535f, -0.324f, 0.99f, -0.877f, 0.99f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _UserGroup!!
    }

private var _UserGroup: ImageVector? = null

