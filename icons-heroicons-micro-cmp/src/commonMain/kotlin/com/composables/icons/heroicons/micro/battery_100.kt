package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Battery100: ImageVector
    get() {
        if (_Battery100 != null) return _Battery100!!
        
        _Battery100 = ImageVector.Builder(
            name = "battery-100",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 7.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4.75f, 7f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-5.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4f, 8.25f)
                verticalLineToRelative(-0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.25f, 4f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 6.25f)
                verticalLineToRelative(3.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.25f, 12f)
                horizontalLineToRelative(8.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 14f, 9.75f)
                verticalLineToRelative(-0.085f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1f, -1.415f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1f, -1.415f)
                verticalLineTo(6.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 11.75f, 4f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(2.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.build()
        
        return _Battery100!!
    }

private var _Battery100: ImageVector? = null

