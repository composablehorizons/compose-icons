package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Triangle: ImageVector
    get() {
        if (_Triangle != null) return _Triangle!!
        
        _Triangle = ImageVector.Builder(
            name = "triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.938f, 2.016f)
                arcTo(0.13f, 0.13f, 0f, false, true, 8.002f, 2f)
                arcToRelative(0.13f, 0.13f, 0f, false, true, 0.063f, 0.016f)
                arcToRelative(0.15f, 0.15f, 0f, false, true, 0.054f, 0.057f)
                lineToRelative(6.857f, 11.667f)
                curveToRelative(0.036f, 0.06f, 0.035f, 0.124f, 0.002f, 0.183f)
                arcToRelative(0.2f, 0.2f, 0f, false, true, -0.054f, 0.06f)
                arcToRelative(0.1f, 0.1f, 0f, false, true, -0.066f, 0.017f)
                horizontalLineTo(1.146f)
                arcToRelative(0.1f, 0.1f, 0f, false, true, -0.066f, -0.017f)
                arcToRelative(0.2f, 0.2f, 0f, false, true, -0.054f, -0.06f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, 0.002f, -0.183f)
                lineTo(7.884f, 2.073f)
                arcToRelative(0.15f, 0.15f, 0f, false, true, 0.054f, -0.057f)
                moveToRelative(1.044f, -0.45f)
                arcToRelative(1.13f, 1.13f, 0f, false, false, -1.96f, 0f)
                lineTo(0.165f, 13.233f)
                curveToRelative(-0.457f, 0.778f, 0.091f, 1.767f, 0.98f, 1.767f)
                horizontalLineToRelative(13.713f)
                curveToRelative(0.889f, 0f, 1.438f, -0.99f, 0.98f, -1.767f)
                close()
            }
        }.build()
        
        return _Triangle!!
    }

private var _Triangle: ImageVector? = null

