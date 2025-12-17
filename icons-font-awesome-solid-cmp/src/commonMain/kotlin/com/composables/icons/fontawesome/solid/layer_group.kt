package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LayerGroup: ImageVector
    get() {
        if (_LayerGroup != null) return _LayerGroup!!
        
        _LayerGroup = ImageVector.Builder(
            name = "layer-group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.41f, 148.02f)
                lineToRelative(232.94f, 105.67f)
                curveToRelative(6.8f, 3.09f, 14.49f, 3.09f, 21.29f, 0f)
                lineToRelative(232.94f, -105.67f)
                curveToRelative(16.55f, -7.51f, 16.55f, -32.52f, 0f, -40.03f)
                lineTo(266.65f, 2.31f)
                arcToRelative(25.607f, 25.607f, 0f, false, false, -21.29f, 0f)
                lineTo(12.41f, 107.98f)
                curveToRelative(-16.55f, 7.51f, -16.55f, 32.53f, 0f, 40.04f)
                close()
                moveToRelative(487.18f, 88.28f)
                lineToRelative(-58.09f, -26.33f)
                lineToRelative(-161.64f, 73.27f)
                curveToRelative(-7.56f, 3.43f, -15.59f, 5.17f, -23.86f, 5.17f)
                reflectiveCurveToRelative(-16.29f, -1.74f, -23.86f, -5.17f)
                lineTo(70.51f, 209.97f)
                lineToRelative(-58.1f, 26.33f)
                curveToRelative(-16.55f, 7.5f, -16.55f, 32.5f, 0f, 40f)
                lineToRelative(232.94f, 105.59f)
                curveToRelative(6.8f, 3.08f, 14.49f, 3.08f, 21.29f, 0f)
                lineTo(499.59f, 276.3f)
                curveToRelative(16.55f, -7.5f, 16.55f, -32.5f, 0f, -40f)
                close()
                moveToRelative(0f, 127.8f)
                lineToRelative(-57.87f, -26.23f)
                lineToRelative(-161.86f, 73.37f)
                curveToRelative(-7.56f, 3.43f, -15.59f, 5.17f, -23.86f, 5.17f)
                reflectiveCurveToRelative(-16.29f, -1.74f, -23.86f, -5.17f)
                lineTo(70.29f, 337.87f)
                lineTo(12.41f, 364.1f)
                curveToRelative(-16.55f, 7.5f, -16.55f, 32.5f, 0f, 40f)
                lineToRelative(232.94f, 105.59f)
                curveToRelative(6.8f, 3.08f, 14.49f, 3.08f, 21.29f, 0f)
                lineTo(499.59f, 404.1f)
                curveToRelative(16.55f, -7.5f, 16.55f, -32.5f, 0f, -40f)
                close()
            }
        }.build()
        
        return _LayerGroup!!
    }

private var _LayerGroup: ImageVector? = null

