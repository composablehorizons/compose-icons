package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fiber_dvr: ImageVector
    get() {
        if (_Fiber_dvr != null) return _Fiber_dvr!!
        
        _Fiber_dvr = ImageVector.Builder(
            name = "fiber_dvr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.87f, 12.43f)
                lineToRelative(-1f, -3.43f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(1.75f, 6f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1.75f, -6f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(21f, 11.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.85f, -0.65f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.15f)
                lineToRelative(0.85f, 2f)
                horizontalLineTo(21f)
                lineToRelative(-0.9f, -2.1f)
                curveToRelative(0.5f, -0.25f, 0.9f, -0.8f, 0.9f, -1.4f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
                moveTo(6.5f, 9f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.85f, 0f, 1.5f, -0.65f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveTo(8f, 9.65f, 7.35f, 9f, 6.5f, 9f)
                close()
                moveToRelative(0f, 4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Fiber_dvr!!
    }

private var _Fiber_dvr: ImageVector? = null

