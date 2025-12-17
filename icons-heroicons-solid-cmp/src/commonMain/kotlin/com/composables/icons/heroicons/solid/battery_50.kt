package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Battery50: ImageVector
    get() {
        if (_Battery50 != null) return _Battery50!!
        
        _Battery50 = ImageVector.Builder(
            name = "battery-50",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(15f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(6.75f)
                arcTo(0.75f, 0.75f, 0f, false, false, 12f, 15f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 6.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-0.037f)
                curveToRelative(0.856f, -0.174f, 1.5f, -0.93f, 1.5f, -1.838f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0f, -0.907f, -0.644f, -1.664f, -1.5f, -1.837f)
                verticalLineTo(9.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-15f)
                close()
                moveToRelative(15f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                close()
            }
        }.build()
        
        return _Battery50!!
    }

private var _Battery50: ImageVector? = null

