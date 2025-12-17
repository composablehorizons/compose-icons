package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) return _Hourglass!!
        
        _Hourglass = ImageVector.Builder(
            name = "hourglass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -2.557f, 4.06f)
                curveToRelative(-0.29f, 0.139f, -0.443f, 0.377f, -0.443f, 0.59f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 0.213f, 0.154f, 0.451f, 0.443f, 0.59f)
                arcTo(4.5f, 4.5f, 0f, false, true, 12.5f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.557f, -4.06f)
                curveToRelative(0.29f, -0.139f, 0.443f, -0.377f, 0.443f, -0.59f)
                verticalLineToRelative(-0.7f)
                curveToRelative(0f, -0.213f, -0.154f, -0.451f, -0.443f, -0.59f)
                arcTo(4.5f, 4.5f, 0f, false, true, 3.5f, 3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(2.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 1.989f, 3.158f)
                curveToRelative(0.533f, 0.256f, 1.011f, 0.791f, 1.011f, 1.491f)
                verticalLineToRelative(0.702f)
                curveToRelative(0f, 0.7f, -0.478f, 1.235f, -1.011f, 1.491f)
                arcTo(3.5f, 3.5f, 0f, false, false, 4.5f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1.989f, -3.158f)
                curveTo(8.978f, 9.586f, 8.5f, 9.052f, 8.5f, 8.351f)
                verticalLineToRelative(-0.702f)
                curveToRelative(0f, -0.7f, 0.478f, -1.235f, 1.011f, -1.491f)
                arcTo(3.5f, 3.5f, 0f, false, false, 11.5f, 3f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Hourglass!!
    }

private var _Hourglass: ImageVector? = null

