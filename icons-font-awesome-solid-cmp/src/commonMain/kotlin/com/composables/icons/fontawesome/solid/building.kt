package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Building: ImageVector
    get() {
        if (_Building != null) return _Building!!
        
        _Building = ImageVector.Builder(
            name = "building",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(436f, 480f)
                horizontalLineToRelative(-20f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(56f)
                curveTo(42.745f, 0f, 32f, 10.745f, 32f, 24f)
                verticalLineToRelative(456f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                close()
                moveTo(128f, 76f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineTo(76f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(52f, 148f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
                moveToRelative(76f, 160f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-84f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(84f)
                close()
                moveToRelative(64f, -172f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineTo(76f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Building!!
    }

private var _Building: ImageVector? = null

