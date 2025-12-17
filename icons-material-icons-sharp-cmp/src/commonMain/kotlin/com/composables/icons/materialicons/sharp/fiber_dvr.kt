package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fiber_dvr: ImageVector
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
                moveTo(17.5f, 10.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-13f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 13.5f)
                curveToRelative(0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.85f, 0f, 1.5f, 0.65f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(4.62f, 1.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(9.37f, 9f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1f, 3.43f)
                lineToRelative(1f, -3.43f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-1.75f, 6f)
                close()
                moveTo(21f, 12.9f)
                horizontalLineToRelative(-0.9f)
                lineTo(21f, 15f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.85f, -2f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3.9f)
                close()
            }
        }.build()
        
        return _Fiber_dvr!!
    }

private var _Fiber_dvr: ImageVector? = null

