package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Users: ImageVector
    get() {
        if (_Users != null) return _Users!!
        
        _Users = ImageVector.Builder(
            name = "users",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                close()
                moveTo(10.9f, 12.006f)
                curveToRelative(0.11f, 0.542f, -0.348f, 0.994f, -0.9f, 0.994f)
                horizontalLineTo(2f)
                curveToRelative(-0.553f, 0f, -1.01f, -0.452f, -0.902f, -0.994f)
                arcToRelative(5.002f, 5.002f, 0f, false, true, 9.803f, 0f)
                close()
                moveTo(14.002f, 12f)
                horizontalLineToRelative(-1.59f)
                arcToRelative(2.556f, 2.556f, 0f, false, false, -0.04f, -0.29f)
                arcToRelative(6.476f, 6.476f, 0f, false, false, -1.167f, -2.603f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, 3.633f, 1.911f)
                curveToRelative(0.18f, 0.522f, -0.283f, 0.982f, -0.836f, 0.982f)
                close()
                moveTo(12f, 8f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                close()
            }
        }.build()
        
        return _Users!!
    }

private var _Users: ImageVector? = null

