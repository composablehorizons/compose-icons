package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Download_done: ImageVector
    get() {
        if (_Download_done != null) return _Download_done!!
        
        _Download_done = ImageVector.Builder(
            name = "download_done",
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
                moveTo(6f, 18f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(5.01f, -4.1f)
                curveToRelative(-0.78f, 0.77f, -2.04f, 0.77f, -2.82f, -0.01f)
                lineTo(6f, 11.7f)
                curveToRelative(-0.55f, -0.55f, -0.54f, -1.44f, 0.03f, -1.97f)
                curveToRelative(0.54f, -0.52f, 1.4f, -0.5f, 1.92f, 0.02f)
                lineTo(9.6f, 11.4f)
                lineToRelative(6.43f, -6.43f)
                curveToRelative(0.54f, -0.54f, 1.41f, -0.54f, 1.95f, 0f)
                lineToRelative(0.04f, 0.04f)
                curveToRelative(0.54f, 0.54f, 0.54f, 1.42f, -0.01f, 1.96f)
                lineToRelative(-7f, 6.93f)
                close()
            }
        }.build()
        
        return _Download_done!!
    }

private var _Download_done: ImageVector? = null

