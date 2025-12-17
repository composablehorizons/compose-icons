package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Domain_add: ImageVector
    get() {
        if (_Domain_add != null) return _Domain_add!!
        
        _Domain_add = ImageVector.Builder(
            name = "domain_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 19f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(6f, 15f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(6f, 11f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(6f, 7f)
                    horizontalLineTo(4f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(10f, 19f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(10f, 15f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(10f, 11f)
                    horizontalLineTo(8f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(10f, 7f)
                    horizontalLineTo(8f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(16f, 19f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-9f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(3f)
                    curveTo(2.45f, 3f, 2f, 3.45f, 2f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(13f)
                    verticalLineTo(19f)
                    close()
                    moveTo(18f, 11f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(18f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(24f, 20f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    curveTo(23.55f, 19f, 24f, 19.45f, 24f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Domain_add!!
    }

private var _Domain_add: ImageVector? = null

