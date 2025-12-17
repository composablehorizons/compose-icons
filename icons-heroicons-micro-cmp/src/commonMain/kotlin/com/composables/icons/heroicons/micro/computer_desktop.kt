package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ComputerDesktop: ImageVector
    get() {
        if (_ComputerDesktop != null) return _ComputerDesktop!!
        
        _ComputerDesktop = ImageVector.Builder(
            name = "computer-desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 2f)
                horizontalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 14f, 4.25f)
                verticalLineToRelative(5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 11.75f, 12f)
                horizontalLineToRelative(-1.312f)
                curveToRelative(0.1f, 0.128f, 0.21f, 0.248f, 0.328f, 0.36f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.234f, 0.545f)
                verticalLineToRelative(0.345f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-0.345f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.234f, -0.545f)
                curveToRelative(0.118f, -0.111f, 0.228f, -0.232f, 0.328f, -0.36f)
                horizontalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 9.75f)
                verticalLineToRelative(-5.5f)
                close()
                moveToRelative(2.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }.build()
        
        return _ComputerDesktop!!
    }

private var _ComputerDesktop: ImageVector? = null

