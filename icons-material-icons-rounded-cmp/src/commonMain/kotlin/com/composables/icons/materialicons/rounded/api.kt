package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Api: ImageVector
    get() {
        if (_Api != null) return _Api!!
        
        _Api = ImageVector.Builder(
            name = "api",
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
                    moveTo(13f, 13f)
                    lineTo(13f, 13f)
                    curveToRelative(-0.56f, 0.56f, -1.45f, 0.56f, -2f, 0.01f)
                    lineTo(11f, 13f)
                    curveToRelative(-0.55f, -0.55f, -0.55f, -1.44f, 0f, -1.99f)
                    lineTo(11f, 11f)
                    curveToRelative(0.55f, -0.55f, 1.44f, -0.55f, 1.99f, 0f)
                    lineTo(13f, 11f)
                    curveTo(13.55f, 11.55f, 13.55f, 12.45f, 13f, 13f)
                    close()
                    moveTo(12f, 6f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(2.5f, -2.5f)
                    lineToRelative(-3.2f, -3.2f)
                    curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                    lineToRelative(-3.2f, 3.2f)
                    lineToRelative(2.5f, 2.5f)
                    lineTo(12f, 6f)
                    close()
                    moveTo(6f, 12f)
                    lineToRelative(2.12f, -2.12f)
                    lineToRelative(-2.5f, -2.5f)
                    lineToRelative(-3.2f, 3.2f)
                    curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                    lineToRelative(3.2f, 3.2f)
                    lineToRelative(2.5f, -2.5f)
                    lineTo(6f, 12f)
                    close()
                    moveTo(18f, 12f)
                    lineToRelative(-2.12f, 2.12f)
                    lineToRelative(2.5f, 2.5f)
                    lineToRelative(3.2f, -3.2f)
                    curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                    lineToRelative(-3.2f, -3.2f)
                    lineToRelative(-2.5f, 2.5f)
                    lineTo(18f, 12f)
                    close()
                    moveTo(12f, 18f)
                    lineToRelative(-2.12f, -2.12f)
                    lineToRelative(-2.5f, 2.5f)
                    lineToRelative(3.2f, 3.2f)
                    curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                    lineToRelative(3.2f, -3.2f)
                    lineToRelative(-2.5f, -2.5f)
                    lineTo(12f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Api!!
    }

private var _Api: ImageVector? = null

