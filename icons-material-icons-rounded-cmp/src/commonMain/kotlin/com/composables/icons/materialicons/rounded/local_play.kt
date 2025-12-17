package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_play: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 12f)
                curveToRelative(0f, -0.76f, 0.43f, -1.42f, 1.06f, -1.76f)
                curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.89f, -1.99f, 1.99f)
                verticalLineToRelative(2.55f)
                curveToRelative(0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f)
                curveTo(3.58f, 10.58f, 4f, 11.24f, 4f, 12f)
                reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f)
                curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f)
                verticalLineToRelative(2.25f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f)
                curveToRelative(-0.63f, -0.34f, -1.06f, -1f, -1.06f, -1.76f)
                close()
                moveToRelative(-5.5f, 4.1f)
                lineTo(12f, 14.5f)
                lineToRelative(-2.5f, 1.61f)
                curveToRelative(-0.38f, 0.24f, -0.87f, -0.11f, -0.75f, -0.55f)
                lineToRelative(0.75f, -2.88f)
                lineToRelative(-2.3f, -1.88f)
                curveToRelative(-0.35f, -0.29f, -0.17f, -0.86f, 0.29f, -0.89f)
                lineToRelative(2.96f, -0.17f)
                lineToRelative(1.08f, -2.75f)
                curveToRelative(0.17f, -0.42f, 0.77f, -0.42f, 0.93f, 0f)
                lineToRelative(1.08f, 2.76f)
                lineToRelative(2.96f, 0.17f)
                curveToRelative(0.45f, 0.03f, 0.64f, 0.6f, 0.29f, 0.89f)
                lineToRelative(-2.3f, 1.88f)
                lineToRelative(0.76f, 2.86f)
                curveToRelative(0.12f, 0.45f, -0.37f, 0.8f, -0.75f, 0.55f)
                close()
            }
        }.build()
        
        return _Local_play!!
    }

private var _Local_play: ImageVector? = null

