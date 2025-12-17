package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Battery50: ImageVector
    get() {
        if (_Battery50 != null) return _Battery50!!
        
        _Battery50 = ImageVector.Builder(
            name = "battery-50",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 6.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 4f)
                horizontalLineToRelative(8.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 14f, 6.25f)
                verticalLineToRelative(0.085f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1f, 1.415f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1f, 1.415f)
                verticalLineToRelative(0.085f)
                arcTo(2.25f, 2.25f, 0f, false, true, 11.75f, 12f)
                horizontalLineToRelative(-8.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 9.75f)
                verticalLineToRelative(-3.5f)
                close()
                moveToRelative(2.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 6.75f, 7f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Battery50!!
    }

private var _Battery50: ImageVector? = null

