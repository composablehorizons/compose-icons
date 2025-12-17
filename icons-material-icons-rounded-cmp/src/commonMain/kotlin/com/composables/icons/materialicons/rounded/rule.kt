package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rule: ImageVector
    get() {
        if (_Rule != null) return _Rule!!
        
        _Rule = ImageVector.Builder(
            name = "rule",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15.83f, 10.29f)
                    lineToRelative(-2.12f, -2.12f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(3.54f, -3.54f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-4.24f, 4.24f)
                    curveTo(16.85f, 10.68f, 16.22f, 10.68f, 15.83f, 10.29f)
                    close()
                    moveTo(10f, 7f)
                    horizontalLineTo(3f)
                    curveTo(2.45f, 7f, 2f, 7.45f, 2f, 8f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(7f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 7.45f, 10.55f, 7f, 10f, 7f)
                    close()
                    moveTo(20.29f, 12.71f)
                    lineTo(20.29f, 12.71f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineTo(17f, 14.59f)
                    lineToRelative(-1.88f, -1.88f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineTo(15.59f, 16f)
                    lineToRelative(-1.88f, 1.88f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineTo(17f, 17.41f)
                    lineToRelative(1.88f, 1.88f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(18.41f, 16f)
                    lineToRelative(1.88f, -1.88f)
                    curveTo(20.68f, 13.73f, 20.68f, 13.1f, 20.29f, 12.71f)
                    close()
                    moveTo(10f, 15f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(7f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 15.45f, 10.55f, 15f, 10f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Rule!!
    }

private var _Rule: ImageVector? = null

