package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Browser_updated: ImageVector
    get() {
        if (_Browser_updated != null) return _Browser_updated!!
        
        _Browser_updated = ImageVector.Builder(
            name = "browser_updated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.89f, 0f, 1.34f, 1.08f, 0.71f, 1.71f)
                lineToRelative(-2.59f, 2.59f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.59f, -2.59f)
                curveTo(11.08f, 11.08f, 11.52f, 10f, 12.41f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                curveTo(14f, 3.45f, 14.45f, 3f, 15f, 3f)
                close()
                moveTo(6f, 19.59f)
                curveTo(6f, 20.37f, 6.63f, 21f, 7.41f, 21f)
                horizontalLineToRelative(9.17f)
                curveToRelative(0.78f, 0f, 1.41f, -0.63f, 1.41f, -1.41f)
                curveToRelative(0f, -0.72f, -0.44f, -1.03f, -1f, -1.59f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                lineToRelative(7f, 0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(4f, 3f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveTo(6.45f, 18.55f, 6f, 18.87f, 6f, 19.59f)
                close()
            }
        }.build()
        
        return _Browser_updated!!
    }

private var _Browser_updated: ImageVector? = null

