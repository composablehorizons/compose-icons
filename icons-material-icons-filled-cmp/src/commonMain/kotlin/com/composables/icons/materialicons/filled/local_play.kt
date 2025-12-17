package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Local_play: ImageVector
    get() {
        if (_Local_play != null) return _Local_play!!
        
        _Local_play = ImageVector.Builder(
            name = "local_play",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 1.99f, 0.9f, 1.99f, 2f)
                reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveToRelative(-4.42f, 4.8f)
                lineTo(12f, 14.5f)
                lineToRelative(-3.58f, 2.3f)
                lineToRelative(1.08f, -4.12f)
                lineToRelative(-3.29f, -2.69f)
                lineToRelative(4.24f, -0.25f)
                lineTo(12f, 5.8f)
                lineToRelative(1.54f, 3.95f)
                lineToRelative(4.24f, 0.25f)
                lineToRelative(-3.29f, 2.69f)
                lineToRelative(1.09f, 4.11f)
                close()
            }
        }.build()
        
        return _Local_play!!
    }

private var _Local_play: ImageVector? = null

